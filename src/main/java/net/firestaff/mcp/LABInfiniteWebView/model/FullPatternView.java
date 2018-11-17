package net.firestaff.mcp.LABInfiniteWebView.model;

public class FullPatternView {

    private long id;

    String name;

    String propType;

    PatternView left;

    PatternView right;

    public String getPropType() {
        return propType;
    }

    public void setPropType(String propType) {
        this.propType = propType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PatternView getLeft() {
        return left;
    }

    public void setLeft(PatternView left) {
        this.left = left;
    }

    public PatternView getRight() {
        return right;
    }

    public void setRight(PatternView right) {
        this.right = right;
    }


}
