package net.firestaff.mcp.baselab.patterns;

import java.util.List;

public class PatternGenerator {

    private static String turnProp(String left, double value) {
        String l = left.substring(8, left.lastIndexOf(",0,0.025"));
        String turn = "" + (Double.parseDouble(l) + value);
        left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
        return left;
    }

    private static String pushPath(String left, double value) {
        String l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
        String turn2 = "" + (Double.parseDouble(l2) + value);
        left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
        return left;
    }


    static void generatePoiAltPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();

            String name = p.getName() + " - Both Out";
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            left = turnProp(left, Math.PI);
            right = turnProp(right, Math.PI);
            name = p.getName() + " - Both In";
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            left = turnProp(left, -Math.PI);
            name = p.getName() + " - 1In:1Out";
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            left = turnProp(left, Math.PI);
            right = turnProp(right, -Math.PI);
            name = p.getName() + " - 1Out:1In";
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateRTypePatterns(List<Pattern> input, List<Pattern> output){
        for (int i = 0; i < 4; i++) {
            Pattern p = input.get(i);
            String left = p.getLeftText();
            String right = p.getRightText();
            // Propspeed to ZERO
            left = left.replace(",Circle,1.0,", ",Circle,0.0,");
            right = right.replace(",Circle,1.0,", ",Circle,0.0,");

            String name = "R-Type: " + p.getName();
            if(name.contains("Isolation")) {
                int index = name.indexOf("Isolation");
                name = name.substring(0,index) + name.substring(index + 9, name.length());
            }
            output.add(new Pattern(left, right, name));
        }
        for (int i = 0; i < 4; i++) {
            Pattern p = input.get(i);
            String left = p.getLeftText();
            String right = p.getRightText();
            // Propspeed to ZERO
            left = left.replace(",Circle,1.0,", ",Circle,0.0,");
            right = right.replace(",Circle,1.0,", ",Circle,0.0,");

            String name = "R-Type: " + p.getName();
            if(name.contains("Isolation")) {
                int index = name.indexOf("Isolation");
                name = name.substring(0,index) + name.substring(index + 9, name.length());
                String l = left.substring(8, left.lastIndexOf(",0,0.025"));
                String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
                left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
                String r = right.substring(8, right.lastIndexOf(",0,0.025"));
                String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
                right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
                name = name + " Perpendicular";
            }
            output.add(new Pattern(left, right, name));
        }
        for (int i = 0; i < 4; i++) {
            Pattern p = input.get(i);
            String left = p.getLeftText();
            String right = p.getRightText();
            // Propspeed to ZERO
            left = left.replace(",Circle,1.0,", ",Circle,0.0,");
            right = right.replace(",Circle,1.0,", ",Circle,0.0,");

            String name = "R-Type: " + p.getName();
            if(name.contains("Isolation")) {
                int index = name.indexOf("Isolation");
                name = name.substring(0,index) + name.substring(index + 9, name.length());
                String r = right.substring(8, right.lastIndexOf(",0,0.025"));
                String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
                right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
                name = name + " 1 Perpendicular";
            }
            output.add(new Pattern(left, right, name));
        }

    }

    static void generateSuperspinPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("1.0,9.0", "2.0,9.0");
            right = right.replace("1.0,9.0", "2.0,9.0");

            String name = "Super-Spin " + p.getName();
            name = name.replace("Isolation", "In-Spin");

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateDirChangePatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();

            left = left.replace(",345.0", ",345.0," + Math.PI);

            right = right.replace(",345.0", ",345.0," + Math.PI);

            String name = "Direction Change " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateDirChangeVerticalPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();

            left = left.replace(",345.0", ",345.0," + Math.PI + "," + (Math.PI / 2));

            right = right.replace(",345.0", ",345.0," + Math.PI + "," + (Math.PI / 2));

            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);


            String name = "Dir-Change Vertical " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateDirChangeHybridPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();

            left = left.replace(",345.0", ",345.0," + Math.PI + "," + (Math.PI / 2));

            right = right.replace(",345.0", ",345.0," + Math.PI);

            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);


            String name = "Dir-Change Vertical " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateHalfCirclePatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "HalfVerticalLeftComplexShape");
            right = right.replace("Circle", "HalfVerticalRightComplexShape");
            String name = "" + p.getName() + " CAP";
            if(!name.contains("Anti-Spin")) {
                if(name.contains("Isolation")) {
                    int index = name.indexOf("Isolation");
                    name = name.substring(0,index) + name.substring(index + 9, name.length());
                    // Turn Prop
                    String l = left.substring(8, left.lastIndexOf(",0,0.025"));
                    String turn = "" + (Double.parseDouble(l) + Math.PI);
                    left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

                }
                output.add(new Pattern(left, right, name));
            }
        }
    }

    static void generateVerticalLinePatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Line", "VerticalLine");
            right = right.replace("Line", "VerticalLine");
            String name = "Vertical " + p.getName();
            name = name.replace("Insolation", "In-Spin");
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateUnderArmourHPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "HUnderArmour");
            right = right.replace("Circle", "HUnderArmour");
            String name = "H Under-Armour " + p.getName();
            name = name.replace("Insolation", "In-Spin");

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateThreeQuarterPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "QuartersByThree");
            right = right.replace("Circle", "QuartersByThree");

            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);


            String name = "Three-Quarter " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateThreeQuarterHybridPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "QuartersByThree");
            //right = right.replace("Circle", "QuartersByThree");

            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            //String r = right.substring(8,right.lastIndexOf(",0,0.025"));
            //String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
            //right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);


            String name = "Three-Quarter Hybrid " + p.getName();

            output.add(new Pattern(left, right, name));
        }

        for (Pattern p : (input.subList(8, input.size()))) {
            String left = p.getLeftText();
            String right = p.getRightText();
            //left = left.replace("Circle", "QuartersByThree");
            right = right.replace("Circle", "QuartersByThree");

            //String l = left.substring(8,left.lastIndexOf(",0,0.025"));
            //String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
            //left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);


            String name = "Three-Quarter Hybrid " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }



    static void generateTranslatedCirclePatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "TranslatedCircle");
            right = right.replace("Circle", "TranslatedCircle");

            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);


            String name = "Translated-Circle " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateTranslatedQuartersPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "TranslatedQuarter");
            right = right.replace("Circle", "TranslatedQuarter");
            String name = "Translated-Quarter " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generatePausedQuarterPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "PausedQuarterFourComplexShape");
            right = right.replace("Circle", "PausedQuarterFourComplexShape");
            String name = "Paused-Quarter " + p.getName();

            String l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            String turn2 = "" + (Double.parseDouble(l2) * 2);
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");

            String r2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            String turnr2 = "" + (Double.parseDouble(r2) * 2);
            right = right.replaceFirst(",0,0.025," + r2 + ",1.0", ",0,0.025," + turnr2 + ",1.0");


            output.add(new Pattern(left, right, name));
        }
    }

    static void generatePausedHalfPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "PausedHalfTwoComplexShape");
            right = right.replace("Circle", "PausedHalfTwoComplexShape");
            String name = "Paused-Half " + p.getName();

            String l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            String turn2 = "" + (Double.parseDouble(l2) * 2);
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");

            String r2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            String turnr2 = "" + (Double.parseDouble(r2) * 2);
            right = right.replaceFirst(",0,0.025," + r2 + ",1.0", ",0,0.025," + turnr2 + ",1.0");


            output.add(new Pattern(left, right, name));
        }
    }

    static void generatePausedFullPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "PausedFullOneComplexShape");
            right = right.replace("Circle", "PausedFullOneComplexShape");
            String name = "Paused-Full " + p.getName();

            String l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            String turn2 = "" + (Double.parseDouble(l2) * 2);
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");

            String r2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            String turnr2 = "" + (Double.parseDouble(r2) * 2);
            right = right.replaceFirst(",0,0.025," + r2 + ",1.0", ",0,0.025," + turnr2 + ",1.0");


            output.add(new Pattern(left, right, name));
        }
    }


    static void generatePointHybridPerpPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();

            // 0,0.025,
            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);

            String name = "Perpendicular " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateQuartertimePatterns(List<Pattern> input, List<Pattern> output, List<Pattern> basicPatterns) {
        output.add(basicPatterns.get(12));
        output.add(basicPatterns.get(13));
        output.add(basicPatterns.get(14));
        output.add(basicPatterns.get(15));
        output.add(basicPatterns.get(16));
        output.add(basicPatterns.get(17));
    }

    static void generateBasicTrammelPatterns(List<Pattern> output) {
        //output.addAll(basicPatterns.subList(33, 79));
    }

    static void generateHybridPathTrammelPatterns(List<Pattern> output, List<Pattern> basicPatterns) {
        output.addAll(basicPatterns.subList(79, 87));
    }

    static void generateBasicIsolationPatterns(List<Pattern> output, List<Pattern> basicPatterns) {
        output.addAll(basicPatterns.subList(0, 4));
    }

    static void generateBasicAntispinPatterns(List<Pattern> output, List<Pattern> basicPatterns) {
        output.addAll(basicPatterns.subList(4, 8));
    }

    static void generateBasicHybridPatterns(List<Pattern> output, List<Pattern> basicPatterns) {
        output.addAll(basicPatterns.subList(8, 12));
    }

    static void generateDiagonalPatterns(List<Pattern> output, List<Pattern> input) {
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();

            // 0,0.025,
            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + (Math.PI/4));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + (Math.PI/4));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);

            String l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            String turn2 = "" + (Double.parseDouble(l2) + (Math.PI/4));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");

            String r2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            String turnr2 = "" + (Double.parseDouble(r2) + (Math.PI/4));
            //right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r2, turnr2);
            right = right.replaceFirst(",0,0.025," + r2 + ",1.0", ",0,0.025," + turnr2 + ",1.0");

            String name = "Diagonal " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateHypocycloidPatterns(List<Pattern> output, List<Pattern> input){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "Hypocycloid");
            right = right.replace("Circle", "Hypocycloid");
            String name = "Box " + p.getName();
            name = name.replace("Isolation", "In-Spin");

            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
            output.add(new Pattern(left, right, name));
        }
    }
    // TODO this needs more intervals
    static void generateTranslatedHalfPatterns(List<Pattern> output, List<Pattern> input){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "TranslatedHalfComplexShape");
            right = right.replace("Circle", "TranslatedHalfComplexShape");
            String name = "Vertical 1/2 " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateSameSideCAPSPatterns(List<Pattern> output, List<Pattern> input){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("HalfVerticalLeftComplexShape", "HalfVerticalRightComplexShape");
            //right = right.replace("Circle", "HalfVerticalRightComplexShape");
            String name = "Buzzsaw CAP " + p.getName();

            output.add(new Pattern(left, right, name));
        }
    }

    static void generateTranslatedQuarterPatterns(List<Pattern> output, List<Pattern> input){
        for (Pattern p : input) {
            if(p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if(p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "TranslatedQuarterComplexShape");
            right = right.replace("Circle", "TranslatedQuarterComplexShape");
            String name = "HCB " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            String l2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            String turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            right = right.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            String l = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(l, turn);

            name = "HCB:90 " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Close-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Close-1/4-");
            else name = name + " " + "Close-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            right = right.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = right.substring(8, right.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(l, turn);

            name = "HCB:180 " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "180-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "180-Offset-");
            else name = name + " " + "180-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            right = right.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = right.substring(8, right.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(l, turn);

            name = "HCB:270 " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "270-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "270-Offset-");
            else name = name + " " + "270-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            right = right.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = right.substring(8, right.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(l, turn);

            name = "HCB:360 " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "360-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "360-Offset-");
            else name = name + " " + "360-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            right = right.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = right.substring(8, right.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(l, turn);

            name = "HCB:450 " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " " + "Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = right.substring(right.indexOf(",0,0.025,") + 9, right.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            right = right.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = right.substring(8, right.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(l, turn);

            name = "HCB:540 " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            else name = name + " " + "Split-Time";
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateBasicChuuChuuPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            // Propspeed to ZERO
            left = left.replace(",Circle,1.0,", ",Circle,0.0,");
            right = right.replace(",Circle,1.0,", ",Point,1.0,");

            String name = "Centered CC: " + p.getName();
            if(name.contains("Isolation")) {
                int index = name.indexOf("Isolation");
                name = name.substring(0,index) + name.substring(index + 9, name.length());
            }
            if(name.contains("Anti-Spin")) {
                int index = name.indexOf("Anti-Spin");
                name = name.substring(0,index) + name.substring(index + 9, name.length());
                String l = left.substring(8, left.lastIndexOf(",0,0.025"));
                String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
                left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
                String r = right.substring(8, right.lastIndexOf(",0,0.025"));
                String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
                right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
                name = name + " Perpendicular";
            }
            if(name.contains("Hybrid")) {
                int index = name.indexOf("Hybrid");
                name = name.substring(0,index) + name.substring(index + 6, name.length());
                String r = right.substring(8, right.lastIndexOf(",0,0.025"));
                String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
                right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
                name = name + " 1 Perpendicular";
            }
            output.add(new Pattern(left, right, name));

            name = "Chuu Chuu: " + p.getName();
            left = left.replace("250.0,0,345.0", "146.0,0,345.0");
            //right = right.replace("250.0,0,345.0", "350.0,0,345.0");
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateSnakeChuuChuuPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            // Propspeed to ZERO
            left = left.replace(",Circle,1.0,", ",PausedCapHalfTwoComplexShape,1.0,");
            right = right.replace(",Circle,1.0,", ",PausedCapHalfTwoComplexShape,1.0,");

            String name = "Chuu Chuu Snake: " + p.getName();
            if(name.contains("Isolation")) {
                int index = name.indexOf("Isolation");
                name = name.substring(0,index) + name.substring(index + 9, name.length());

            }
            if(name.contains("Anti-Spin")) {
                int index = name.indexOf("Anti-Spin");
                name = name.substring(0,index) + name.substring(index + 9, name.length());
                /*
                String l = left.substring(8, left.indexOf(",0,0.025"));
                String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
                left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
                String r = right.substring(right.indexOf("0,0.025") + 8, right.indexOf(",0,0.025"));
                String turnr = "" + (Double.parseDouble(r) + Math.PI);
                right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
                /**/

                name = name + " Perpendicular";
            }
            if(name.contains("Hybrid")) {
                int index = name.indexOf("Hybrid");
                name = name.substring(0,index) + name.substring(index + 6, name.length());

                String r = right.substring(right.indexOf("0,0.025") + 8, right.indexOf(",0,0.025"));
                String turnr = "" + (Double.parseDouble(r) + Math.PI);
                right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
                //right = right + ",0,0,FullCC";
                name = name + " 1 Perpendicular"; // goes other way round circle???? WTF
            }
            right = right + ",0,0,HalfCC,0.0,FullReverse," + Math.PI ; // pushes shape
            left = left + ",0,0,HalfCC," + Math.PI + ",FullReverse," + Math.PI;

            output.add(new Pattern(left, right, name));
        }
    }

    static void generatePingpongPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            // Propspeed to ZERO
            left = left.replace(",Circle,1.0,", ",PausedCapHalfTwoComplexShape,1.0,");
            right = right.replace(",Circle,1.0,", ",PausedCapHalfTwoComplexShape,1.0,");

            String name = "Pingpong: " + p.getName();

            right = turnProp(right, Math.PI/2);
            left = turnProp(left, Math.PI/2);
            left = left + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1;
            right = right + ",0," + Math.PI/2 + ",HalfCC," + Math.PI; // pushes shape


            output.add(new Pattern(left, right, name));
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    // FOUR
    ////////////////////////////////////////////////////////////////////////////////////////////////

    static void generateFOURSoloQuarterPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            if(p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if(p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "QuarterTopRightComplexShape");
            right = right.replace("Circle", "Circle");

            // Turn Staff
            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            String name = "1/4: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Quarter-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Quarter-");
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            String l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            String turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = left.substring(8, left.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "1/2: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = left.substring(8, left.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "3/4: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Quarter-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Quarter-");
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = left.substring(8, left.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "4/4: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateFOURUltimateQuarterPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            if(p.getName().contains("Same-Time") && !p.getName().contains("Hybrid")) continue;
            if(p.getName().contains("Tog-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "SteppedQuarterCAPComplexShape");
            right = right.replace("Circle", "Circle");
            String name = "Permutation: " + p.getName();
            name = name.replace("Isolation", "In-Spin");

            output.add(new Pattern(left, right, name));

            // Turn Staff
            left = pushPath(left, (Math.PI/2));
            left = turnProp(left, (Math.PI/2));

            name = "Permutation: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Quarter-Time");
            name = name.replace("Split-Time", "Quarter-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Quarter-");
            if(!name.contains("Hybrid"))  name = name.replace("Split-", "Quarter-");
            output.add(new Pattern(left, right, name));


        }
    }

    static void generateFOURSteppedQuarterPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            if(p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if(p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "SteppedQuarterCAPComplexShape");
            right = right.replace("Circle", "SteppedQuarterCAPComplexShape");
            String name = "8StepCap: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            String l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            String turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "8StepCap: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Close-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Close-1/4-");
            else name = name + " Close-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = left.substring(8, left.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "8StepCap: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "180-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "180-Offset-");
            else name = name + " 180-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = left.substring(8, left.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "8StepCap: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Half-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Half-1/4-");
            else name = name + " Half-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = left.substring(8, left.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "8StepCap: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "360-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "360-Offset-");
            else name = name + " 360-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = left.substring(8, left.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "8StepCap: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            // Push Path
            l2 = left.substring(left.indexOf(",0,0.025,") + 9, left.indexOf(",1.0"));
            turn2 = "" + (Double.parseDouble(l2) + (Math.PI/2));
            left = left.replaceFirst(",0,0.025," + l2 + ",1.0", ",0,0.025," + turn2 + ",1.0");
            // Turn Staff
            l = left.substring(8, left.lastIndexOf(",0,0.025"));
            turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

            name = "8StepCap: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            else name = name + " Split-Time";
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateSluiceGatePatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "TranslatedQuarterComplexShape");
            right = right.replace("Circle", "TranslatedQuarterComplexShape");
            String name = "Permutation: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            right = right + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
            left = left + ",0,0,QuarterHalfCC," + (Math.PI) * -1;

            output.add(new Pattern(left, right, name));
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    // Peanuts
    ////////////////////////////////////////////////////////////////////////////////////////////////

    static void generateGTPeanutPatterns(List<Pattern> input, List<Pattern> output){
        for (Pattern p : input) {
            if(p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if(p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "GTPeanutComplexShape");
            right = right.replace("Circle", "GTPeanutComplexShape");

            //left = turnProp(left, (Math.PI/2));
            //right = turnProp(right, (Math.PI/2));

            String l = left.substring(8, left.lastIndexOf(",0,0.025"));
            String turn = "" + (Double.parseDouble(l) + (Math.PI/2));
            left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
            if(p.getName().contains("Mirror") || p.getName().contains("Opp") ||
                    p.getName().contains("Prop:Mir")) left = turnProp(left, (Math.PI/2));
            if(p.getName().contains("Prop:Tog")) left = turnProp(left, (Math.PI/2));

            String r = right.substring(8, right.lastIndexOf(",0,0.025"));
            String turnr = "" + (Double.parseDouble(r) + (Math.PI/2));
            right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);

            left = left + ",0," + (Math.PI/2);
            right = right + ",0," + (Math.PI/2);
            left = turnProp(left, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            String name = "Peanut: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Peanut: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "1/4-");
            else name = name + " 1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Peanut: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "180-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "180-Offset-");
            else name = name + " 180-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Peanut: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Peanut: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            else name = name + " Split-Time";
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateGTPlusKnotPatterns(List<Pattern> input, List<Pattern> output) {
        for (Pattern p : input) {
            if(p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if(p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "GTPlusKnotComplexShape");
            right = right.replace("Circle", "GTPlusKnotComplexShape");

            left = turnProp(left, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));
            if(p.getName().contains("Mirror") || p.getName().contains("Opp") ||
                    p.getName().contains("Prop:Mir")) left = turnProp(left, (Math.PI/2));
            if(p.getName().contains("Prop:Tog")) left = turnProp(left, (Math.PI/2));

            String name = "+Knot: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "+Knot 90: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "1/4-");
            else name = name + " 1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "+Knot 180: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "180-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "180-Offset-");
            else name = name + " 180-Offset-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "+Knot 270: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Close-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Close-1/4-");
            else name = name + " Close-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "+Knot 360: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "360-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "360-Offset-");
            else name = name + " 360-Offset-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "+Knot 450: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "+Knot 540: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "540-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "540-Offset-");
            else name = name + " 540-Offset-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "+Knot 630: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Further-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Further-1/4-");
            else name = name + " Further-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "+Knot 720: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            else name = name + " Split-Time";
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateGTSwitchbackPatterns(List<Pattern> input, List<Pattern> output) {
        for (Pattern p : input) {
            if (p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if (p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "GTSwitchbackComplexShape");
            right = right.replace("Circle", "GTSwitchbackComplexShape");

            String name = "Switchback: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback 90:" + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "1/4-");
            else name = name + " 1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback 180: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "180-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "180-Offset-");
            else name = name + " 180-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback 270: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback 360: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "360-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "360-Offset-");
            else name = name + " 360-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback 450: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback 540: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "540-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "540-Offset-");
            else name = name + " 540-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback 630: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Further-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Further-1/4-");
            else name = name + " Further-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback 720: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            else name = name + " Split-Time";
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateGTSwitchbackPlusPatterns(List<Pattern> input, List<Pattern> output) {
        for (Pattern p : input) {
            if (p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if (p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "GTSwitchbackPlusComplexShape");
            right = right.replace("Circle", "GTSwitchbackPlusComplexShape");


            String name = "Switchback+: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback+ 90:" + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "1/4-");
            else name = name + " 1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback+ 180: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "180-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "180-Offset-");
            else name = name + " 180-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback+ 270: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback+ 360: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "360-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "360-Offset-");
            else name = name + " 360-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback+ 450: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback+ 540: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "540-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "540-Offset-");
            else name = name + " 540-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback+ 630: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Further-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Further-1/4-");
            else name = name + " Further-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Switchback+ 720: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            else name = name + " Split-Time";
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateGTThreeBeatKnotPatterns(List<Pattern> input, List<Pattern> output) {
        for (Pattern p : input) {
            if (p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if (p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "GTThreeBeatKnotComplexShape");
            right = right.replace("Circle", "GTThreeBeatKnotComplexShape");


            String name = "3Bt Knot: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "3Bt Knot 90:" + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "1/4-");
            else name = name + " 1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "3Bt Knot 180: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "180-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "180-Offset-");
            else name = name + " 180-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "3Bt Knot 270: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "3Bt Knot 360: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "360-Offset");
            if(!name.contains("Hybrid"))  name = name.replace("Tog-", "360-Offset-");
            else name = name + " 360-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "3Bt Knot 450: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "3Bt Knot 540: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "540-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "540-Offset-");
            else name = name + " 540-Offset-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "3Bt Knot 630: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Further-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Further-1/4-");
            else name = name + " Further-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "3Bt Knot 720: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            else name = name + " Split-Time";
            output.add(new Pattern(left, right, name));
        }
    }

    static void generateGTHalfPlusPatterns(List<Pattern> input, List<Pattern> output) {
        for (Pattern p : input) {
            if (p.getName().contains("Split-Time") && !p.getName().contains("Hybrid")) continue;
            if (p.getName().contains("Split-") && !p.getName().contains("Hybrid")) continue;

            String left = p.getLeftText();
            String right = p.getRightText();
            left = left.replace("Circle", "GTHalfPlusComplexShape");
            right = right.replace("Circle", "GTHalfPlusComplexShape");

            if(p.getName().contains("Mirror") || p.getName().contains("Opp") ||
                    p.getName().contains("Prop:Mir")) right = turnProp(right, (Math.PI/2));
            if(p.getName().contains("Prop:Tog")) right = turnProp(right, (Math.PI/2));

            if(p.getName().contains("Hybrid")) right = turnProp(right, (Math.PI/2));

            if(p.getName().contains("Anti-Spin")) {
                right = turnProp(right, (Math.PI/2));
                left = turnProp(left, (Math.PI/2));
            }


            String name = "Half+: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Half+ 90:" + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "1/4-");
            else name = name + " 1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Half+ 180: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "180-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "180-Offset-");
            else name = name + " 180-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Half+ 270: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "270-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "270-Offset-");
            else name = name + " 270-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Half+ 360: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "360-Offset");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "360-Offset-");
            else name = name + " 360-Offset";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Half+ 450: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Far-1/4-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Far-1/4-");
            else name = name + " Far-1/4-Time";
            output.add(new Pattern(left, right, name));

            // NEXT
            right = pushPath(right, (Math.PI/2));
            right = turnProp(right, (Math.PI/2));

            name = "Half+ 540: " + p.getName();
            name = name.replace("Isolation", "In-Spin");
            name = name.replace("Same-Time", "Split-Time");
            if(!name.contains("Hybrid")) name = name.replace("Tog-", "Split-");
            else name = name + " Split-Time";
            output.add(new Pattern(left, right, name));
        }
    }
}
