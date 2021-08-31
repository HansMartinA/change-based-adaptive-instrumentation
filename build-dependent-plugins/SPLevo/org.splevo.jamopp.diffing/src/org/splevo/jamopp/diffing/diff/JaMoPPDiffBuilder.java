/*******************************************************************************
 * Copyright (c) 2014
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Benjamin Klatt - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.splevo.jamopp.diffing.diff;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.modifiers.Final;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.PackageReference;
import org.emftext.language.java.statements.CatchBlock;
import org.emftext.language.java.statements.NormalSwitchCase;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.variables.AdditionalLocalVariable;
import org.emftext.language.java.variables.Variable;
import org.splevo.jamopp.diffing.scope.PackageIgnoreChecker;

/**
 * Diff builder / DiffProcessor specific for the JaMoPP Java model.
 *
 * Main purpose of this builder is to filter invalid move changes and produce custom diffs for
 * directly identifiable.
 */
public class JaMoPPDiffBuilder extends DiffBuilder {

    /** The logger for this class. */
    private Logger logger = Logger.getLogger(JaMoPPDiffBuilder.class);

    /** The factory to create custom changes. */
    private JaMoPPChangeFactory customChangeFactory = new JaMoPPChangeFactory();

    /** A cache to prevent duplicate changes for a single element. */
    private Map<EObject, Diff> changeCache = new LinkedHashMap<EObject, Diff>();

    /** A cache for added and deleted element diffs. */
    private Map<EObject, Diff> addDeleteCache = new LinkedHashMap<EObject, Diff>();

    private List<EObject> resourceAttachementRegistry = new ArrayList<EObject>();

    /** To check if an element is referenced that should be ignored. */
    private PackageIgnoreChecker packageIgnoreChecker = null;

    /**
     * Constructor to set required dependencies.
     *
     * @param packageIgnoreChecker
     *            The checker if an element is located in a package to ignore.
     */
    public JaMoPPDiffBuilder(PackageIgnoreChecker packageIgnoreChecker) {
        this.packageIgnoreChecker = packageIgnoreChecker;
    }

    /**
     * Resource attachment changes are ignored to prevent errors because of unmatched resources.<br>
     * {@inheritDoc}
     */
    @Override
    public void resourceAttachmentChange(Match match, String uri, DifferenceKind kind, DifferenceSource source) {

        EObject changedElement = null;
        if (match.getLeft() != null) {
            changedElement = match.getLeft();
        } else {
            changedElement = match.getRight();
        }

        if (packageIgnoreChecker.isInIgnorePackage(changedElement)) {
            logger.warn("Element to ignore: " + changedElement);
        }

        // TODO Remove temporarily Filter when JaMoPP behavior fixed.
        // CompilationUnits should either be contained in packages or root
        // elements but not both.
        // Such issues exist because of elements stored under the model root and
        // as containment of another root element by the JaMoPP Parser.
        // For example CompilationUnits are at the root and inside packages.
        // DevBoost is notified about this.
        if (resourceAttachementRegistry.contains(changedElement)) {
            logger.info("Ressource Attachement Change hit twice: " + changedElement);
            return;
        }

        Diff change = customChangeFactory.doSwitch(changedElement);
        if (change != null) {
            fillStandardFields(change, match, kind, source);
            resourceAttachementRegistry.add(changedElement);
            return;
        }

        logger.info("Unhandled Resource Attachment Change (" + kind + ") : left: " + match.getLeft() + ", right: "
                + match.getRight() + ", source: " + source);
    }

    /**
     * Reference changes. New or deleted model elements are identified by changed containment
     * references.
     *
     * {@inheritDoc}
     */
    @Override
    public void referenceChange(Match match, EReference reference, EObject value, DifferenceKind kind,
            DifferenceSource source) {

        // a changed default extends relationship is always
        // coupled with another change. As the default extends is implicit, a change to it must not
        // be made explicit.
        if ("defaultExtends".equals(reference.getName())) {
            return;
        }

        // handle containment changes as typical ADD / DELETE cases for
        // custom elements.
        if (reference.isContainment()) {
            if (addDeleteCache.containsKey(value)) {
                return;
            }
            Diff change = customChangeFactory.doSwitch(value);
            if (change != null) {
                fillStandardFields(change, match, kind, source);
                addDeleteCache.put(value, change);
                return;
            }
        }

        if (value instanceof EnumConstant || value instanceof Expression
                || value instanceof org.emftext.language.java.classifiers.Class || value instanceof Interface
                || value instanceof Method || value instanceof Constructor || value instanceof Variable
                || value instanceof AdditionalLocalVariable || value instanceof ClassifierReference
                || value instanceof Final || value instanceof CatchBlock
                || value instanceof NamespaceClassifierReference || value instanceof PackageReference
                || value instanceof IdentifierReference || value instanceof PrimitiveType || value instanceof NormalSwitchCase) {
            Match nextParent = nextResonableMatch(match);
            if (nextParent != null) {
                EObject parentObject = null;
                if (nextParent.getLeft() != null) {
                    parentObject = nextParent.getLeft();
                } else if (nextParent.getRight() != null) {
                    parentObject = nextParent.getRight();
                }

                if (!changeRegisteredBefore(parentObject)) {
                    Diff change = customChangeFactory.doSwitch(parentObject);
                    fillStandardFields(change, nextParent, DifferenceKind.CHANGE, source);
                    changeCache.put(parentObject, change);
                }
                return;
            }
        }

        logger.info("Unhandled Reference Change (" + kind + ") :" + reference.getName() + ", left: " + match.getLeft()
                + ", right: " + match.getRight() + ", value: " + value);
    }

    @Override
    public void attributeChange(Match match, EAttribute attribute, Object value, DifferenceKind kind,
            DifferenceSource source) {

        logger.info("Attribute Change (" + kind + ") :" + attribute.getName() + ", left: " + match.getLeft()
                + ", right: " + match.getRight() + ", value: " + value);
        super.attributeChange(match, attribute, value, kind, source);
    }

    /**
     * Check a match if it is reasonable as parent for a change or get the next reasonable of its
     * parent matches.
     *
     * @param match
     *            The match to check.
     * @return The next reasonable match or null if none exists.
     */
    private Match nextResonableMatch(Match match) {

        if (match == null) {
            return null;
        }

        EObject parentObject = null;
        if (match.getLeft() != null) {
            parentObject = match.getLeft();
        } else {
            parentObject = match.getRight();
        }

        if (parentObject instanceof org.emftext.language.java.classifiers.Class) {
            return match;
        } else if (parentObject instanceof Field) {
            return match;
        } else if (parentObject instanceof Method) {
            return match;
        } else if (parentObject instanceof Constructor) {
            return match;
        } else if (parentObject instanceof Package) {
            return match;
        } else if (parentObject instanceof Enumeration) {
            return match;
        } else if (parentObject instanceof Import) {
            return match;
        } else if (parentObject instanceof Statement) {
            return match;
        }

        if (match.eContainer() instanceof Match) {
            return nextResonableMatch((Match) match.eContainer());
        } else {
            return null;
        }

    }

    /**
     * Create a diff for a single side match element if not created before for this model element.
     *
     * As the match is assumed to represent a root match element, the diff is stored in the match
     * element itself.
     *
     * @param match
     *            The match element to process and store the diff in.
     */
    public void createRootDiff(Match match) {
        if (match.getLeft() == null) {
            EObject value = match.getRight();
            if (changeRegisteredBefore(value)) {
                return;
            }
            Diff diff = customChangeFactory.doSwitch(value);
            diff.setSource(DifferenceSource.RIGHT);
            diff.setKind(DifferenceKind.DELETE);
            diff.setMatch(match);
            changeCache.put(value, diff);
        } else {
            EObject value = match.getLeft();
            if (changeRegisteredBefore(value)) {
                return;
            }
            Diff diff = customChangeFactory.doSwitch(value);
            diff.setSource(DifferenceSource.LEFT);
            diff.setKind(DifferenceKind.ADD);
            diff.setMatch(match);
            changeCache.put(value, diff);
        }
    }

    private boolean changeRegisteredBefore(EObject value) {

        // TODO Remove temporarily Filter when JaMoPP behavior fixed.
        // CompilationUnits should either be contained in packages or root
        // elements but not both.
        // Such issues exist because of elements stored under the model root and
        // as containment of another root element by the JaMoPP Parser.
        // For example CompilationUnits are at the root and inside packages.
        // DevBoost is notified about this.
        if (resourceAttachementRegistry.contains(value)) {
            logger.debug("Ressource Attachement Change hit twice: " + value);
            return true;
        }

        return changeCache.containsKey(value);
    }

    /**
     * Convenience method to fill the standard fields.
     *
     * @param diff
     *            The diff to change.
     * @param match
     *            The match element to set.
     * @param kind
     *            The kind to set.
     * @param source
     *            The source to set.
     */
    private void fillStandardFields(Diff diff, Match match, DifferenceKind kind, DifferenceSource source) {
        diff.setKind(kind);
        diff.setMatch(match);
        diff.setSource(source);
    }
}
