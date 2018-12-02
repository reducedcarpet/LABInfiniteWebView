package net.firestaff.mcp.LABInfiniteWebView.test;

import javax.validation.constraints.NotNull;

public class PatternQuery {

    @NotNull
    private String patternName;

    @NotNull
    private String patternCategory;

    private String framework = "VTG";

    private String propType = "Staff";

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getPropType() {
        return propType;
    }

    public void setPropType(String propType) {
        this.propType = propType;
    }

    public String getPatternName() {
        return this.patternName;
    }

    public void setPatternName(String name) {
        this.patternName = name;
    }

    public String getPatternCategory() {
        return patternCategory;
    }

    public void setPatternCategory(String patternCategory) {
        this.patternCategory = patternCategory;
    }

    public String toString() {
        return "PatternQuery(Category: " + this.patternCategory + " - Name: " + this.patternName + ")";
    }
}
