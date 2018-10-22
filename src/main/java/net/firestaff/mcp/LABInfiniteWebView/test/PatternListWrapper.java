package net.firestaff.mcp.LABInfiniteWebView.test;

import net.firestaff.mcp.baselab.patterns.Patterns;

import java.util.List;

public class PatternListWrapper {

    public List<String> getPatternList() {
        return patternList;
    }

    public void setPatternList(List<String> patternList) {
        this.patternList = patternList;
    }

    List<String> patternList = Patterns.patternList;


}
