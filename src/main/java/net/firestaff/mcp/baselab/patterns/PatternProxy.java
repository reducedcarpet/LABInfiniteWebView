package net.firestaff.mcp.baselab.patterns;

import java.util.List;
import java.util.Map;

public class PatternProxy {

    public static int type = 1;
    public static boolean VTG = true;

    public static final int TYPE_POI = 1;
    public static final int TYPE_STAFF = 0;
    public static final int TYPE_HOOP = 2;
    public static final int TYPE_CLUBS = 3;
    public static final int TYPE_ARMS = 4;

    public static List<Pattern> getBasicPatterns() {
        if(type == TYPE_STAFF) {
            if (VTG) {
                return PatternsVTG.basic12Patterns;
            } else return Patterns.basic12Patterns;
        }
        else {
            if (VTG) {
                return PoiPatternsVTG.basic12Patterns;
            } else return PoiPatterns.basic12Patterns;
        }
    }

    public static List<String> getPatternList() {
        if(type == TYPE_STAFF) {
            if (VTG) {
                return PatternsVTG.patternList;
            } else return Patterns.patternList;
        }
        else {
            if (VTG) {
                return PoiPatternsVTG.patternList;
            } else return PoiPatterns.patternList;
        }
    }

    public static List<String> getFreePatternList() {
        if(type == TYPE_STAFF) {
            if (VTG) {
                return PatternsVTG.patternFreeList;
            } else return Patterns.patternFreeList;
        }
        else {
            if (VTG) {
                return PoiPatternsVTG.patternFreeList;
            } else return PoiPatterns.patternFreeList;
        }
    }

    public static Map<String,List<Pattern>> getPatternMasterMap() {
        if(type == TYPE_STAFF) {
            if (VTG) {
                return PatternsVTG.patternMasterMap;
            } else return Patterns.patternMasterMap;
        }
        else {
            if (VTG) {
                return PoiPatternsVTG.patternMasterMap;
            } else return PoiPatterns.patternMasterMap;
        }
    }

    public static List<Pattern> getFromPatternMasterMap(String pattern) {
        if(type == TYPE_STAFF) {
            if (VTG) {
                return PatternsVTG.patternMasterMap.get(pattern);
            } else return Patterns.patternMasterMap.get(pattern);
        }
        else {
            if (VTG) {
                return PoiPatternsVTG.patternMasterMap.get(pattern);
            } else return PoiPatterns.patternMasterMap.get(pattern);
        }
    }
}
