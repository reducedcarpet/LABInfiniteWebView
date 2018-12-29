package net.firestaff.mcp.LABInfiniteWebView.comm;

import net.firestaff.mcp.LABInfiniteWebView.model.PatternModel;
import net.firestaff.mcp.LABInfiniteWebView.model.PropModel;
import net.firestaff.mcp.LABInfiniteWebView.model.PropPatternModel;
import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Positions;

public class HttpBuilder {

    public String build(Pattern p) {
        return "";
    }

    public static String build(PatternModel p) {
        String result = "";

        result += "?PatternName=" + "patternname" + "&";

        result += buildProp(p.getPropOne(), "right") + "&";
        result += buildProp(p.getPropTwo(), "left");

        return result;
    }

    private  static String buildProp(PropPatternModel p, String prefix) {
        String result = "";

        result += prefix + "shape=" + p.getShape() + "&";
        result += prefix + "complex=" + p.getComplexShape() + "&";

        result += prefix + "pathsize=" + p.getPathSizeModifier() + "&";
        result += prefix + "pathdir=" + p.getPathDirection() + "&";
        result += prefix + "pathsp=" + p.getPathSpeed() + "&";
        result += prefix + "pathrot=" + p.getPathRotation() + "&";
        result += prefix + "pathamod=" + p.getPathAngleModifier() + "&";
        result += prefix + "propdir=" + p.getPropDirection() + "&";
        result += prefix + "propsp=" + p.getPropSpeed() + "&";
        result += prefix + "propamod=" + p.getPropAngleModifier() + "&";
        result += prefix + "xadj=" + p.getXAdj() + "&";
        result += prefix + "yadj=" + p.getYAdj() + "&";
        result += prefix + "pos=" + Positions.getName(p.getXAdj(), p.getYAdj()) + "&";
        result += prefix + "pivx=" + p.getPivotX() + "&";
        result += prefix + "pivy=" + p.getPivotY() + "&";
        result += prefix + "zshape=" + p.getZShape() + "&";
        result += prefix + "use3d=" + p.use3D + "&";
        result += prefix + "mod3d=" + p.getMod3D() + "&";
        result += prefix + "flip3d=" + p.flip3D + "&";
        result += prefix + "twist3d=" + p.twist3D + "&";
        result += prefix + "spc=" + p.getSpeedControl() + "&";
        result += prefix + "spmod=" + p.getSpeedChangeModifier() + "&";
        result += prefix + "dirc=" + p.getDirectionControl() + "&";
        result += prefix + "dirmod=" + p.getDirectionChangeModifier();
        //result += prefix + "acc=" + p.acc + "&";
        //result += prefix + "upen=" + p.usePendulums + "&";
        //result += prefix + "ugrav=" + p.useGravity;


        return result;
    }
}
