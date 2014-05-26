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
package org.splevo.jamopp.vpm.analyzer.programdependency.tests;

import static org.splevo.jamopp.vpm.analyzer.programdependency.tests.TestUtil.assertDependency;
import static org.splevo.jamopp.vpm.analyzer.programdependency.tests.TestUtil.assertNodeCount;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.splevo.jamopp.vpm.analyzer.programdependency.references.DependencyType;
import org.splevo.vpm.analyzer.VPMAnalyzerResult;
import org.splevo.vpm.analyzer.graph.VPMGraph;

/**
 * Unit test to prove the dependency analysis using the extended Robillard dependency selector mode.
 *
 * <strong>Note:</strong><br>
 * The test is derived from the basic robillard selector test as it must pass the same tests with
 * the analyzer configured in extended mode. For this, it also overwrites the analyzer
 * initialization.
 *
 * The extended mode must pass the same tests as the basic Robillard test plus additional types of
 * dependencies.
 */
public class RobillardExtendedSelectorTest extends RobillardSelectorTest {

    private static final String BASE_PATH_EXTENDED = "testcode/robillardExtended/";

    /**
     * Prepare the test. Initializes a log4j logging environment.
     */
    @BeforeClass
    public static void setUpInfrastructure() {
        TestUtil.initLogging();
    }

    /**
     * Setup the analyzer in the extended mode.
     */
    @Before
    @Override
    public void setUpAnalyzer() {
        analyzer = TestUtil.configureRobillardAnalyzer(true, false);
    }

    /**
     * Test the dependency detection between a field and an class import declaration.
     *
     * @throws Exception
     *             Identifies a failed processing.
     */
    @Test
    public void testFieldImportClass() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "FieldImportClass/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 3);
        assertDependency(result, DependencyType.FieldImportClass, 2);
    }

    /**
     * Test the dependency detection between a field and an enumeration import declaration.
     *
     * @throws Exception
     *             Identifies a failed processing.
     */
    @Test
    public void testFieldImportEnumeration() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "FieldImportEnumeration/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 3);
        assertDependency(result, DependencyType.FieldImportEnumeration, 2);
    }

    /**
     * Test the dependency detection between a field and an interface import declaration.
     *
     * @throws Exception
     *             Identifies a failed processing.
     */
    @Test
    public void testFieldImportInterface() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "FieldImportInterface/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 2);
        assertDependency(result, DependencyType.FieldImportInterface, 1);
    }

    /**
     * Test method to detect changes in the class and package declarations.
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementChecksInterfaceInstanceOf() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementChecksInterface/InstanceOf/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 2);
        assertDependency(result, DependencyType.StatementChecksInterface, 1);
    }

    /**
     * Test to detect dependencies between statements and an import declaration referring to the
     * same type.
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementReadsVariable() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementReadsVariable/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 8);
        assertDependency(result, DependencyType.StatementReadsVariable, 4);
    }

    /**
     * Test method writing a new value to a variable.
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementWritesVariable() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementWritesVariable/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 4);
        assertDependency(result, DependencyType.StatementWritesVariable, 2);
    }

    /**
     * Test statements modifying variables (regular and additional variables).
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementModifiesField() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementModifiesField/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 4);
        assertDependency(result, DependencyType.StatementModifiesField, 2);
    }

    /**
     * Test statements modifying variables (regular and additional variables).
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementModifiesVariable() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementModifiesVariable/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 8);
        assertDependency(result, DependencyType.StatementModifiesVariable, 4);
    }

    /**
     * Test to detect dependencies between method signature and an import declaration referring to
     * the same type.
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementImportInterface() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementImportInterface/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 2);
        assertDependency(result, DependencyType.StatementImportInterface, 1);
    }

    /**
     * Test to detect dependencies between method signature and an import declaration referring to
     * the same type.
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementImportClass() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementImportClass/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 2);
        assertDependency(result, DependencyType.StatementImportClass, 1);
    }

    /**
     * Test to detect dependencies between method signature and an import declaration referring to
     * the same type.
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementImportEnumeration() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementImportEnumeration/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 2);
        assertDependency(result, DependencyType.StatementImportEnumeration, 1);
    }

    /**
     * Test to detect dependency between a new interface and a cast to it.
     *
     * @throws Exception
     *             Identifies a failed diffing.
     */
    @Test
    public void testStatementChecksInterfaceCast() throws Exception {

        VPMGraph graph = TestUtil.prepareVPMGraph(BASE_PATH_EXTENDED + "StatementChecksInterface/Cast/");
        VPMAnalyzerResult result = analyzer.analyze(graph);

        assertNodeCount(graph, 2);
        assertDependency(result, DependencyType.StatementChecksInterface, 1);
    }
}
