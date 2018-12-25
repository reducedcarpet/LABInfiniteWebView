package net.firestaff.mcp.baselab.patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.inject.Inject;


public class Patterns {

    public static List<Pattern> basicTrammelPatterns = new ArrayList<Pattern>();
    public static List<Pattern> basicIsolationPatterns = new ArrayList<Pattern>();
    public static List<Pattern> basicAntispinPatterns = new ArrayList<Pattern>();
    public static List<Pattern> basicHybridPatterns = new ArrayList<Pattern>();
    public static List<Pattern> basicRTypePatterns = new ArrayList<Pattern>();

    public static List<Pattern> basicPatterns = new ArrayList<Pattern>();
    public static List<Pattern> basic12Patterns = new ArrayList<Pattern>();
    public static List<Pattern> startingPositions = new ArrayList<Pattern>();
    public static List<Pattern> startingPositionsAll = new ArrayList<Pattern>();

    public static List<Pattern> extraBeatPatterns = new ArrayList<Pattern>();
    public static List<Pattern> extraBeat2Patterns = new ArrayList<Pattern>();
    public static List<Pattern> extraBeat3Patterns = new ArrayList<Pattern>();
    public static List<Pattern> extraBeat4Patterns = new ArrayList<Pattern>();
    public static List<Pattern> perpendicularPatterns = new ArrayList<Pattern>();
    public static List<Pattern> pointPatterns = new ArrayList<Pattern>();
    public static List<Pattern> pointHybridPatterns = new ArrayList<Pattern>();
    public static List<Pattern> pointHybridPerpPatterns = new ArrayList<Pattern>();
    public static List<Pattern> verticalLinePatterns = new ArrayList<Pattern>();
    public static List<Pattern> superspinPatterns = new ArrayList<Pattern>();
    public static List<Pattern> halfCirclePatterns = new ArrayList<Pattern>();
    public static List<Pattern> CAPSPatterns = new ArrayList<Pattern>();
    public static List<Pattern> verticalCAPSPatterns = new ArrayList<Pattern>();
    public static List<Pattern> buzzsawCAPSPatterns = new ArrayList<Pattern>();
    public static List<Pattern> extraBeatTrammelPatterns = new ArrayList<Pattern>();
    public static List<Pattern> quartertimePatterns = new ArrayList<Pattern>();
    public static List<Pattern> hybridPathTrammelPatterns = new ArrayList<Pattern>();
    public static List<Pattern> extraBeatDiagonalPatterns = new ArrayList<Pattern>();
    public static List<Pattern> boxPatterns = new ArrayList<Pattern>();
    public static List<Pattern> translatedHalfPatterns = new ArrayList<Pattern>();
    public static List<Pattern> translatedQuarterPlusPatterns = new ArrayList<Pattern>();
    public static List<Pattern> basicChuuChuuPatterns = new ArrayList<Pattern>();
    public static List<Pattern> snakeChuuChuuPatterns = new ArrayList<Pattern>();

    public static List<Pattern> squarePatterns = new ArrayList<Pattern>();
    public static List<Pattern> quarterSquarePatterns = new ArrayList<Pattern>();
    public static List<Pattern> dirChangePatterns = new ArrayList<Pattern>();
    public static List<Pattern> dirChangeVerticalPatterns = new ArrayList<Pattern>();
    public static List<Pattern> superspinTrammelPatterns = new ArrayList<Pattern>();
    public static List<Pattern> pausedCirclePatterns = new ArrayList<Pattern>();
    public static List<Pattern> pausedHalfCirclePatterns = new ArrayList<Pattern>();
    public static List<Pattern> pausedQuartersPatterns = new ArrayList<Pattern>();
    public static List<Pattern> translatedCirclesPatterns = new ArrayList<Pattern>();
    public static List<Pattern> translatedQuarterPatterns = new ArrayList<Pattern>();
    public static List<Pattern> threeQuarterPatterns = new ArrayList<Pattern>();
    public static List<Pattern> threeQuarterHybridPatterns = new ArrayList<Pattern>();

    public static List<Pattern> underArmourHPatterns = new ArrayList<Pattern>();

    public static List<Pattern> FOURSoloQuartersPatterns = new ArrayList<Pattern>();
    public static List<Pattern> FOURUltimateQuartersPatterns = new ArrayList<Pattern>();
    public static List<Pattern> FOURSteppedQuartersPatterns = new ArrayList<Pattern>();
    public static List<Pattern> sluiceGatePatterns = new ArrayList<Pattern>();

    public static List<Pattern> GTPeanutPatterns = new ArrayList<Pattern>();
    public static List<Pattern> GTHalfPlusPatterns = new ArrayList<Pattern>();
    public static List<Pattern> GTPlusKnotPatterns = new ArrayList<Pattern>();
    public static List<Pattern> GTSwitchbackPatterns = new ArrayList<Pattern>();
    public static List<Pattern> GTSwitchbackPlusPatterns = new ArrayList<Pattern>();
    public static List<Pattern> GTThreeBeatKnotPatterns = new ArrayList<Pattern>();

    public static List<Pattern> flip3DFullCirclePatterns = new ArrayList<Pattern>();
    public static List<Pattern> flip3DHalfCirclePatterns = new ArrayList<Pattern>();
    public static List<Pattern> flip3DQuarterCirclePatterns = new ArrayList<Pattern>();
    public static List<Pattern> twist3DFullCirclePatterns = new ArrayList<Pattern>();
    public static List<Pattern> twist3DHalfCirclePatterns = new ArrayList<Pattern>();
    public static List<Pattern> twist3DQuarterCirclePatterns = new ArrayList<Pattern>();

    public static List<Pattern> flip3DFullTrammelPatterns = new ArrayList<Pattern>();
    public static List<Pattern> flip3DHalfTrammelPatterns = new ArrayList<Pattern>();
    public static List<Pattern> twist3DFullTrammelPatterns = new ArrayList<Pattern>();
    public static List<Pattern> twist3DHalfTrammelPatterns = new ArrayList<Pattern>();

    public static List<Pattern> pingpongPatterns = new ArrayList<Pattern>();

    public static Map<String,List<Pattern>> patternMasterMap = new HashMap<String,List<Pattern>>();
    public static Map<String,List<Pattern>> patternFreeMap = new HashMap<String,List<Pattern>>();
    public static List<String> patternList = new ArrayList<String>();
    public static List<String> patternFreeList = new ArrayList<String>();

    //@Inject
    //PatternHelper pp;

    static {
        PatternHelper p = new PatternHelper(); // force patternHelper to init.
        //patternList.add();

        patternMasterMap.put("Isolation", basicIsolationPatterns);  patternList.add("Isolation");
        patternMasterMap.put("Anti-Spin", basicAntispinPatterns);  patternList.add("Anti-Spin");
        patternMasterMap.put("Hybrids", basicHybridPatterns);  patternList.add("Hybrids");
        patternMasterMap.put("Quarter-time", quartertimePatterns);  patternList.add("Quarter-time");
        patternMasterMap.put("Starting Positions", startingPositionsAll); patternList.add("Starting Positions");

        patternMasterMap.put("Point Spins 0:1", pointPatterns);  patternList.add("Point Spins 0:1");
        patternMasterMap.put("Perpendicular", perpendicularPatterns); patternList.add("Perpendicular");
        patternMasterMap.put("CAP's", CAPSPatterns); patternList.add("CAP's");
        patternMasterMap.put("High/Low CAP's", verticalCAPSPatterns); patternList.add("High/Low CAP's");
        patternMasterMap.put("Buzzsaw CAP's", buzzsawCAPSPatterns); patternList.add("Buzzsaw CAP's");
        patternMasterMap.put("Boxes", boxPatterns); patternList.add("Boxes");

        patternMasterMap.put("R-Types 1:0", basicRTypePatterns); patternList.add("R-Types 1:0");
        patternMasterMap.put("Basic Chuu Chuu's", basicChuuChuuPatterns); patternList.add("Basic Chuu Chuu's");
        patternMasterMap.put("Snake Chuu Chuu's", snakeChuuChuuPatterns); patternList.add("Snake Chuu Chuu's");
        patternMasterMap.put("Ping Pong's", pingpongPatterns); patternList.add("Ping Pong's");
        patternMasterMap.put("Super-Spin 2:1", superspinPatterns);  patternList.add("Super-Spin 2:1");
        patternMasterMap.put("2bt Flowers 1:2", extraBeatPatterns);  patternList.add("2bt Flowers 1:2");
        patternMasterMap.put("3bt Flowers 1:3", extraBeat2Patterns); patternList.add("3bt Flowers 1:3");
        patternMasterMap.put("4bt Flowers 1:4", extraBeat3Patterns); patternList.add("4bt Flowers 1:4");
        patternMasterMap.put("5bt Flowers 1:5", extraBeat4Patterns); patternList.add("5bt Flowers 1:5");
        patternMasterMap.put("Diagonal Flowers 1:5", extraBeatDiagonalPatterns); patternList.add("Diagonal Flowers 1:5");

        patternMasterMap.put("Horizontal Trammel", basicTrammelPatterns);  patternList.add("Horizontal Trammel");
        patternMasterMap.put("Vertical Trammel", verticalLinePatterns); patternList.add("Vertical Trammel");
        patternMasterMap.put("Hybrid Path Trammel", hybridPathTrammelPatterns); patternList.add("Hybrid Path Trammel");
        patternMasterMap.put("2bt Trammel", extraBeatTrammelPatterns); patternList.add("2bt Trammel");
        patternMasterMap.put("Super-Spin Trammel", superspinTrammelPatterns);  patternList.add("Super-Spin Trammel");
        patternMasterMap.put("Point Spin Hybrids", pointHybridPatterns); patternList.add("Point Spin Hybrids");
        patternMasterMap.put("Point Spin Perpendicular Hybrids", pointHybridPerpPatterns); patternList.add("Point Spin Perpendicular Hybrids");

        patternMasterMap.put("Composite Shape Vertical 1/2 'D'", translatedHalfPatterns); patternList.add("Composite Shape Vertical 1/2 'D'");
        patternMasterMap.put("Sharp Anti-Anti-Spin", translatedQuarterPlusPatterns); patternList.add("Sharp Anti-Anti-Spin");


        patternMasterMap.put("Paused Full Circle", pausedCirclePatterns); patternList.add("Paused Full Circle");
        patternMasterMap.put("Paused Half Circle", pausedHalfCirclePatterns); patternList.add("Paused Half Circle");
        patternMasterMap.put("Paused Quarter Circle", pausedQuartersPatterns); patternList.add("Paused Quarter Circle");

        patternMasterMap.put("FOUR - Solo Quarter", FOURSoloQuartersPatterns); patternList.add("FOUR - Solo Quarter");
        patternMasterMap.put("FOUR - 8 Step Cap vs Circle", FOURUltimateQuartersPatterns); patternList.add("FOUR - 8 Step Cap vs Circle");
        patternMasterMap.put("FOUR - 8 Step Cap", FOURSteppedQuartersPatterns); patternList.add("FOUR - 8 Step Cap");
        patternMasterMap.put("FOUR - Sluice Gates", sluiceGatePatterns); patternList.add("FOUR - Sluice Gates");

        patternMasterMap.put("GT - Peanut", GTPeanutPatterns); patternList.add("GT - Peanut");
        patternMasterMap.put("GT - Plus Knot", GTPlusKnotPatterns); patternList.add("GT - Plus Knot");
        patternMasterMap.put("GT - Switchback", GTSwitchbackPatterns); patternList.add("GT - Switchback");
        patternMasterMap.put("GT - Switchback Plus", GTSwitchbackPlusPatterns); patternList.add("GT - Switchback Plus");
        patternMasterMap.put("GT - Three Beat Knot", GTThreeBeatKnotPatterns); patternList.add("GT - Three Beat Knot");
        patternMasterMap.put("GT - Half Plus", GTHalfPlusPatterns); patternList.add("GT - Half Plus");

        patternMasterMap.put("3D - Flips - Full Circle", flip3DFullCirclePatterns); patternList.add("3D - Flips - Full Circle");
        patternMasterMap.put("3D - Flips - Half Circle", flip3DHalfCirclePatterns); patternList.add("3D - Flips - Half Circle");
        patternMasterMap.put("3D - Flips - 1/4 Circle", flip3DQuarterCirclePatterns); patternList.add("3D - Flips - 1/4 Circle");

        patternMasterMap.put("3D - Twists - Full Circle", twist3DFullCirclePatterns); patternList.add("3D - Twists - Full Circle");
        patternMasterMap.put("3D - Twists - Half Circle", twist3DHalfCirclePatterns); patternList.add("3D - Twists - Half Circle");
        patternMasterMap.put("3D - Twists - 1/4 Circle", twist3DQuarterCirclePatterns); patternList.add("3D - Twists - 1/4 Circle");

        patternMasterMap.put("3D Flip - Full - Linear Isolation", flip3DFullTrammelPatterns); patternList.add("3D Flip - Full - Linear Isolation");
        patternMasterMap.put("3D Flip - Half - Linear Isolation", flip3DHalfTrammelPatterns); patternList.add("3D Flip - Half - Linear Isolation");
        patternMasterMap.put("3D Twist - Full - Linear Isolation", twist3DFullTrammelPatterns); patternList.add("3D Twist - Full - Linear Isolation");
        patternMasterMap.put("3D Twist - Half - Linear Isolation", twist3DHalfTrammelPatterns); patternList.add("3D Twist - Half - Linear Isolation");


        //patternMasterMap.put("", ); patternList.add();
        //patternMasterMap.put("", ); patternList.add();
        //patternFreeMap =
        patternFreeMap.put("Isolation", basicIsolationPatterns);  patternFreeList.add("Isolation");
        patternFreeMap.put("Anti-Spin", basicAntispinPatterns);  patternFreeList.add("Anti-Spin");
        patternFreeMap.put("Hybrids", basicHybridPatterns);  patternFreeList.add("Hybrids");
        patternFreeMap.put("Quarter-time", quartertimePatterns);  patternFreeList.add("Quarter-time");
        patternFreeMap.put("Starting Positions", startingPositionsAll); patternFreeList.add("Starting Positions");

        patternFreeMap.put("Point Spins 0:1", pointPatterns);  patternFreeList.add("Point Spins 0:1");
        patternFreeMap.put("Perpendicular", perpendicularPatterns); patternFreeList.add("Perpendicular");
        patternFreeMap.put("CAP's", CAPSPatterns); patternFreeList.add("CAP's");
        patternFreeMap.put("High/Low CAP's", verticalCAPSPatterns); patternFreeList.add("High/Low CAP's");
        patternFreeMap.put("Buzzsaw CAP's", buzzsawCAPSPatterns); patternFreeList.add("Buzzsaw CAP's");
        patternFreeMap.put("Boxes", boxPatterns); patternFreeList.add("Boxes");

        patternFreeMap.put("R-Types 1:0", basicRTypePatterns); patternFreeList.add("R-Types 1:0");
        patternFreeMap.put("Super-Spin 2:1", superspinPatterns);  patternFreeList.add("Super-Spin 2:1");
        patternFreeMap.put("2bt Flowers 1:2", extraBeatPatterns);  patternFreeList.add("2bt Flowers 1:2");
        patternFreeMap.put("3bt Flowers 1:3", extraBeat2Patterns); patternFreeList.add("3bt Flowers 1:3");
        patternFreeMap.put("4bt Flowers 1:4", extraBeat3Patterns); patternFreeList.add("4bt Flowers 1:4");
        patternFreeMap.put("5bt Flowers 1:5", extraBeat4Patterns); patternFreeList.add("5bt Flowers 1:5");
        patternFreeMap.put("Diagonal Flowers 1:5", extraBeatDiagonalPatterns); patternFreeList.add("Diagonal Flowers 1:5");

        patternFreeMap.put("Horizontal Trammel", basicTrammelPatterns);  patternFreeList.add("Horizontal Trammel");
        patternFreeMap.put("Vertical Trammel", verticalLinePatterns); patternFreeList.add("Vertical Trammel");
        patternFreeMap.put("Hybrid Path Trammel", hybridPathTrammelPatterns); patternFreeList.add("Hybrid Path Trammel");
        patternFreeMap.put("2bt Trammel", extraBeatTrammelPatterns); patternFreeList.add("2bt Trammel");
        patternFreeMap.put("Super-Spin Trammel", superspinTrammelPatterns);  patternFreeList.add("Super-Spin Trammel");
        patternFreeMap.put("Point Spin Hybrids", pointHybridPatterns); patternFreeList.add("Point Spin Hybrids");
        patternFreeMap.put("Point Spin Perpendicular Hybrids", pointHybridPerpPatterns); patternFreeList.add("Point Spin Perpendicular Hybrids");

        patternFreeMap.put("Composite Shape Vertical 1/2 'D'", translatedHalfPatterns); patternFreeList.add("Composite Shape Vertical 1/2 'D'");
        patternFreeMap.put("Sharp Anti-Anti-Spin", translatedQuarterPlusPatterns); patternFreeList.add("Sharp Anti-Anti-Spin");

        patternFreeMap.put("FOUR - Solo Quarter", FOURSoloQuartersPatterns); patternFreeList.add("FOUR - Solo Quarter");
        patternFreeMap.put("FOUR - 8 Step Cap vs Circle", FOURUltimateQuartersPatterns); patternFreeList.add("FOUR - 8 Step Cap vs Circle");
        patternFreeMap.put("FOUR - 8 Step Cap", FOURSteppedQuartersPatterns); patternFreeList.add("FOUR - 8 Step Cap");


        // Pattern Format //////////////////////////////////////////////////////////////////////////
        // 1 PropAngle Radians, 2 PropIncrement, 3 PropAngleModifier,
        // 4 PathAngle, 5 PathIncrement, 6 PathAngleModifier, 7 PathSizeModifier
        // 8 PropDirection, 9 PathDirection, 10 PathSpeed
        // 11 Height, 12 Length, 13 Shape String
        // 14 PropSpeed
        // 15 X, 16 XAdj, 17 Y, 18 YAdj
        // OPTIONAL:
        // 19 PropChange
        // 20 PathRotation
        // 21 PathChange
        // 22 AngleSpeedChangeMod
        // 23 AngleSpeedChangeMod2
        // 24 UseSpeedChange
        // 25 UseSpeedChangeType
        ////////////////////////////////////////////////////////////////////////////////////////////



        // TODO add more here

        PatternGenerator.generateSuperspinPatterns(basic12Patterns, superspinPatterns);
        PatternGenerator.generatePointHybridPerpPatterns(pointHybridPatterns, pointHybridPerpPatterns);
        //PatternGenerator.generatePointHybridPerpInsidePatterns(basic12Patterns, superspinPatterns);
        //PatternGenerator.generatePointHybridPerpOutsidePatterns(basic12Patterns, superspinPatterns);
        PatternGenerator.generateHalfCirclePatterns(basic12Patterns, halfCirclePatterns);
        PatternGenerator.generateDirChangePatterns(basic12Patterns, dirChangePatterns);
        PatternGenerator.generateDirChangeVerticalPatterns(basic12Patterns, dirChangeVerticalPatterns);
        //PatternGenerator.generateDirChangeHybridPatterns(basic12Patterns, dirChangePatterns);

        PatternGenerator.generateTranslatedCirclePatterns(basic12Patterns, translatedCirclesPatterns);
        PatternGenerator.generateTranslatedQuartersPatterns(basic12Patterns, translatedQuarterPatterns);
        PatternGenerator.generateThreeQuarterPatterns(basic12Patterns, threeQuarterPatterns);
        PatternGenerator.generateThreeQuarterHybridPatterns(basic12Patterns, threeQuarterHybridPatterns);
        PatternGenerator.generateUnderArmourHPatterns(basic12Patterns, underArmourHPatterns);
        //PatternGenerator.generateUnderArmourHPatterns(basic12Patterns, underArmourHPatterns);
        PatternGenerator.generateQuartertimePatterns(basic12Patterns, quartertimePatterns, basicPatterns);
        PatternGenerator.generateBasicTrammelPatterns(basicTrammelPatterns);
        PatternGenerator.generateVerticalLinePatterns(basicTrammelPatterns, verticalLinePatterns);

        PatternGenerator.generateHybridPathTrammelPatterns(hybridPathTrammelPatterns, basicPatterns);
        PatternGenerator.generateBasicAntispinPatterns(basicAntispinPatterns, basic12Patterns);
        PatternGenerator.generateBasicHybridPatterns(basicHybridPatterns, basic12Patterns);
        PatternGenerator.generateBasicIsolationPatterns(basicIsolationPatterns, basic12Patterns);
        PatternGenerator.generateRTypePatterns(basic12Patterns, basicRTypePatterns);
        PatternGenerator.generateDiagonalPatterns(extraBeatDiagonalPatterns, extraBeat4Patterns);
        PatternGenerator.generateHypocycloidPatterns(boxPatterns, basic12Patterns);

        PatternGenerator.generateTranslatedQuarterPatterns(translatedQuarterPlusPatterns, basic12Patterns);
        PatternGenerator.generateTranslatedHalfPatterns(translatedHalfPatterns, basic12Patterns);

        PatternGenerator.generatePausedFullPatterns(basic12Patterns, pausedCirclePatterns);
        PatternGenerator.generatePausedFullPatterns(quartertimePatterns, pausedCirclePatterns);
        PatternGenerator.generatePausedHalfPatterns(basic12Patterns, pausedHalfCirclePatterns);
        PatternGenerator.generatePausedHalfPatterns(quartertimePatterns, pausedHalfCirclePatterns);
        PatternGenerator.generatePausedQuarterPatterns(basic12Patterns, pausedQuartersPatterns);
        PatternGenerator.generatePausedQuarterPatterns(quartertimePatterns, pausedQuartersPatterns);

        // SuperSpin Trammel
        PatternGenerator.generateSuperspinPatterns(basicTrammelPatterns, superspinTrammelPatterns);

        PatternGenerator.generateBasicChuuChuuPatterns(basic12Patterns, basicChuuChuuPatterns);
        //PatternGenerator.generateSnakeChuuChuuPatterns(basic12Patterns, snakeChuuChuuPatterns);
        //PatternGenerator.generatePingpongPatterns(basic12Patterns, pingpongPatterns);

        //FOUR
        PatternGenerator.generateFOURSoloQuarterPatterns(basic12Patterns, FOURSoloQuartersPatterns);
        PatternGenerator.generateFOURUltimateQuarterPatterns(basic12Patterns, FOURUltimateQuartersPatterns);
        PatternGenerator.generateFOURSteppedQuarterPatterns(basic12Patterns, FOURSteppedQuartersPatterns);
        //PatternGenerator.generateSluiceGatePatterns(basic12Patterns, sluiceGatePatterns);
        //PatternGenerator.generateSluiceGatePatterns(quartertimePatterns, sluiceGatePatterns);

        //GT
        PatternGenerator.generateGTPeanutPatterns(basic12Patterns, GTPeanutPatterns);
        PatternGenerator.generateGTPlusKnotPatterns(basic12Patterns, GTPlusKnotPatterns);
        PatternGenerator.generateGTSwitchbackPatterns(basic12Patterns, GTSwitchbackPatterns);
        PatternGenerator.generateGTSwitchbackPlusPatterns(basic12Patterns, GTSwitchbackPlusPatterns);
        PatternGenerator.generateGTThreeBeatKnotPatterns(basic12Patterns, GTThreeBeatKnotPatterns);
        PatternGenerator.generateGTHalfPlusPatterns(basic12Patterns, GTHalfPlusPatterns);

        PatternGenerator.generatePoiAltPatterns(startingPositions, startingPositionsAll);

        // 3D
        PatternGenerator.generateFlip3DFullCirclePatterns(basic12Patterns, flip3DFullCirclePatterns);
        PatternGenerator.generateFlip3DHalfCirclePatterns(basic12Patterns, flip3DHalfCirclePatterns);
        PatternGenerator.generateFlip3DQuarterCirclePatterns(basic12Patterns, flip3DQuarterCirclePatterns);

        PatternGenerator.generateTwist3DFullCirclePatterns(basic12Patterns, twist3DFullCirclePatterns);
        PatternGenerator.generateTwist3DHalfCirclePatterns(basic12Patterns, twist3DHalfCirclePatterns);
        PatternGenerator.generateTwist3DQuarterCirclePatterns(basic12Patterns, twist3DQuarterCirclePatterns);

        PatternGenerator.generateFlip3DFullTrammelPatterns(basicTrammelPatterns, flip3DFullTrammelPatterns);
        PatternGenerator.generateFlip3DHalfTrammelPatterns(basicTrammelPatterns, flip3DHalfTrammelPatterns);
        PatternGenerator.generateTwist3DFullTrammelPatterns(basicTrammelPatterns, twist3DFullTrammelPatterns);
        PatternGenerator.generateTwist3DHalfTrammelPatterns(basicTrammelPatterns, twist3DHalfTrammelPatterns);
    }

}