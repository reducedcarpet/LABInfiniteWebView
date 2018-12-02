package net.firestaff.mcp.LABInfiniteWebView.model;

import javax.persistence.*;

@Entity
public class FullPatternView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String patternName;

    String patternCategory;

    String propType;

    PatternView leftPattern;
    //String leftText;

    PatternView rightPattern;
    //String rightText;

    public String getPropType() {
        return propType;
    }

    public void setPropType(String propType) {
        this.propType = propType;
    }

    public String getPatternName() {
        return patternName;
    }

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    public PatternView getLeftPattern() {
        return leftPattern;
    }

    public void setLeftPattern(PatternView leftPattern) {
        this.leftPattern = leftPattern;
    }

    public PatternView getRightText() { return rightPattern; }

    public void setRightPattern(PatternView rightPattern) { this.rightPattern = rightPattern; }

    public String getPatternCategory() {
        return patternCategory;
    }

    public void setPatternCategory(String patternCategory) {
        this.patternCategory = patternCategory;
    }
}
