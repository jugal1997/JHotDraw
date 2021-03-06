/*
 * @(#)FiguresSuite.java
 *
 * Project:     JHotdraw - a GUI framework for technical drawings
 *              http://www.jhotdraw.org
 *              http://jhotdraw.sourceforge.net
 * Copyright:   ? by the original author(s) and all contributors
 * License:     Lesser GNU Public License (LGPL)
 *              http://www.opensource.org/licenses/lgpl-license.html
 */
package org.jhotdraw.test.figures;

import junit.framework.TestSuite;
// JUnitDoclet begin import
// JUnitDoclet end import

/*
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/

// JUnitDoclet begin javadoc_class
/**
* TestSuite FiguresSuite
*/
// JUnitDoclet end javadoc_class
public class FiguresSuite
// JUnitDoclet begin extends_implements
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// JUnitDoclet end class

	public static TestSuite suite() {

		TestSuite suite;

		suite = new TestSuite("org.jhotdraw.test.figures");

		suite.addTestSuite(org.jhotdraw.test.figures.NullConnectorTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.NullFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.UngroupCommandTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.ShortestDistanceConnectorTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.ScribbleToolTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.RectangleFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.RoundRectangleFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.PolyLineHandleTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.PolyLineConnectorTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.NumberTextFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.LineFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.InsertImageCommandTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.ImageFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.GroupFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.GroupCommandTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.FontSizeHandleTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.EllipseFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.ElbowHandleTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.ElbowConnectionTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.TextToolTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.ConnectedTextToolTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.ChopEllipseConnectorTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.BorderToolTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.BorderDecoratorTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.ArrowTipTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.FigureAttributesTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.TextFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.PolyLineFigureTest.class);
		suite.addTestSuite(org.jhotdraw.test.figures.LineConnectionTest.class);

		// JUnitDoclet begin method suite()
		// JUnitDoclet end method suite()

		return suite;
	}

	/**
	* Method to execute the TestSuite from command line
	* using JUnit's textui.TestRunner .
	*/
	public static void main(String[] args) {
		// JUnitDoclet begin method testsuite.main
		junit.textui.TestRunner.run(suite());
		// JUnitDoclet end method testsuite.main
	}
}
