package net.firestaff.mcp.baselab.patterns;

public class PoiPatternHelper {

    static {
        
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

        //
        //
        //
        //

        String lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        String righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p = new Pattern(lefty, righty, "Mirror Isolation Split-Time");
        PoiPatterns.basicPatterns.add(p);
        PoiPatterns.basic12Patterns.add(p);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1 = new Pattern(lefty, righty, "Mirror Isolation Same-Time");
        PoiPatterns.basicPatterns.add(p1);
        PoiPatterns.basic12Patterns.add(p1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p2 = new Pattern(lefty, righty, "Parallel Isolation Same-Time");
        PoiPatterns.basicPatterns.add(p2);
        PoiPatterns.basic12Patterns.add(p2);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p3 = new Pattern(lefty, righty, "Parallel Isolation Split-Time");
        PoiPatterns.basicPatterns.add(p3);
        PoiPatterns.basic12Patterns.add(p3);


        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p4 = new Pattern(lefty, righty, "Mirror Anti-Spin Split-Time");
        PoiPatterns.basicPatterns.add(p4);
        PoiPatterns.basic12Patterns.add(p4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p5 = new Pattern(lefty, righty, "Mirror Anti-Spin Same-Time");
        PoiPatterns.basicPatterns.add(p5);
        PoiPatterns.basic12Patterns.add(p5);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p6 = new Pattern(lefty, righty, "Parallel Anti-Spin Split-Time");
        PoiPatterns.basicPatterns.add(p6);
        PoiPatterns.basic12Patterns.add(p6);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p7 = new Pattern(lefty, righty, "Parallel Anti-Spin Same-Time");
        PoiPatterns.basicPatterns.add(p7);
        PoiPatterns.basic12Patterns.add(p7);


        // point basics

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po = new Pattern(lefty, righty, "Mirror Centered");
        PoiPatterns.pointPatterns.add(po);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po2 = new Pattern(lefty, righty, "Parallel Centered");
        PoiPatterns.pointPatterns.add(po2);


        // there are more you idiot

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po1 = new Pattern(lefty, righty, "Mirror Quarter-Time Centered");
        PoiPatterns.pointPatterns.add(po1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po3 = new Pattern(lefty, righty, "Parallel Quarter-Time Centered");
        PoiPatterns.pointPatterns.add(po3);

        // close

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh = new Pattern(lefty, righty, "Mirror Offset Points");
        PoiPatterns.pointPatterns.add(poh);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh2 = new Pattern(lefty, righty, "Parallel Offset Points");
        PoiPatterns.pointPatterns.add(poh2);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh1 = new Pattern(lefty, righty, "Mirror Quarter-Time Offset Points");
        PoiPatterns.pointPatterns.add(poh1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh3 = new Pattern(lefty, righty, "Parallel Quarter-Time Offset Points");
        PoiPatterns.pointPatterns.add(poh3);

        // full

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof = new Pattern(lefty, righty, "Mirror Side by Side");
        PoiPatterns.pointPatterns.add(pof);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof2 = new Pattern(lefty, righty, "Parallel Side by Side");
        PoiPatterns.pointPatterns.add(pof2);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof1 = new Pattern(lefty, righty, "Mirror Quarter-Time Side by Side");
        PoiPatterns.pointPatterns.add(pof1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof3 = new Pattern(lefty, righty, "Parallel Quarter-Time Side by Side");
        PoiPatterns.pointPatterns.add(pof3);

        //**/


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p8 = new Pattern(lefty, righty, "Hybrid Path:Par-Split |X| Prop:Mir-Split");
        PoiPatterns.basicPatterns.add(p8);
        PoiPatterns.basic12Patterns.add(p8);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p9 = new Pattern(lefty, righty, "Hybrid Path:Par-Same |X| Prop:Mir-Split");
        PoiPatterns.basicPatterns.add(p9);
        PoiPatterns.basic12Patterns.add(p9);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p10 = new Pattern(lefty, righty, "Hybrid Path:Mir-Split |X| Prop:Par-Same");
        PoiPatterns.basicPatterns.add(p10);
        PoiPatterns.basic12Patterns.add(p10);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p11 = new Pattern(lefty, righty, "Hybrid Path:Mir-Same |X| Prop:Par-Same");
        PoiPatterns.basicPatterns.add(p11);
        PoiPatterns.basic12Patterns.add(p11);

        //





        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p12 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Isolation");
        PoiPatterns.basicPatterns.add(p12);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p13 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Isolation");
        PoiPatterns.basicPatterns.add(p13);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p14 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Anti-Spin");
        PoiPatterns.basicPatterns.add(p14);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p15 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Anti-Spin");
        PoiPatterns.basicPatterns.add(p15);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p16 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Hybrid");
        PoiPatterns.basicPatterns.add(p16);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p17 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Hybrid");
        PoiPatterns.basicPatterns.add(p17);




        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s0 = new Pattern(lefty, righty, "Starting Position - Together - Right");
        PoiPatterns.basicPatterns.add(s0);

        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s01 = new Pattern(lefty, righty, "Starting Position - Together - Left");
        PoiPatterns.basicPatterns.add(s01);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s02 = new Pattern(lefty, righty, "Starting Position - Together - Top");
        PoiPatterns.basicPatterns.add(s02);

        lefty =  "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s03 = new Pattern(lefty, righty, "Starting Position - Together - Bottom");
        PoiPatterns.basicPatterns.add(s03);

        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s1 = new Pattern(lefty, righty, "Starting Position - Split Horizontal");
        PoiPatterns.basicPatterns.add(s1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0,0.0";
        Pattern s2 = new Pattern(lefty, righty, "Starting Position - Split Vertical");
        PoiPatterns.basicPatterns.add(s2);

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q0 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Bottom Right");
        PoiPatterns.basicPatterns.add(q0);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q1 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Bottom Left");
        PoiPatterns.basicPatterns.add(q1);

        lefty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q2 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Top Right");
        PoiPatterns.basicPatterns.add(q2);

        lefty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q3 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Top Left");
        PoiPatterns.basicPatterns.add(q3);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,350.0,0,248.0,0.0,0.0,0.0";
        Pattern q4 = new Pattern(lefty, righty, "Starting Position - Cross - Together");
        PoiPatterns.basicPatterns.add(q4);

        lefty = "0,0.025,4.71238898038469,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        Pattern q5 = new Pattern(lefty, righty, "Starting Position - Cross - Apart");
        PoiPatterns.basicPatterns.add(q5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        Pattern q6 = new Pattern(lefty, righty, "Starting Position - Cross - Quartertime");
        PoiPatterns.basicPatterns.add(q6);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        Pattern q7 = new Pattern(lefty, righty, "Starting Position - Perpendicular - Split-Time");
        PoiPatterns.basicPatterns.add(q7);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,145.0,0.0,0.0,0.0";
        Pattern q8 = new Pattern(lefty, righty, "Starting Position - Perpendicular - Together-Time");
        PoiPatterns.basicPatterns.add(q8);


        //32

        PoiPatterns.startingPositions.add(s0);
        PoiPatterns.startingPositions.add(s01);
        PoiPatterns.startingPositions.add(s02);
        PoiPatterns.startingPositions.add(s03);
        PoiPatterns.startingPositions.add(s1);
        PoiPatterns.startingPositions.add(s2);
        PoiPatterns.startingPositions.add(q0);
        PoiPatterns.startingPositions.add(q1);
        PoiPatterns.startingPositions.add(q2);
        PoiPatterns.startingPositions.add(q3);
        PoiPatterns.startingPositions.add(q4);
        PoiPatterns.startingPositions.add(q5);
        PoiPatterns.startingPositions.add(q6);
        PoiPatterns.startingPositions.add(q7);
        PoiPatterns.startingPositions.add(q8);


        // basic Cateye

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t8 = new Pattern(lefty, righty, "Mirror Split-Time Cateye");
        PoiPatterns.basicPatterns.add(t8);
        PoiPatterns.basicTrammelPatterns.add(t8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t9 = new Pattern(lefty, righty, "Mirror Same-Time Cateye");
        PoiPatterns.basicPatterns.add(t9);
        PoiPatterns.basicTrammelPatterns.add(t9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t10 = new Pattern(lefty, righty, "Parallel Same-Time Cateye");
        PoiPatterns.basicPatterns.add(t10);
        PoiPatterns.basicTrammelPatterns.add(t10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t11 = new Pattern(lefty, righty, "Parallel Split-Time Cateye");
        PoiPatterns.basicPatterns.add(t11);
        PoiPatterns.basicTrammelPatterns.add(t11);


        lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t = new Pattern(lefty, righty, "Mirror Quarter-time Cateye");
        PoiPatterns.basicPatterns.add(t);
        //Patterns.basicTrammelPatterns.add(t);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t1 = new Pattern(lefty, righty, "Mirror Quarter-time Perp Cateye");
        PoiPatterns.basicPatterns.add(t1);
        //Patterns.basicTrammelPatterns.add(t1);

        lefty =  "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t2 = new Pattern(lefty, righty, "Parallel Quarter-time 1 Perp Cateye");
        PoiPatterns.basicPatterns.add(t2);
        //Patterns.basicTrammelPatterns.add(t2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t3 = new Pattern(lefty, righty, "Parallel Quarter-time Same Cateye");
        PoiPatterns.basicPatterns.add(t3);
        //Patterns.basicTrammelPatterns.add(t3);



        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t4 = new Pattern(lefty, righty, "Mirror Perp Split-Time Cateye");
        PoiPatterns.basicPatterns.add(t4);
        PoiPatterns.basicTrammelPatterns.add(t4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t5 = new Pattern(lefty, righty, "Mirror Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(t5);
        PoiPatterns.basicTrammelPatterns.add(t5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t6 = new Pattern(lefty, righty, "Parallel Perp Split-Time Cateye");
        PoiPatterns.basicPatterns.add(t6);
        PoiPatterns.basicTrammelPatterns.add(t6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t7 = new Pattern(lefty, righty, "Parallel Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(t7);
        PoiPatterns.basicTrammelPatterns.add(t7);



        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t20 = new Pattern(lefty, righty, "Piston Cateye");
        PoiPatterns.basicPatterns.add(t20);
        PoiPatterns.hybridPathTrammelPatterns.add(t20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t21 = new Pattern(lefty, righty, "Brush-By Cateye");
        PoiPatterns.basicPatterns.add(t21);
        PoiPatterns.hybridPathTrammelPatterns.add(t21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t22 = new Pattern(lefty, righty, "Turning-T Cateye");
        PoiPatterns.basicPatterns.add(t22);
        PoiPatterns.hybridPathTrammelPatterns.add(t22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t23 = new Pattern(lefty, righty, "Poi-Line Cateye");
        PoiPatterns.basicPatterns.add(t23);
        PoiPatterns.hybridPathTrammelPatterns.add(t23);


        lefty = "0,0.025,7.853981633974483,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t24 = new Pattern(lefty, righty, "Cross Cateye");
        PoiPatterns.basicPatterns.add(t24);
        PoiPatterns.basicTrammelPatterns.add(t24);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t25 = new Pattern(lefty, righty, "Yet Another Hybrid-Path Parallel-Same Cateye");
        PoiPatterns.basicPatterns.add(t25);
        //Patterns.hybridPathTrammelPatterns.add(t25);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t26 = new Pattern(lefty, righty, "Mirror 1 Perp Split-Time Cateye");
        PoiPatterns.basicPatterns.add(t26);
        PoiPatterns.basicTrammelPatterns.add(t26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t27 = new Pattern(lefty, righty, "Mirror 1 Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(t27);
        PoiPatterns.basicTrammelPatterns.add(t27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t28 = new Pattern(lefty, righty, "Parallel 1 Perp Split-Time Cateye");
        PoiPatterns.basicPatterns.add(t28);
        PoiPatterns.basicTrammelPatterns.add(t28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t29 = new Pattern(lefty, righty, "Parallel 1 Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(t29);
        PoiPatterns.basicTrammelPatterns.add(t29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t30 = new Pattern(lefty, righty, "Fly-By Cateye");
        PoiPatterns.basicPatterns.add(t30);
        PoiPatterns.hybridPathTrammelPatterns.add(t30);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t31 = new Pattern(lefty, righty, "Linkage Cateye");
        PoiPatterns.basicPatterns.add(t31);
        PoiPatterns.hybridPathTrammelPatterns.add(t31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t32 = new Pattern(lefty, righty, "Low Turning-T Cateye");
        PoiPatterns.basicPatterns.add(t32);
        PoiPatterns.hybridPathTrammelPatterns.add(t32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t33 = new Pattern(lefty, righty, "Poi-Line Alt Cateye");
        PoiPatterns.basicPatterns.add(t33);
        PoiPatterns.hybridPathTrammelPatterns.add(t33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t34 = new Pattern(lefty, righty, "Folding Piston Cateye");
        PoiPatterns.basicPatterns.add(t34);
        PoiPatterns.hybridPathTrammelPatterns.add(t34);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t35 = new Pattern(lefty, righty, "Folding Linkage Cateye");
        PoiPatterns.basicPatterns.add(t35);
        PoiPatterns.hybridPathTrammelPatterns.add(t35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t36 = new Pattern(lefty, righty, "Big-Line Cateye");
        PoiPatterns.basicPatterns.add(t36);
        PoiPatterns.hybridPathTrammelPatterns.add(t36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t37 = new Pattern(lefty, righty, "Pass-Through Cateye");
        PoiPatterns.basicPatterns.add(t37);
        PoiPatterns.hybridPathTrammelPatterns.add(t37);

        // Cateye quartertime / staggered  st

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st8 = new Pattern(lefty, righty, "Staggered Mirror Cateye");
        PoiPatterns.basicPatterns.add(st8);
        PoiPatterns.basicTrammelPatterns.add(st8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st9 = new Pattern(lefty, righty, "Staggered Mirror Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st9);
        //Patterns.basicTrammelPatterns.add(st9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st10 = new Pattern(lefty, righty, "Staggered Parallel Cateye");
        PoiPatterns.basicPatterns.add(st10);
        PoiPatterns.basicTrammelPatterns.add(st10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st11 = new Pattern(lefty, righty, "Staggered Parallel Split-Time Cateye");
        PoiPatterns.basicPatterns.add(st11);
        //Patterns.basicTrammelPatterns.add(st11);



        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st4 = new Pattern(lefty, righty, "Staggered Mirror Perp Cateye");
        PoiPatterns.basicPatterns.add(st4);
        PoiPatterns.basicTrammelPatterns.add(st4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st5 = new Pattern(lefty, righty, "Staggered Mirror Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st5);
        //Patterns.basicTrammelPatterns.add(st5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st6 = new Pattern(lefty, righty, "Staggered Parallel Perp Cateye");
        PoiPatterns.basicPatterns.add(st6);
        PoiPatterns.basicTrammelPatterns.add(st6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st7 = new Pattern(lefty, righty, "Staggered Parallel Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st7);
        //Patterns.basicTrammelPatterns.add(st7);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st20 = new Pattern(lefty, righty, "Mirror Hybrid-Path Split-Time Cateye");
        PoiPatterns.basicPatterns.add(st20);
        PoiPatterns.hybridPathTrammelPatterns.add(st20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st21 = new Pattern(lefty, righty, "Mirror Hybrid-Path Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st21);
        PoiPatterns.hybridPathTrammelPatterns.add(st21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st22 = new Pattern(lefty, righty, "Parallel Hybrid-Path Split-Time Cateye");
        PoiPatterns.basicPatterns.add(st22);
        PoiPatterns.hybridPathTrammelPatterns.add(st22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st23 = new Pattern(lefty, righty, "Parallel Hybrid-Path Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st23);
        PoiPatterns.hybridPathTrammelPatterns.add(st23);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st26 = new Pattern(lefty, righty, "Staggered Mirror 1-Perp Cateye");
        PoiPatterns.basicPatterns.add(st26);
        PoiPatterns.basicTrammelPatterns.add(st26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st27 = new Pattern(lefty, righty, "Staggered Mirror 1-Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st27);
        //Patterns.basicTrammelPatterns.add(st27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st28 = new Pattern(lefty, righty, "Staggered Parallel 1-Perp Cateye");
        PoiPatterns.basicPatterns.add(st28);
        PoiPatterns.basicTrammelPatterns.add(st28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st29 = new Pattern(lefty, righty, "Staggered Parallel 1-Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st29);
        //Patterns.basicTrammelPatterns.add(st29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st30 = new Pattern(lefty, righty, "Mirror Hybrid-Path Perp Split-Time Cateye");
        PoiPatterns.basicPatterns.add(st30);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st31 = new Pattern(lefty, righty, "Mirror Hybrid-Path Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st32 = new Pattern(lefty, righty, "Parallel Hybrid-Path Perp Split-Time Cateye");
        PoiPatterns.basicPatterns.add(st32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st33 = new Pattern(lefty, righty, "Parallel Hybrid-Path Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st34 = new Pattern(lefty, righty, "Mirror Hybrid-Path 1 Perp Split-Time Cateye");
        PoiPatterns.basicPatterns.add(st34);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st35 = new Pattern(lefty, righty, "Mirror Hybrid-Path 1 Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st36 = new Pattern(lefty, righty, "Parallel Hybrid-Path 1 Perp Split-Time Cateye");
        PoiPatterns.basicPatterns.add(st36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st37 = new Pattern(lefty, righty, "Parallel Hybrid-Path 1 Perp Same-Time Cateye");
        PoiPatterns.basicPatterns.add(st37);

        // perpendicular /////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp8 = new Pattern(lefty, righty, "Mirror 1:1 In-Spin Same-Time");
        PoiPatterns.perpendicularPatterns.add(pp8);

        lefty = "0,0.025,3.141592653589793,0,0.025,4.7123889803846896,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp9 = new Pattern(lefty, righty, "Mirror 1:1 In-Spin Split-Time");
        PoiPatterns.perpendicularPatterns.add(pp9);

        lefty =  "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp10 = new Pattern(lefty, righty, "Parallel 1:1 In-Spin Same-Time");
        PoiPatterns.perpendicularPatterns.add(pp10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,4.7123889803846896,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp11 = new Pattern(lefty, righty, "Parallel 1:1 In-Spin Split-Time");
        PoiPatterns.perpendicularPatterns.add(pp11);

        //

        lefty = "0,0.025,4.7123889803846896,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp = new Pattern(lefty, righty, "Mirror 1:1 Anti-Spin Split-Time");
        PoiPatterns.perpendicularPatterns.add(pp);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp1 = new Pattern(lefty, righty, "Mirror 1:1 Anti-Spin Same-Time");
        PoiPatterns.perpendicularPatterns.add(pp1);

        lefty =  "0,0.025,4.7123889803846896,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp2 = new Pattern(lefty, righty, "Parallel 1:1 Anti-Spin Split-Time");
        PoiPatterns.perpendicularPatterns.add(pp2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp3 = new Pattern(lefty, righty, "Parallel 1:1 Anti-Spin Same-Time");
        PoiPatterns.perpendicularPatterns.add(pp3);

        //

        lefty = "0,0.025,0.0,0,0.025,4.7123889803846896,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp4 = new Pattern(lefty, righty, "Parallel 1:1 Hybrid Split-Time");
        PoiPatterns.perpendicularPatterns.add(pp4);

        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp5 = new Pattern(lefty, righty, "Parallel 1:1 Hybrid Same-Time");
        PoiPatterns.perpendicularPatterns.add(pp5);

        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp6 = new Pattern(lefty, righty, "Mirror 1:1 Hybrid Same-Time");
        PoiPatterns.perpendicularPatterns.add(pp6);

        lefty = "0,0.025,0.0,0,0.025,4.7123889803846896,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp7 = new Pattern(lefty, righty, "Mirror 1:1 Hybrid Split-Time");
        PoiPatterns.perpendicularPatterns.add(pp7);

        /////

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p8 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Iso/In-Spin Split-Time");
        PoiPatterns.perpendicularPatterns.add(p1p8);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p9 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Iso/In-Spin Same-Time");
        PoiPatterns.perpendicularPatterns.add(p1p9);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p10 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Iso/In-Spin Same-Time");
        PoiPatterns.perpendicularPatterns.add(p1p10);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p11 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Iso/In-Spin Split-Time");
        PoiPatterns.perpendicularPatterns.add(p1p11);

        //

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p = new Pattern(lefty, righty, "Mirror 1 Perpendicular Anti-Spin Split-Time");
        PoiPatterns.perpendicularPatterns.add(p1p);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p1 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Anti-Spin Same-Time");
        PoiPatterns.perpendicularPatterns.add(p1p1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p2 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Anti-Spin Split-Time");
        PoiPatterns.perpendicularPatterns.add(p1p2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p3 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Anti-Spin Same-Time");
        PoiPatterns.perpendicularPatterns.add(p1p3);

        //

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p4 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Hybrid Split-Time");
        PoiPatterns.perpendicularPatterns.add(p1p4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p5 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Hybrid Same-Time");
        PoiPatterns.perpendicularPatterns.add(p1p5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p6 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Hybrid Split-Time");
        PoiPatterns.perpendicularPatterns.add(p1p6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p7 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Hybrid Same-Time");
        PoiPatterns.perpendicularPatterns.add(p1p7);


        // extra beats    ////////////////////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep8 = new Pattern(lefty, righty, "2bt 1:2 - Mirror In-Spin Split-Time");
        PoiPatterns.extraBeatPatterns.add(ep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep9 = new Pattern(lefty, righty, "2bt 1:2 - Mirror In-Spin Same-Time");
        PoiPatterns.extraBeatPatterns.add(ep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep10 = new Pattern(lefty, righty, "2bt 1:2 - Parallel In-Spin Same-Time");
        PoiPatterns.extraBeatPatterns.add(ep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep11 = new Pattern(lefty, righty, "2bt 1:2 - Parallel In-Spin Split-Time");
        PoiPatterns.extraBeatPatterns.add(ep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep = new Pattern(lefty, righty, "2bt 1:2 - Mirror Anti-Spin Split-Time");
        PoiPatterns.extraBeatPatterns.add(ep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep1 = new Pattern(lefty, righty, "2bt 1:2 - Mirror Anti-Spin Same-Time");
        PoiPatterns.extraBeatPatterns.add(ep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep2 = new Pattern(lefty, righty, "2bt 1:2 - Parallel Anti-Spin Split-Time");
        PoiPatterns.extraBeatPatterns.add(ep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep3 = new Pattern(lefty, righty, "2bt 1:2 - Parallel Anti-Spin Same-Time");
        PoiPatterns.extraBeatPatterns.add(ep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep4 = new Pattern(lefty, righty, "2bt 1:2 - Mirror Hybrid Split-Time");
        PoiPatterns.extraBeatPatterns.add(ep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep5 = new Pattern(lefty, righty, "2bt 1:2 - Mirror Hybrid Same-Time");
        PoiPatterns.extraBeatPatterns.add(ep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep6 = new Pattern(lefty, righty, "2bt 1:2 - Parallel Hybrid Split-Time");
        PoiPatterns.extraBeatPatterns.add(ep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep7 = new Pattern(lefty, righty, "2bt 1:2 - Parallel Hybrid Same-Time");
        PoiPatterns.extraBeatPatterns.add(ep7);

        //

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep8 = new Pattern(lefty, righty, "3bt 1:3 - Mirror In-Spin Split-Time");
        PoiPatterns.extraBeat2Patterns.add(eep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep9 = new Pattern(lefty, righty, "3bt 1:3 - Mirror In-Spin Same-Time");
        PoiPatterns.extraBeat2Patterns.add(eep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep10 = new Pattern(lefty, righty, "3bt 1:3 - Parallel In-Spin Same-Time");
        PoiPatterns.extraBeat2Patterns.add(eep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep11 = new Pattern(lefty, righty, "3bt 1:3 - Parallel In-Spin Split-Time");
        PoiPatterns.extraBeat2Patterns.add(eep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep = new Pattern(lefty, righty, "3bt 1:3 - Mirror Anti-Spin Split-Time");
        PoiPatterns.extraBeat2Patterns.add(eep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep1 = new Pattern(lefty, righty, "3bt 1:3 - Mirror Anti-Spin Same-Time");
        PoiPatterns.extraBeat2Patterns.add(eep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep2 = new Pattern(lefty, righty, "3bt 1:3 - Parallel Anti-Spin Split-Time");
        PoiPatterns.extraBeat2Patterns.add(eep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep3 = new Pattern(lefty, righty, "3bt 1:3 - Parallel Anti-Spin Same-Time");
        PoiPatterns.extraBeat2Patterns.add(eep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep4 = new Pattern(lefty, righty, "3bt 1:3 - Mirror Hybrid Split-Time");
        PoiPatterns.extraBeat2Patterns.add(eep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep5 = new Pattern(lefty, righty, "3bt 1:3 - Mirror Hybrid Same-Time");
        PoiPatterns.extraBeat2Patterns.add(eep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep6 = new Pattern(lefty, righty, "3bt 1:3 - Parallel Hybrid Split-Time");
        PoiPatterns.extraBeat2Patterns.add(eep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep7 = new Pattern(lefty, righty, "3bt 1:3 - Parallel Hybrid Same-Time");
        PoiPatterns.extraBeat2Patterns.add(eep7);

//

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep8 = new Pattern(lefty, righty, "4bt 1:4 - Mirror In-Spin Split-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep9 = new Pattern(lefty, righty, "4bt 1:4 - Mirror In-Spin Same-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep10 = new Pattern(lefty, righty, "4bt 1:4 - Parallel In-Spin Same-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep11 = new Pattern(lefty, righty, "4bt 1:4 - Parallel In-Spin Split-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep = new Pattern(lefty, righty, "4bt 1:4 - Mirror Anti-Spin Split-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep1 = new Pattern(lefty, righty, "4bt 1:4 - Mirror Anti-Spin Same-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep2 = new Pattern(lefty, righty, "4bt 1:4 - Parallel Anti-Spin Split-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep3 = new Pattern(lefty, righty, "4bt 1:4 - Parallel Anti-Spin Same-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep4 = new Pattern(lefty, righty, "4bt 1:4 - Mirror Hybrid Split-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep5 = new Pattern(lefty, righty, "4bt 1:4 - Mirror Hybrid Same-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep6 = new Pattern(lefty, righty, "4bt 1:4 - Parallel Hybrid Split-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep7 = new Pattern(lefty, righty, "4bt 1:4 - Parallel Hybrid Same-Time");
        PoiPatterns.extraBeat3Patterns.add(eeep7);

        //

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep8 = new Pattern(lefty, righty, "5bt 1:5 - Mirror In-Spin Split-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep9 = new Pattern(lefty, righty, "5bt 1:5 - Mirror In-Spin Same-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep10 = new Pattern(lefty, righty, "5bt 1:5 - Parallel In-Spin Same-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep11 = new Pattern(lefty, righty, "5bt 1:5 - Parallel In-Spin Split-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep = new Pattern(lefty, righty, "5bt 1:5 - Mirror Anti-Spin Split-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep1 = new Pattern(lefty, righty, "5bt 1:5 - Mirror Anti-Spin Same-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep2 = new Pattern(lefty, righty, "5bt 1:5 - Parallel Anti-Spin Split-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep3 = new Pattern(lefty, righty, "5bt 1:5 - Parallel Anti-Spin Same-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep4 = new Pattern(lefty, righty, "5bt 1:5 - Mirror Hybrid Split-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep5 = new Pattern(lefty, righty, "5bt 1:5 - Mirror Hybrid Same-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep6 = new Pattern(lefty, righty, "5bt 1:5 - Parallel Hybrid Split-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep7 = new Pattern(lefty, righty, "5bt 1:5 - Parallel Hybrid Same-Time");
        PoiPatterns.extraBeat4Patterns.add(eeeep7);


        // point hybrids

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph8 = new Pattern(lefty, righty, "Mirror Point-Hybrid Isolation Split");
        PoiPatterns.pointHybridPatterns.add(ph8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph9 = new Pattern(lefty, righty, "Mirror Point-Hybrid Isolation Same");
        PoiPatterns.pointHybridPatterns.add(ph9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph10 = new Pattern(lefty, righty, "Parallel Point-Hybrid Isolation Same");
        PoiPatterns.pointHybridPatterns.add(ph10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph11 = new Pattern(lefty, righty, "Parallel Point-Hybrid Isolation Split");
        PoiPatterns.pointHybridPatterns.add(ph11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph = new Pattern(lefty, righty, "Mirror Point-Hybrid Anti-Spin Split *");
        PoiPatterns.pointHybridPatterns.add(ph);

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph1 = new Pattern(lefty, righty, "Mirror Point-Hybrid Anti-Spin Same *");
        PoiPatterns.pointHybridPatterns.add(ph1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph2 = new Pattern(lefty, righty, "Parallel Point-Hybrid Anti-Spin Split");
        PoiPatterns.pointHybridPatterns.add(ph2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph3 = new Pattern(lefty, righty, "Parallel Point-Hybrid Anti-Spin Same");
        PoiPatterns.pointHybridPatterns.add(ph3);

        // point hybrids perp
				/*

				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph8p = new Pattern(lefty, righty, "Mirror Perpendicular Point-Hybrid Isolation Split");
				Patterns.pointHybridPatterns.add(ph8p);

				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph9p = new Pattern(lefty, righty, "Mirror Perpendicular Point-Hybrid Isolation Same");
				Patterns.pointHybridPatterns.add(ph9p);

				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph10p = new Pattern(lefty, righty, "Parallel Perpendicular Point-Hybrid Isolation Same");
				Patterns.pointHybridPatterns.add(ph10p);

				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph11p = new Pattern(lefty, righty, "Parallel Perpendicular Point-Hybrid Isolation Split");
				Patterns.pointHybridPatterns.add(ph11p);

				//

				lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern php = new Pattern(lefty, righty, "Mirror Perpendicular Point-Hybrid Anti-Spin Split *");
				Patterns.pointHybridPatterns.add(php);

				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph1p = new Pattern(lefty, righty, "Mirror Perpendicular Point-Hybrid Anti-Spin Same *");
				Patterns.pointHybridPatterns.add(ph1p);

				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph2p = new Pattern(lefty, righty, "Parallel Perpendicular Point-Hybrid Anti-Spin Split");
				Patterns.pointHybridPatterns.add(ph2p);

				lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph3p = new Pattern(lefty, righty, "Parallel Perpendicular Point-Hybrid Anti-Spin Same");
				Patterns.pointHybridPatterns.add(ph3p);

				/**/
        //

        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps = new Pattern(lefty, righty, "Square Mirror Isolation Split-Time");
        PoiPatterns.squarePatterns.add(ps);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps1 = new Pattern(lefty, righty, "Square Mirror Isolation Same-Time");
        PoiPatterns.squarePatterns.add(ps1);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps2 = new Pattern(lefty, righty, "Square Parallel Isolation Split-Time");
        PoiPatterns.squarePatterns.add(ps2);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps3 = new Pattern(lefty, righty, "Square Parallel Isolation Same-Time");
        PoiPatterns.squarePatterns.add(ps3);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps4 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Split-Time");
        PoiPatterns.squarePatterns.add(ps4);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps5 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Same-Time");
        PoiPatterns.squarePatterns.add(ps5);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps6 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Split-Time");
        PoiPatterns.squarePatterns.add(ps6);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps7 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Same-Time");
        PoiPatterns.squarePatterns.add(ps7);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps8 = new Pattern(lefty, righty, "Square Mirror Hybrid Split-Time");
        PoiPatterns.squarePatterns.add(ps8);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps9 = new Pattern(lefty, righty, "Square Mirror Hybrid Same-Time");
        PoiPatterns.squarePatterns.add(ps9);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps10 = new Pattern(lefty, righty, "Square Parallel Hybrid Split-Time");
        PoiPatterns.squarePatterns.add(ps10);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps11 = new Pattern(lefty, righty, "Square Parallel Hybrid Same-Time");
        PoiPatterns.squarePatterns.add(ps11);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern psp = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Split-Time");
        PoiPatterns.squarePatterns.add(psp);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps1p = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Same-Time");
        PoiPatterns.squarePatterns.add(ps1p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps2p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Split-Time");
        PoiPatterns.squarePatterns.add(ps2p);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps3p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Same-Time");
        PoiPatterns.squarePatterns.add(ps3p);

        //

        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps4p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Split-Time");
        PoiPatterns.squarePatterns.add(ps4p);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps5p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Same-Time");
        PoiPatterns.squarePatterns.add(ps5p);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps6p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Split-Time");
        PoiPatterns.squarePatterns.add(ps6p);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps7p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Same-Time");
        PoiPatterns.squarePatterns.add(ps7p);

//

        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps8p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Split-Time");
        PoiPatterns.squarePatterns.add(ps8p);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps9p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Same-Time");
        PoiPatterns.squarePatterns.add(ps9p);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps10p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Split-Time *");
        PoiPatterns.squarePatterns.add(ps10p);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps11p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Same-Time");
        PoiPatterns.squarePatterns.add(ps11p);


        //// extra beat Cateye


        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et8 = new Pattern(lefty, righty, "Mirror 1:2 Split-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et9 = new Pattern(lefty, righty, "Mirror 1:2 Same-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et10 = new Pattern(lefty, righty, "Parallel 1:2 Same-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et11 = new Pattern(lefty, righty, "Parallel 1:2 Split-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et11);



        /*
        lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et = new Pattern(lefty, righty, "Mirror 1:2 Quarter-time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et1 = new Pattern(lefty, righty, "Mirror 1:2 Quarter-time Perpendicular Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et1);

        lefty =  "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et2 = new Pattern(lefty, righty, "Parallel 1:2 Quarter-time 1 Perpendicular Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty =  "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et3 = new Pattern(lefty, righty, "Parallel 1:2 Quarter-time Same Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et3);
        /**/


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et4 = new Pattern(lefty, righty, "Mirror 1:2 Perp Split-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et5 = new Pattern(lefty, righty, "Mirror 1:2 Perp Same-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et6 = new Pattern(lefty, righty, "Parallel 1:2 Perp Split-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et7 = new Pattern(lefty, righty, "Parallel 1:2 Perp Same-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et7);



        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et20 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid Split-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et21 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid Same-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et22 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid Split-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et23 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid Same-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et23);

        ///


        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et26 = new Pattern(lefty, righty, "Mirror 1:2 1 Perp Split-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et27 = new Pattern(lefty, righty, "Mirror 1:2 1 Perp Same-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et28 = new Pattern(lefty, righty, "Parallel 1:2 1 Perp Split-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et29 = new Pattern(lefty, righty, "Parallel 1:2 1 Perp Same-Time Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et30 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid-Path Perp Staggered Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et30);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et31 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid-Path Perp Staggered Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et32 = new Pattern(lefty, righty, "Stroking Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et33 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid-Path Perp Staggered Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et34 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid-Path 1 Perp Staggered Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et34);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et35 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid-Path 1 Perp Staggered Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et36 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid-Path 1 Perp Staggered Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et37 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid-Path 1 Perp Staggered Cateye");
        PoiPatterns.extraBeatTrammelPatterns.add(et37);

        ///// quarter square

//

        lefty = "0,0.025,8.6393797973719311,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps = new Pattern(lefty, righty, "Square Mirror Isolation Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps2 = new Pattern(lefty, righty, "Square Parallel Isolation Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps2);

        ////

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps4 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps4);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps6 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps6);

        // //

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps8 = new Pattern(lefty, righty, "Square Mirror Hybrid Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps8);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps10 = new Pattern(lefty, righty, "Square Parallel Hybrid Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps10);

        ////

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qpsp = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qpsp);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps2p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps2p);

        ////

        lefty = "0,0.025,8.6393797973719311,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps4p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps4p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps6p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps6p);

//              //

        lefty = "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps8p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Quarter-Time");
        PoiPatterns.quarterSquarePatterns.add(qps8p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps10p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Quarter-Time *");
        PoiPatterns.quarterSquarePatterns.add(qps10p);


        ////////////////////////////////////////////////////////////////////////////////////////////
        // CAPS
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap = new Pattern(lefty, righty, "CAP Path:Mir-Same |X| Prop:Mir-Same");
        PoiPatterns.CAPSPatterns.add(cap);

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap4 = new Pattern(lefty, righty, "CAP Path:Mir-Same |X| Prop:Mir-Same Alt");
        PoiPatterns.CAPSPatterns.add(cap4);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap2 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Par-Split");
        PoiPatterns.CAPSPatterns.add(cap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap6 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Par-Split Alt");
        PoiPatterns.CAPSPatterns.add(cap6);



        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap1 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Mir-Split Hybrid");
        PoiPatterns.CAPSPatterns.add(cap1);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap8 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Mir-Split Hybrid Alt");
        PoiPatterns.CAPSPatterns.add(cap8);


        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap3 = new Pattern(lefty, righty, "CAP Path:Mir-Same |X| Prop:Par-Same Hybrid");
        PoiPatterns.CAPSPatterns.add(cap3);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap7 = new Pattern(lefty, righty, "CAP Path:Mir-Same |X| Prop:Par-Same Hybrid Alt");
        PoiPatterns.CAPSPatterns.add(cap7);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // buzzsaw caps
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap = new Pattern(lefty, righty, "Buzzsaw CAP Path:Same |X| Prop:Mir-Same");
        PoiPatterns.buzzsawCAPSPatterns.add(bcap);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap1 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Split |X| Prop:Mir-Split");
        PoiPatterns.buzzsawCAPSPatterns.add(bcap1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap2 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Same |X| Prop:Par-Same");
        PoiPatterns.buzzsawCAPSPatterns.add(bcap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap3 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Split |X| Prop:Par-Split");
        PoiPatterns.buzzsawCAPSPatterns.add(bcap3);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // Vertical CAPS
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap = new Pattern(lefty, righty, "CAP Path:Mir-Split |X| Prop:Mir-Split High/Low");
        PoiPatterns.verticalCAPSPatterns.add(vcap);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap4 = new Pattern(lefty, righty, "CAP Path:Mir-Split |X| Prop:Mir-Split Alt High/Low");
        PoiPatterns.verticalCAPSPatterns.add(vcap4);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap2 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Par-Split High/Low");
        PoiPatterns.verticalCAPSPatterns.add(vcap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap6 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Par-Split Alt High/Low");
        PoiPatterns.verticalCAPSPatterns.add(vcap6);



        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap1 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Mir-Same Hybrid High/Low");
        PoiPatterns.verticalCAPSPatterns.add(vcap1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap8 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Mir-Same Hybrid Alt High/Low");
        PoiPatterns.verticalCAPSPatterns.add(vcap8);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap3 = new Pattern(lefty, righty, "CAP Path:Mir-Split |X| Prop:Par-Same Hybrid High/Low");
        PoiPatterns.verticalCAPSPatterns.add(vcap3);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap7 = new Pattern(lefty, righty, "CAP Path:Mir-Split |X| Prop:Par-Same Hybrid Alt High/Low");
        PoiPatterns.verticalCAPSPatterns.add(vcap7);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // Ping Pongs
        ////////////////////////////////////////////////////////////////////////////////////////////


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp = new Pattern(lefty, righty, "PingPong - Mirror Isolation Same-Time");
        PoiPatterns.pingpongPatterns.add(pongp);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp1 = new Pattern(lefty, righty, "PingPong - Mirror Isolation Split-Time");
        PoiPatterns.pingpongPatterns.add(pongp1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp2 = new Pattern(lefty, righty, "PingPong - Parallel Isolation Same-Time");
        PoiPatterns.pingpongPatterns.add(pongp2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (0) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp3 = new Pattern(lefty, righty, "PingPong - Parallel Isolation Split-Time");
        PoiPatterns.pingpongPatterns.add(pongp3);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp4 = new Pattern(lefty, righty, "PingPong - Mirror Anti-Spin Same-Time");
        PoiPatterns.pingpongPatterns.add(pongp4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp5 = new Pattern(lefty, righty, "PingPong - Mirror Anti-Spin Split-Time");
        PoiPatterns.pingpongPatterns.add(pongp5);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp6 = new Pattern(lefty, righty, "PingPong - Parallel Anti-Spin Split-Time");
        PoiPatterns.pingpongPatterns.add(pongp6);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp7 = new Pattern(lefty, righty, "PingPong - Parallel Anti-Spin Same-Time");
        PoiPatterns.pingpongPatterns.add(pongp7);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + (Math.PI + Math.PI/2) + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp8 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Par-Split |X| Prop:Mir-Split");
        PoiPatterns.pingpongPatterns.add(pongp8);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp9 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Par-Same |X| Prop:Mir-Split");
        PoiPatterns.pingpongPatterns.add(pongp9);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp10 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Mir-Split |X| Prop:Par-Same");
        PoiPatterns.pingpongPatterns.add(pongp10);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (0) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp11 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Mir-Same |X| Prop:Par-Same");
        PoiPatterns.pingpongPatterns.add(pongp11);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // Chuu chuus
        ////////////////////////////////////////////////////////////////////////////////////////////

        /*
        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern chuup = new Pattern(lefty, righty, "ChuuChuu - Mirror Isolation Split-Time");
        PoiPatterns.basicChuuChuuPatterns.add(chuup);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern chuup1 = new Pattern(lefty, righty, "ChuuChuu - Mirror Isolation Same-Time");
        PoiPatterns.basicChuuChuuPatterns.add(chuup1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern chuup2 = new Pattern(lefty, righty, "ChuuChuu - Parallel Isolation Same-Time");
        PoiPatterns.basicChuuChuuPatterns.add(chuup2);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern chuup3 = new Pattern(lefty, righty, "ChuuChuu - Parallel Isolation Split-Time");
        PoiPatterns.basicChuuChuuPatterns.add(chuup3);
        /**/

        lefty = "0,0.025,4.71238898038469,0,0.025,-3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + Math.PI ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + Math.PI + ",FullReverse," + Math.PI;
        Pattern chuup1s = new Pattern(lefty, righty, "The Chuu Chuu Snake");
        PoiPatterns.snakeChuuChuuPatterns.add(chuup1s);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + 0 ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + 0 + ",FullReverse," + Math.PI;
        Pattern chuups = new Pattern(lefty, righty, "Chuu Chhu Snake - Ur Doing it Wrong");
        PoiPatterns.snakeChuuChuuPatterns.add(chuups);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + Math.PI ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + 0 + ",FullReverse," + Math.PI;
        Pattern chuup2s = new Pattern(lefty, righty, "Half a Chuu Chuu Snake");
        PoiPatterns.snakeChuuChuuPatterns.add(chuup2s);

        lefty =  "0,0.025,4.71238898038469,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + 0 ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + Math.PI + ",FullReverse," + 0;
        Pattern chuup3s = new Pattern(lefty, righty, "One Sided Chuu Chuu Snake");
        PoiPatterns.snakeChuuChuuPatterns.add(chuup3s);


    }

}
