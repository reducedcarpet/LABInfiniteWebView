package net.firestaff.mcp.baselab.shapes.util;

import net.firestaff.mcp.baselab.shapes.*;
import net.firestaff.mcp.baselab.shapes.complex.*;
import net.firestaff.mcp.baselab.shapes.gridtracing.*;
import net.firestaff.mcp.baselab.shapes.paused.PausedFullComplexShape;
import net.firestaff.mcp.baselab.shapes.paused.PausedHalfCapComplexShape;
import net.firestaff.mcp.baselab.shapes.paused.PausedHalfComplexShape;
import net.firestaff.mcp.baselab.shapes.paused.PausedQuarterComplexShape;
import net.firestaff.mcp.baselab.shapes.secondorder.*;
import net.firestaff.mcp.baselab.shapes.weird.HCircle;
import net.firestaff.mcp.baselab.shapes.weird.HCircleFig8;
import net.firestaff.mcp.baselab.shapes.weird.HCurve;
import net.firestaff.mcp.baselab.shapes.weird.HCurveFig8;
import net.firestaff.mcp.baselab.shapes.weird.HLine;
import net.firestaff.mcp.baselab.shapes.weird.HLineFig8;
import net.firestaff.mcp.baselab.shapes.weird.Plus;
import net.firestaff.mcp.baselab.shapes.weird.PlusCorner;
import net.firestaff.mcp.baselab.shapes.weird.PlusHalf;
import net.firestaff.mcp.baselab.shapes.weird.PlusHalfCAP;
import net.firestaff.mcp.baselab.shapes.complex.CornerComplexShape;

import java.util.ArrayList;
import java.util.List;

public interface ShapeConstants {

    Shape POINT = new Dot();

    Shape CIRCLE = new Circle();
    Shape OVAL = new Oval();
    Shape SQUARE = new Square();

    Shape LINE = new Line();
    Shape VERTICAL_LINE = new Line(true);
    Shape HORIZONTAL_LINE = new Line();
    Shape PLUS_CORNER = new PlusCorner();
    Shape PLUS = new Plus();
    Shape PLUS_HALF = new PlusHalf();
    Shape PLUS_HALF_CAP = new PlusHalfCAP();

    Shape ULTIMATE = new UltimateComplexShape();

    Shape CORNER = new CornerComplexShape();

    Shape HYPOCYCLOID = new HypocycloidReal();
    Shape HYPOCYCLOID_FAKE = new HypocycloidFake();
    Shape HYPOCYCLOID_ONE = new HypocycloidOne();
    Shape HYPOCYCLOID_TWO = new HypocycloidTwo();

    Shape EPICYCLOID = new Epicycloid();
    Shape EPICYCLOID_ONE = new EpicycloidOne();
    Shape EPICYCLOID_TWO = new EpicycloidTwo();
    Shape EPICYCLOID_THREE = new EpicycloidThree();
    Shape EPICYCLOID_FIVE = new EpicycloidFive();
    Shape EPICYCLOID_SIX = new EpicycloidSix();
    Shape EPICYCLOID_SEVEN = new EpicycloidSeven();
    Shape EPICYCLOID_EIGHT = new EpicycloidEight();

    Shape EPITROCHOID = new Epitrochoid();
    Shape EPITROCHOID_ONE = new EpitrochoidOne();
    Shape EPITROCHOID_TWO = new EpitrochoidTwo();
    Shape EPITROCHOID_THREE = new EpitrochoidThree();
    Shape EPITROCHOID_FIVE = new EpitrochoidFive();
    Shape EPITROCHOID_SIX = new EpitrochoidSix();
    Shape EPITROCHOID_SEVEN = new EpitrochoidSeven();
    Shape EPITROCHOID_EIGHT = new EpitrochoidEight();

    Shape HYPOTROCHOID = new Hypotrochoid();
    Shape HYPOTROCHOID_ONE = new HypotrochoidOne();
    Shape HYPOTROCHOID_TWO = new HypotrochoidTwo();
    Shape HYPOTROCHOID_THREE = new HypotrochoidThree();
    Shape HYPOTROCHOID_FIVE = new HypotrochoidFive();
    Shape HYPOTROCHOID_SIX = new HypotrochoidSix();
    Shape HYPOTROCHOID_SEVEN = new HypotrochoidSeven();
    Shape HYPOTROCHOID_EIGHT = new HypotrochoidEight();

    Shape TRIANGLE = new HypocycloidTriangle();
    Shape PENTAGON = new HypocycloidFive();
    Shape OCTAGON = new HypocycloidSix();

    Shape HYPOCYCLOID_SEVEN = new HypocycloidSeven();
    Shape HYPOCYCLOID_EIGHT = new HypocycloidEight();

    Shape H_LINE = new HLine();
    Shape H_LINE_FIG8 = new HLineFig8();
    Shape H_CURVE = new HCurve();
    Shape H_CURVE_FIG8 = new HCurveFig8();
    Shape H_CIRCLE = new HCircle();
    Shape H_CIRCLE_FIG8 = new HCircleFig8();

    Shape PAUSED_FULL_CIRCLE = new PausedFullComplexShape();
    Shape PAUSED_HALF_CIRCLE = new PausedHalfComplexShape();
    Shape PAUSED_QUARTER_CIRCLE = new PausedQuarterComplexShape();

    //public static final Shape PAUSED_FULL_CIRCLE = new PausedFullComplexShape();
    Shape PAUSED_HALF_CAP = new PausedHalfCapComplexShape();
    //public static final Shape PAUSED_QUARTER_CIRCLE = new PausedQuarterComplexShape();

    Shape FULL_CIRCLE = new FullComplexShape();

    Shape HALF_CIRCLE_HORIZONTAL_TOP = new HalfHorizontalTopComplexShape();
    Shape HALF_CIRCLE_HORIZONTAL_BOTTOM = new HalfHorizontalBottomComplexShape();
    Shape HALF_CIRCLE_VERTICAL_LEFT = new HalfVerticalLeftComplexShape();
    Shape HALF_CIRCLE_VERTICAL_RIGHT = new HalfVerticalRightComplexShape();

    Shape LISSAJOUS_FIGURE = new LissajousCurve();
    Shape FIGURE_OF_EIGHT = new FigureEight();
    Shape FIGURE_OF_EIGHT_COMPLEX_SHAPE = new FigureEightComplexShape();
    Shape FIGURE_OF_EIGHT_BROKEN_COMPLEX_SHAPE = new FigureEightBrokenComplexShape();
    Shape FIGURE_OF_EIGHT_CAP_HIGH_COMPLEX_SHAPE = new FigureEightCAPOneComplexShape();
    Shape FIGURE_OF_EIGHT_CAP_LOW_COMPLEX_SHAPE = new FigureEightCAPTwoComplexShape();

    Shape QUARTERS_TOP_LEFT = new QuarterTopLeftComplexShape();
    Shape QUARTERS_TOP_RIGHT = new QuarterTopRightComplexShape();
    Shape QUARTERS_BOTTOM_LEFT = new QuarterBottomLeftComplexShape();
    Shape QUARTERS_BOTTOM_RIGHT = new QuarterBottomRightComplexShape();

    Shape TRANSLATED_HALF_COMPLEX_SHAPE = new TranslatedHalfComplexShape();
    Shape TRANSLATED_QUARTER_COMPLEX_SHAPE = new TranslatedQuarterComplexShape();
    Shape TRANSLATED_HALF_BROKEN_COMPLEX_SHAPE = new TranslatedHalfBrokenComplexShape();
    Shape TRANSLATED_QUARTER_BROKEN_COMPLEX_SHAPE = new TranslatedQuarterBrokenComplexShape();
    Shape TRANSLATED_QUARTER_HALFED_COMPLEX_SHAPE = new TranslatedQuarterHalfedComplexShape();
    Shape TRANSLATED_DIAGONAL_COMPLEX_SHAPE = new TranslatedDiagonalComplexShape();
    Shape TRANSLATED_CORNER_COMPLEX_SHAPE = new TranslatedCornerComplexShape();

    ComplexShape SQUISH_X_COMPLEX_SHAPE = new SquishXComplexShape();
    ComplexShape SQUISH_Y_COMPLEX_SHAPE = new SquishYComplexShape();
    ComplexShape QUARTER_STEPPED_COMPLEX_SHAPE = new QuarterSteppedComplexShape();
    ComplexShape STEPPED_QUARTER_CAP_COMPLEX_SHAPE = new SteppedQuarterCAPComplexShape();
    ComplexShape DOUBLE_STEPPED_QUARTER_CAP_COMPLEX_SHAPE = new DoubleSteppedQuarterCAPComplexShape();

    ComplexShape GT_PEANUT_COMPLEX_SHAPE = new GTPeanutComplexShape();
    ComplexShape GT_PLUS_KNOT_COMPLEX_SHAPE = new GTPlusKnotComplexShape();
    ComplexShape GT_HALF_PLUS_KNOT_COMPLEX_SHAPE = new GTHalfPlusComplexShape();
    ComplexShape GT_SWITCHBACK_KNOT_COMPLEX_SHAPE = new GTSwitchbackComplexShape();
    ComplexShape GT_SWITCHBACK_PLUS_KNOT_COMPLEX_SHAPE = new GTSwitchbackPlusComplexShape();
    ComplexShape GT_THREE_BEAT_KNOT_COMPLEX_SHAPE = new GTThreeBeatKnotComplexShape();

    List<Shape> shapes = new ArrayList<Shape>() {
        {
            add(GT_PEANUT_COMPLEX_SHAPE);
            add(GT_PLUS_KNOT_COMPLEX_SHAPE);
            add(GT_HALF_PLUS_KNOT_COMPLEX_SHAPE);
            add(GT_SWITCHBACK_KNOT_COMPLEX_SHAPE);
            add(GT_SWITCHBACK_PLUS_KNOT_COMPLEX_SHAPE);
            add(GT_THREE_BEAT_KNOT_COMPLEX_SHAPE);

            add(SQUISH_X_COMPLEX_SHAPE);
            add(SQUISH_Y_COMPLEX_SHAPE);
            add(QUARTER_STEPPED_COMPLEX_SHAPE);
            add(STEPPED_QUARTER_CAP_COMPLEX_SHAPE);
            add(DOUBLE_STEPPED_QUARTER_CAP_COMPLEX_SHAPE);

            add(TRANSLATED_HALF_COMPLEX_SHAPE);
            add(TRANSLATED_QUARTER_COMPLEX_SHAPE);
            add(TRANSLATED_HALF_BROKEN_COMPLEX_SHAPE);
            add(TRANSLATED_QUARTER_BROKEN_COMPLEX_SHAPE);
            add(TRANSLATED_QUARTER_HALFED_COMPLEX_SHAPE);
            add(TRANSLATED_DIAGONAL_COMPLEX_SHAPE);
            add(TRANSLATED_CORNER_COMPLEX_SHAPE);

            add(PAUSED_FULL_CIRCLE);
            add(PAUSED_HALF_CIRCLE);
            add(PAUSED_QUARTER_CIRCLE);
            add(PAUSED_HALF_CAP);

            add(CIRCLE);
            add(OVAL);
            add(SQUARE);

            add(ULTIMATE);

            add(LINE);
            add(HORIZONTAL_LINE);
            add(VERTICAL_LINE);
            add(PLUS);
            add(PLUS_CORNER);
            add(PLUS_HALF);
            add(PLUS_HALF_CAP);

            add(POINT);

            add(H_LINE);
            add(H_LINE_FIG8);
            add(H_CURVE);
            add(H_CURVE_FIG8);
            add(H_CIRCLE);
            add(H_CIRCLE_FIG8);

            add(HYPOCYCLOID);
            add(HYPOCYCLOID_FAKE);

            add(EPITROCHOID);
            add(EPITROCHOID_ONE);
            add(EPITROCHOID_TWO);
            add(EPITROCHOID_THREE);
            add(EPITROCHOID_FIVE);
            add(EPITROCHOID_SIX);
            add(EPITROCHOID_SEVEN);
            add(EPITROCHOID_EIGHT);

            add(HYPOTROCHOID);
            add(HYPOTROCHOID_ONE);
            add(HYPOTROCHOID_TWO);
            add(HYPOTROCHOID_THREE);
            add(HYPOTROCHOID_FIVE);
            add(HYPOTROCHOID_SIX);
            add(HYPOTROCHOID_SEVEN);
            add(HYPOTROCHOID_EIGHT);

            add(EPICYCLOID);
            add(EPICYCLOID_ONE);
            add(EPICYCLOID_TWO);
            add(EPICYCLOID_THREE);
            add(EPICYCLOID_FIVE);
            add(EPICYCLOID_SIX);
            add(EPICYCLOID_SEVEN);
            add(EPICYCLOID_EIGHT);

            add(HYPOCYCLOID_ONE);
            add(HYPOCYCLOID_TWO);
            add(TRIANGLE);
            add(PENTAGON);
            add(OCTAGON);
            add(HYPOCYCLOID_SEVEN);
            add(HYPOCYCLOID_EIGHT);

            add(FULL_CIRCLE);

            add(HALF_CIRCLE_HORIZONTAL_TOP);
            add(HALF_CIRCLE_HORIZONTAL_BOTTOM);
            add(HALF_CIRCLE_VERTICAL_LEFT);
            add(HALF_CIRCLE_VERTICAL_RIGHT);

            add(FIGURE_OF_EIGHT);
            add(FIGURE_OF_EIGHT_COMPLEX_SHAPE);
            add(FIGURE_OF_EIGHT_BROKEN_COMPLEX_SHAPE);
            add(LISSAJOUS_FIGURE);
            add(FIGURE_OF_EIGHT_CAP_HIGH_COMPLEX_SHAPE);
            add(FIGURE_OF_EIGHT_CAP_LOW_COMPLEX_SHAPE);

            add(QUARTERS_TOP_LEFT);
            add(QUARTERS_TOP_RIGHT);
            add(QUARTERS_BOTTOM_LEFT);
            add(QUARTERS_BOTTOM_RIGHT);

            add(CORNER);

        }};

}