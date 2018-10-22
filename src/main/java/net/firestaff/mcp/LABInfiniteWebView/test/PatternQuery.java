package net.firestaff.mcp.LABInfiniteWebView.test;

import javax.validation.constraints.NotNull;

public class PatternQuery {

    @NotNull
    private String patternName;

    @NotNull
    private String category;

    public String getPatternName() {
        return this.patternName;
    }

    public void setPatternName(String name) {
        this.patternName = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "PatternQuery(Category: " + this.category + " - Name: " + this.patternName + ")";
    }
}
