package net.firestaff.mcp.baselab.patterns;

import net.firestaff.mcp.baselab.shapes.util.ShapeConstants;

public class Pattern {

    String leftText;
    String rightText;
    String L2Text;
    String R2Text;
    ShapeConstants left;
    ShapeConstants right;

    double period;

    int objectNumber = 2;

    String name;

    public Pattern()
    {}

    public Pattern(String left, String right, String name) {
        leftText = left;
        rightText = right;
        this.name = name;
        objectNumber = 2;
    }

    public Pattern(String left, String right, String L2, boolean isRight, String name) {
        leftText = left;
        rightText = right;
        if(isRight) R2Text = L2;
        else L2Text = L2;
        this.name = name;
        objectNumber = 3;
    }

    public Pattern(String left, String right, String L2, String R2, String name) {
        leftText = left;
        rightText = right;
        L2Text = L2;
        R2Text = R2;
        this.name = name;
        objectNumber = 4;
    }

    public Pattern(String text) {

        int rightstart = text.indexOf("r.s.pat:"); // 8 long
        int leftstart = text.indexOf("l.s.pat:"); // 8 long
        int L2start = -1;
        int R2start = -1;
        if(text.contains("l2.s.pat:")) {
            L2start = text.indexOf("l2.s.pat:"); // 9 long
        }
        if(text.contains("r2.s.pat:")) {
            R2start = text.indexOf("r2.s.pat:"); // 9 long
        }
        int end = text.length();

        String right = text.substring(rightstart + 8, leftstart);
        String left = text.substring(leftstart + 8, end);
        if(left.contains("l2.s.pat:")) left = left.substring(0, left.indexOf("l2.s.pat:"));
        if(left.contains("r2.s.pat:")) left = left.substring(0, left.indexOf("r2.s.pat:"));

        String R2 = "";
        String L2 = "";
        if(R2start > 0) {
            R2 = text.substring(R2start + 9, end);
            if(R2.contains("l2.s.pat:")) R2 = R2.substring(0, R2.indexOf("l2.s.pat:"));
        }
        if(L2start > 0) {
            L2 = text.substring(L2start + 9, end);
        }


        leftText = left;
        rightText = right;
        objectNumber = 2;
        if(R2start > 0) { R2Text = R2; objectNumber ++; }
        if(L2start > 0) { L2Text = L2; objectNumber ++; }
        this.name = "loaded pattern";

    }

    public String toString() {
        return name;
    }

    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeftText() {
        return leftText;
    }

    public String getRightText() {
        return rightText;
    }

    public String getR2Text() {
        return R2Text;
    }

    public String getL2Text() {
        return L2Text;
    }

    public int getPropNumber() {
        return objectNumber;
    }
}