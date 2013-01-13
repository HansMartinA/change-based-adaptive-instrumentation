package org.splevo.diffing.emfcompare.diff;

import org.eclipse.emf.compare.match.metamodel.UnmatchElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.TextElement;
import org.eclipse.gmt.modisco.java.emf.util.JavaSwitch;
import org.splevo.diffing.emfcompare.util.PackageIgnoreChecker;

/**
 * Filter to check if an UnmatchElement should be filtered or not.
 */
public class UnmatchedElementFilter {

    /** The package ignore checker to use. */
    private PackageIgnoreChecker packageIgnoreChecker = null; 
    
    /** The element switch to work with. */
    private FilterSwitch filterSwitch = new FilterSwitch();

    /**
     * Filter requiring the packages to ignore to be set.
     * 
     * @param packageIgnoreChecker
     *            The checker to prove for packages to ignore.
     */
    public UnmatchedElementFilter(PackageIgnoreChecker packageIgnoreChecker) {
        super();
        this.packageIgnoreChecker = packageIgnoreChecker;
    }

    /**
     * Check the element the unmatch element is about.
     * 
     * @param unmatchElement
     *            the unmatch element to check
     * @return The result whether to filter out or not.
     */
    public Boolean filter(UnmatchElement unmatchElement) {
        return filterSwitch.doSwitch(unmatchElement.getElement());
    }

    /**
     * The internal switch to check the unmatch element filtering according to the model element the
     * unmatch element is about. It is based on the emf switch utilitiy class for the modisco java
     * model.
     * 
     */
    private class FilterSwitch extends JavaSwitch<Boolean> {

        /**
         * Decide to always filter text elements. {@inheritDoc}
         */
        @Override
        public Boolean caseTextElement(TextElement object) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean caseSingleVariableDeclaration(SingleVariableDeclaration object) {

            Boolean result = packageIgnoreChecker.isInIgnorePackage(object.eContainer());
            if (result != null) {
                return result;
            }

            return super.caseSingleVariableDeclaration(object);
        }

        @Override
        public Boolean defaultCase(EObject object) {
            return Boolean.FALSE;
        }

    }
}
