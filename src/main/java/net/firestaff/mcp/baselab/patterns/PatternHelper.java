package net.firestaff.mcp.baselab.patterns;

//import dagger.Module;

//@Module
public class PatternHelper {


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
        Patterns.basicPatterns.add(p);
        Patterns.basic12Patterns.add(p);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1 = new Pattern(lefty, righty, "Mirror Isolation Same-Time");
        Patterns.basicPatterns.add(p1);
        Patterns.basic12Patterns.add(p1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p2 = new Pattern(lefty, righty, "Parallel Isolation Same-Time");
        Patterns.basicPatterns.add(p2);
        Patterns.basic12Patterns.add(p2);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p3 = new Pattern(lefty, righty, "Parallel Isolation Split-Time");
        Patterns.basicPatterns.add(p3);
        Patterns.basic12Patterns.add(p3);


        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p4 = new Pattern(lefty, righty, "Mirror Anti-Spin Split-Time");
        Patterns.basicPatterns.add(p4);
        Patterns.basic12Patterns.add(p4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p5 = new Pattern(lefty, righty, "Mirror Anti-Spin Same-Time");
        Patterns.basicPatterns.add(p5);
        Patterns.basic12Patterns.add(p5);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p6 = new Pattern(lefty, righty, "Parallel Anti-Spin Split-Time");
        Patterns.basicPatterns.add(p6);
        Patterns.basic12Patterns.add(p6);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p7 = new Pattern(lefty, righty, "Parallel Anti-Spin Same-Time");
        Patterns.basicPatterns.add(p7);
        Patterns.basic12Patterns.add(p7);


        // point basics

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po = new Pattern(lefty, righty, "Mirror Centered");
        Patterns.pointPatterns.add(po);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po2 = new Pattern(lefty, righty, "Parallel Centered");
        Patterns.pointPatterns.add(po2);


        // there are more you idiot

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po1 = new Pattern(lefty, righty, "Mirror Quarter-Time Centered");
        Patterns.pointPatterns.add(po1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po3 = new Pattern(lefty, righty, "Parallel Quarter-Time Centered");
        Patterns.pointPatterns.add(po3);

        // close

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh = new Pattern(lefty, righty, "Mirror Offset Points");
        Patterns.pointPatterns.add(poh);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh2 = new Pattern(lefty, righty, "Parallel Offset Points");
        Patterns.pointPatterns.add(poh2);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh1 = new Pattern(lefty, righty, "Mirror Quarter-Time Offset Points");
        Patterns.pointPatterns.add(poh1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh3 = new Pattern(lefty, righty, "Parallel Quarter-Time Offset Points");
        Patterns.pointPatterns.add(poh3);

        // full

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof = new Pattern(lefty, righty, "Mirror Side by Side");
        Patterns.pointPatterns.add(pof);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof2 = new Pattern(lefty, righty, "Parallel Side by Side");
        Patterns.pointPatterns.add(pof2);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof1 = new Pattern(lefty, righty, "Mirror Quarter-Time Side by Side");
        Patterns.pointPatterns.add(pof1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof3 = new Pattern(lefty, righty, "Parallel Quarter-Time Side by Side");
        Patterns.pointPatterns.add(pof3);

        //**/


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p8 = new Pattern(lefty, righty, "Hybrid Path:Par-Split |X| Prop:Mir-Split");
        Patterns.basicPatterns.add(p8);
        Patterns.basic12Patterns.add(p8);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p9 = new Pattern(lefty, righty, "Hybrid Path:Par-Same |X| Prop:Mir-Split");
        Patterns.basicPatterns.add(p9);
        Patterns.basic12Patterns.add(p9);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p10 = new Pattern(lefty, righty, "Hybrid Path:Mir-Split |X| Prop:Par-Same");
        Patterns.basicPatterns.add(p10);
        Patterns.basic12Patterns.add(p10);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p11 = new Pattern(lefty, righty, "Hybrid Path:Mir-Same |X| Prop:Par-Same");
        Patterns.basicPatterns.add(p11);
        Patterns.basic12Patterns.add(p11);

        //





        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p12 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Isolation");
        Patterns.basicPatterns.add(p12);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p13 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Isolation");
        Patterns.basicPatterns.add(p13);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p14 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Anti-Spin");
        Patterns.basicPatterns.add(p14);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p15 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Anti-Spin");
        Patterns.basicPatterns.add(p15);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p16 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Hybrid");
        Patterns.basicPatterns.add(p16);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p17 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Hybrid");
        Patterns.basicPatterns.add(p17);




        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s0 = new Pattern(lefty, righty, "Starting Position - Together - Right");
        Patterns.basicPatterns.add(s0);

        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s01 = new Pattern(lefty, righty, "Starting Position - Together - Left");
        Patterns.basicPatterns.add(s01);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s02 = new Pattern(lefty, righty, "Starting Position - Together - Top");
        Patterns.basicPatterns.add(s02);

        lefty =  "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s03 = new Pattern(lefty, righty, "Starting Position - Together - Bottom");
        Patterns.basicPatterns.add(s03);

        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s1 = new Pattern(lefty, righty, "Starting Position - Split Horizontal");
        Patterns.basicPatterns.add(s1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0,0.0";
        Pattern s2 = new Pattern(lefty, righty, "Starting Position - Split Vertical");
        Patterns.basicPatterns.add(s2);

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q0 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Bottom Right");
        Patterns.basicPatterns.add(q0);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q1 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Bottom Left");
        Patterns.basicPatterns.add(q1);

        lefty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q2 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Top Right");
        Patterns.basicPatterns.add(q2);

        lefty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q3 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Top Left");
        Patterns.basicPatterns.add(q3);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,350.0,0,248.0,0.0,0.0,0.0";
        Pattern q4 = new Pattern(lefty, righty, "Starting Position - Cross - Together");
        Patterns.basicPatterns.add(q4);

        lefty = "0,0.025,4.71238898038469,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        Pattern q5 = new Pattern(lefty, righty, "Starting Position - Cross - Apart");
        Patterns.basicPatterns.add(q5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        Pattern q6 = new Pattern(lefty, righty, "Starting Position - Cross - Quartertime");
        Patterns.basicPatterns.add(q6);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        Pattern q7 = new Pattern(lefty, righty, "Starting Position - Perpendicular - Split-Time");
        Patterns.basicPatterns.add(q7);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,145.0,0.0,0.0,0.0";
        Pattern q8 = new Pattern(lefty, righty, "Starting Position - Perpendicular - Together-Time");
        Patterns.basicPatterns.add(q8);


        //32

        Patterns.startingPositions.add(s0);
        Patterns.startingPositions.add(s01);
        Patterns.startingPositions.add(s02);
        Patterns.startingPositions.add(s03);
        Patterns.startingPositions.add(s1);
        Patterns.startingPositions.add(s2);
        Patterns.startingPositions.add(q0);
        Patterns.startingPositions.add(q1);
        Patterns.startingPositions.add(q2);
        Patterns.startingPositions.add(q3);
        Patterns.startingPositions.add(q4);
        Patterns.startingPositions.add(q5);
        Patterns.startingPositions.add(q6);
        Patterns.startingPositions.add(q7);
        Patterns.startingPositions.add(q8);


        // basic trammel

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t8 = new Pattern(lefty, righty, "Mirror Split-Time Trammel");
        Patterns.basicPatterns.add(t8);
        Patterns.basicTrammelPatterns.add(t8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t9 = new Pattern(lefty, righty, "Mirror Same-Time Trammel");
        Patterns.basicPatterns.add(t9);
        Patterns.basicTrammelPatterns.add(t9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t10 = new Pattern(lefty, righty, "Parallel Same-Time Trammel");
        Patterns.basicPatterns.add(t10);
        Patterns.basicTrammelPatterns.add(t10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t11 = new Pattern(lefty, righty, "Parallel Split-Time Trammel");
        Patterns.basicPatterns.add(t11);
        Patterns.basicTrammelPatterns.add(t11);


        lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t = new Pattern(lefty, righty, "Mirror Quarter-time Trammel");
        Patterns.basicPatterns.add(t);
        //Patterns.basicTrammelPatterns.add(t);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t1 = new Pattern(lefty, righty, "Mirror Quarter-time Perp Trammel");
        Patterns.basicPatterns.add(t1);
        //Patterns.basicTrammelPatterns.add(t1);

        lefty =  "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t2 = new Pattern(lefty, righty, "Parallel Quarter-time 1 Perp Trammel");
        Patterns.basicPatterns.add(t2);
        //Patterns.basicTrammelPatterns.add(t2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t3 = new Pattern(lefty, righty, "Parallel Quarter-time Same Trammel");
        Patterns.basicPatterns.add(t3);
        //Patterns.basicTrammelPatterns.add(t3);



        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t4 = new Pattern(lefty, righty, "Mirror Perp Split-Time Trammel");
        Patterns.basicPatterns.add(t4);
        Patterns.basicTrammelPatterns.add(t4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t5 = new Pattern(lefty, righty, "Mirror Perp Same-Time Trammel");
        Patterns.basicPatterns.add(t5);
        Patterns.basicTrammelPatterns.add(t5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t6 = new Pattern(lefty, righty, "Parallel Perp Split-Time Trammel");
        Patterns.basicPatterns.add(t6);
        Patterns.basicTrammelPatterns.add(t6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t7 = new Pattern(lefty, righty, "Parallel Perp Same-Time Trammel");
        Patterns.basicPatterns.add(t7);
        Patterns.basicTrammelPatterns.add(t7);



        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t20 = new Pattern(lefty, righty, "Piston Trammel");
        Patterns.basicPatterns.add(t20);
        Patterns.hybridPathTrammelPatterns.add(t20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t21 = new Pattern(lefty, righty, "Brush-By Trammel");
        Patterns.basicPatterns.add(t21);
        Patterns.hybridPathTrammelPatterns.add(t21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t22 = new Pattern(lefty, righty, "Turning-T Trammel");
        Patterns.basicPatterns.add(t22);
        Patterns.hybridPathTrammelPatterns.add(t22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t23 = new Pattern(lefty, righty, "Staff-Line Trammel");
        Patterns.basicPatterns.add(t23);
        Patterns.hybridPathTrammelPatterns.add(t23);


        lefty = "0,0.025,7.853981633974483,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t24 = new Pattern(lefty, righty, "Cross Trammel");
        Patterns.basicPatterns.add(t24);
        Patterns.basicTrammelPatterns.add(t24);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t25 = new Pattern(lefty, righty, "Yet Another Hybrid-Path Parallel-Same Trammel");
        Patterns.basicPatterns.add(t25);
        //Patterns.hybridPathTrammelPatterns.add(t25);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t26 = new Pattern(lefty, righty, "Mirror 1 Perp Split-Time Trammel");
        Patterns.basicPatterns.add(t26);
        Patterns.basicTrammelPatterns.add(t26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t27 = new Pattern(lefty, righty, "Mirror 1 Perp Same-Time Trammel");
        Patterns.basicPatterns.add(t27);
        Patterns.basicTrammelPatterns.add(t27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t28 = new Pattern(lefty, righty, "Parallel 1 Perp Split-Time Trammel");
        Patterns.basicPatterns.add(t28);
        Patterns.basicTrammelPatterns.add(t28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t29 = new Pattern(lefty, righty, "Parallel 1 Perp Same-Time Trammel");
        Patterns.basicPatterns.add(t29);
        Patterns.basicTrammelPatterns.add(t29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t30 = new Pattern(lefty, righty, "Fly-By Trammel");
        Patterns.basicPatterns.add(t30);
        Patterns.hybridPathTrammelPatterns.add(t30);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t31 = new Pattern(lefty, righty, "Linkage Trammel");
        Patterns.basicPatterns.add(t31);
        Patterns.hybridPathTrammelPatterns.add(t31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t32 = new Pattern(lefty, righty, "Low Turning-T Trammel");
        Patterns.basicPatterns.add(t32);
        Patterns.hybridPathTrammelPatterns.add(t32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t33 = new Pattern(lefty, righty, "Staff-Line Alt Trammel");
        Patterns.basicPatterns.add(t33);
        Patterns.hybridPathTrammelPatterns.add(t33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t34 = new Pattern(lefty, righty, "Folding Piston Trammel");
        Patterns.basicPatterns.add(t34);
        Patterns.hybridPathTrammelPatterns.add(t34);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t35 = new Pattern(lefty, righty, "Folding Linkage Trammel");
        Patterns.basicPatterns.add(t35);
        Patterns.hybridPathTrammelPatterns.add(t35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t36 = new Pattern(lefty, righty, "Big-Staff Trammel");
        Patterns.basicPatterns.add(t36);
        Patterns.hybridPathTrammelPatterns.add(t36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t37 = new Pattern(lefty, righty, "Pass-Through Trammel");
        Patterns.basicPatterns.add(t37);
        Patterns.hybridPathTrammelPatterns.add(t37);

        // trammel quartertime / staggered  st

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st8 = new Pattern(lefty, righty, "Staggered Mirror Trammel");
        Patterns.basicPatterns.add(st8);
        Patterns.basicTrammelPatterns.add(st8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st9 = new Pattern(lefty, righty, "Staggered Mirror Same-Time Trammel");
        Patterns.basicPatterns.add(st9);
        //Patterns.basicTrammelPatterns.add(st9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st10 = new Pattern(lefty, righty, "Staggered Parallel Trammel");
        Patterns.basicPatterns.add(st10);
        Patterns.basicTrammelPatterns.add(st10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st11 = new Pattern(lefty, righty, "Staggered Parallel Split-Time Trammel");
        Patterns.basicPatterns.add(st11);
        //Patterns.basicTrammelPatterns.add(st11);



        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st4 = new Pattern(lefty, righty, "Staggered Mirror Perp Trammel");
        Patterns.basicPatterns.add(st4);
        Patterns.basicTrammelPatterns.add(st4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st5 = new Pattern(lefty, righty, "Staggered Mirror Perp Same-Time Trammel");
        Patterns.basicPatterns.add(st5);
        //Patterns.basicTrammelPatterns.add(st5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st6 = new Pattern(lefty, righty, "Staggered Parallel Perp Trammel");
        Patterns.basicPatterns.add(st6);
        Patterns.basicTrammelPatterns.add(st6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st7 = new Pattern(lefty, righty, "Staggered Parallel Perp Same-Time Trammel");
        Patterns.basicPatterns.add(st7);
        //Patterns.basicTrammelPatterns.add(st7);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st20 = new Pattern(lefty, righty, "Mirror Hybrid-Path Split-Time Trammel");
        Patterns.basicPatterns.add(st20);
        Patterns.hybridPathTrammelPatterns.add(st20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st21 = new Pattern(lefty, righty, "Mirror Hybrid-Path Same-Time Trammel");
        Patterns.basicPatterns.add(st21);
        Patterns.hybridPathTrammelPatterns.add(st21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st22 = new Pattern(lefty, righty, "Parallel Hybrid-Path Split-Time Trammel");
        Patterns.basicPatterns.add(st22);
        Patterns.hybridPathTrammelPatterns.add(st22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st23 = new Pattern(lefty, righty, "Parallel Hybrid-Path Same-Time Trammel");
        Patterns.basicPatterns.add(st23);
        Patterns.hybridPathTrammelPatterns.add(st23);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st26 = new Pattern(lefty, righty, "Staggered Mirror 1-Perp Trammel");
        Patterns.basicPatterns.add(st26);
        Patterns.basicTrammelPatterns.add(st26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st27 = new Pattern(lefty, righty, "Staggered Mirror 1-Perp Same-Time Trammel");
        Patterns.basicPatterns.add(st27);
        //Patterns.basicTrammelPatterns.add(st27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st28 = new Pattern(lefty, righty, "Staggered Parallel 1-Perp Trammel");
        Patterns.basicPatterns.add(st28);
        Patterns.basicTrammelPatterns.add(st28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st29 = new Pattern(lefty, righty, "Staggered Parallel 1-Perp Same-Time Trammel");
        Patterns.basicPatterns.add(st29);
        //Patterns.basicTrammelPatterns.add(st29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st30 = new Pattern(lefty, righty, "Mirror Hybrid-Path Perp Split-Time Trammel");
        Patterns.basicPatterns.add(st30);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st31 = new Pattern(lefty, righty, "Mirror Hybrid-Path Perp Same-Time Trammel");
        Patterns.basicPatterns.add(st31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st32 = new Pattern(lefty, righty, "Parallel Hybrid-Path Perp Split-Time Trammel");
        Patterns.basicPatterns.add(st32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st33 = new Pattern(lefty, righty, "Parallel Hybrid-Path Perp Same-Time Trammel");
        Patterns.basicPatterns.add(st33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st34 = new Pattern(lefty, righty, "Mirror Hybrid-Path 1 Perp Split-Time Trammel");
        Patterns.basicPatterns.add(st34);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st35 = new Pattern(lefty, righty, "Mirror Hybrid-Path 1 Perp Same-Time Trammel");
        Patterns.basicPatterns.add(st35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st36 = new Pattern(lefty, righty, "Parallel Hybrid-Path 1 Perp Split-Time Trammel");
        Patterns.basicPatterns.add(st36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st37 = new Pattern(lefty, righty, "Parallel Hybrid-Path 1 Perp Same-Time Trammel");
        Patterns.basicPatterns.add(st37);

        // perpendicular /////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp8 = new Pattern(lefty, righty, "Mirror 1:1 In-Spin Same-Time");
        Patterns.perpendicularPatterns.add(pp8);

        lefty = "0,0.025,3.141592653589793,0,0.025,4.7123889803846896,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp9 = new Pattern(lefty, righty, "Mirror 1:1 In-Spin Split-Time");
        Patterns.perpendicularPatterns.add(pp9);

        lefty =  "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp10 = new Pattern(lefty, righty, "Parallel 1:1 In-Spin Same-Time");
        Patterns.perpendicularPatterns.add(pp10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,4.7123889803846896,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp11 = new Pattern(lefty, righty, "Parallel 1:1 In-Spin Split-Time");
        Patterns.perpendicularPatterns.add(pp11);

        //

        lefty = "0,0.025,4.7123889803846896,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp = new Pattern(lefty, righty, "Mirror 1:1 Anti-Spin Split-Time");
        Patterns.perpendicularPatterns.add(pp);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp1 = new Pattern(lefty, righty, "Mirror 1:1 Anti-Spin Same-Time");
        Patterns.perpendicularPatterns.add(pp1);

        lefty =  "0,0.025,4.7123889803846896,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp2 = new Pattern(lefty, righty, "Parallel 1:1 Anti-Spin Split-Time");
        Patterns.perpendicularPatterns.add(pp2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp3 = new Pattern(lefty, righty, "Parallel 1:1 Anti-Spin Same-Time");
        Patterns.perpendicularPatterns.add(pp3);

        //

        lefty = "0,0.025,0.0,0,0.025,4.7123889803846896,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp4 = new Pattern(lefty, righty, "Parallel 1:1 Hybrid Split-Time");
        Patterns.perpendicularPatterns.add(pp4);

        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp5 = new Pattern(lefty, righty, "Parallel 1:1 Hybrid Same-Time");
        Patterns.perpendicularPatterns.add(pp5);

        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp6 = new Pattern(lefty, righty, "Mirror 1:1 Hybrid Same-Time");
        Patterns.perpendicularPatterns.add(pp6);

        lefty = "0,0.025,0.0,0,0.025,4.7123889803846896,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp7 = new Pattern(lefty, righty, "Mirror 1:1 Hybrid Split-Time");
        Patterns.perpendicularPatterns.add(pp7);

        /////

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p8 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Iso/In-Spin Split-Time");
        Patterns.perpendicularPatterns.add(p1p8);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p9 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Iso/In-Spin Same-Time");
        Patterns.perpendicularPatterns.add(p1p9);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p10 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Iso/In-Spin Same-Time");
        Patterns.perpendicularPatterns.add(p1p10);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p11 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Iso/In-Spin Split-Time");
        Patterns.perpendicularPatterns.add(p1p11);

        //

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p = new Pattern(lefty, righty, "Mirror 1 Perpendicular Anti-Spin Split-Time");
        Patterns.perpendicularPatterns.add(p1p);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p1 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Anti-Spin Same-Time");
        Patterns.perpendicularPatterns.add(p1p1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p2 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Anti-Spin Split-Time");
        Patterns.perpendicularPatterns.add(p1p2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p3 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Anti-Spin Same-Time");
        Patterns.perpendicularPatterns.add(p1p3);

        //

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p4 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Hybrid Split-Time");
        Patterns.perpendicularPatterns.add(p1p4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p5 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Hybrid Same-Time");
        Patterns.perpendicularPatterns.add(p1p5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p6 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Hybrid Split-Time");
        Patterns.perpendicularPatterns.add(p1p6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p7 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Hybrid Same-Time");
        Patterns.perpendicularPatterns.add(p1p7);


        // extra beats    ////////////////////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep8 = new Pattern(lefty, righty, "2bt 1:2 - Mirror In-Spin Split-Time");
        Patterns.extraBeatPatterns.add(ep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep9 = new Pattern(lefty, righty, "2bt 1:2 - Mirror In-Spin Same-Time");
        Patterns.extraBeatPatterns.add(ep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep10 = new Pattern(lefty, righty, "2bt 1:2 - Parallel In-Spin Same-Time");
        Patterns.extraBeatPatterns.add(ep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep11 = new Pattern(lefty, righty, "2bt 1:2 - Parallel In-Spin Split-Time");
        Patterns.extraBeatPatterns.add(ep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep = new Pattern(lefty, righty, "2bt 1:2 - Mirror Anti-Spin Split-Time");
        Patterns.extraBeatPatterns.add(ep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep1 = new Pattern(lefty, righty, "2bt 1:2 - Mirror Anti-Spin Same-Time");
        Patterns.extraBeatPatterns.add(ep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep2 = new Pattern(lefty, righty, "2bt 1:2 - Parallel Anti-Spin Split-Time");
        Patterns.extraBeatPatterns.add(ep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep3 = new Pattern(lefty, righty, "2bt 1:2 - Parallel Anti-Spin Same-Time");
        Patterns.extraBeatPatterns.add(ep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep4 = new Pattern(lefty, righty, "2bt 1:2 - Mirror Hybrid Split-Time");
        Patterns.extraBeatPatterns.add(ep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep5 = new Pattern(lefty, righty, "2bt 1:2 - Mirror Hybrid Same-Time");
        Patterns.extraBeatPatterns.add(ep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep6 = new Pattern(lefty, righty, "2bt 1:2 - Parallel Hybrid Split-Time");
        Patterns.extraBeatPatterns.add(ep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep7 = new Pattern(lefty, righty, "2bt 1:2 - Parallel Hybrid Same-Time");
        Patterns.extraBeatPatterns.add(ep7);

        //

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep8 = new Pattern(lefty, righty, "3bt 1:3 - Mirror In-Spin Split-Time");
        Patterns.extraBeat2Patterns.add(eep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep9 = new Pattern(lefty, righty, "3bt 1:3 - Mirror In-Spin Same-Time");
        Patterns.extraBeat2Patterns.add(eep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep10 = new Pattern(lefty, righty, "3bt 1:3 - Parallel In-Spin Same-Time");
        Patterns.extraBeat2Patterns.add(eep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep11 = new Pattern(lefty, righty, "3bt 1:3 - Parallel In-Spin Split-Time");
        Patterns.extraBeat2Patterns.add(eep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep = new Pattern(lefty, righty, "3bt 1:3 - Mirror Anti-Spin Split-Time");
        Patterns.extraBeat2Patterns.add(eep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep1 = new Pattern(lefty, righty, "3bt 1:3 - Mirror Anti-Spin Same-Time");
        Patterns.extraBeat2Patterns.add(eep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep2 = new Pattern(lefty, righty, "3bt 1:3 - Parallel Anti-Spin Split-Time");
        Patterns.extraBeat2Patterns.add(eep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep3 = new Pattern(lefty, righty, "3bt 1:3 - Parallel Anti-Spin Same-Time");
        Patterns.extraBeat2Patterns.add(eep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep4 = new Pattern(lefty, righty, "3bt 1:3 - Mirror Hybrid Split-Time");
        Patterns.extraBeat2Patterns.add(eep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep5 = new Pattern(lefty, righty, "3bt 1:3 - Mirror Hybrid Same-Time");
        Patterns.extraBeat2Patterns.add(eep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep6 = new Pattern(lefty, righty, "3bt 1:3 - Parallel Hybrid Split-Time");
        Patterns.extraBeat2Patterns.add(eep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep7 = new Pattern(lefty, righty, "3bt 1:3 - Parallel Hybrid Same-Time");
        Patterns.extraBeat2Patterns.add(eep7);

//

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep8 = new Pattern(lefty, righty, "4bt 1:4 - Mirror In-Spin Split-Time");
        Patterns.extraBeat3Patterns.add(eeep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep9 = new Pattern(lefty, righty, "4bt 1:4 - Mirror In-Spin Same-Time");
        Patterns.extraBeat3Patterns.add(eeep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep10 = new Pattern(lefty, righty, "4bt 1:4 - Parallel In-Spin Same-Time");
        Patterns.extraBeat3Patterns.add(eeep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep11 = new Pattern(lefty, righty, "4bt 1:4 - Parallel In-Spin Split-Time");
        Patterns.extraBeat3Patterns.add(eeep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep = new Pattern(lefty, righty, "4bt 1:4 - Mirror Anti-Spin Split-Time");
        Patterns.extraBeat3Patterns.add(eeep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep1 = new Pattern(lefty, righty, "4bt 1:4 - Mirror Anti-Spin Same-Time");
        Patterns.extraBeat3Patterns.add(eeep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep2 = new Pattern(lefty, righty, "4bt 1:4 - Parallel Anti-Spin Split-Time");
        Patterns.extraBeat3Patterns.add(eeep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep3 = new Pattern(lefty, righty, "4bt 1:4 - Parallel Anti-Spin Same-Time");
        Patterns.extraBeat3Patterns.add(eeep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep4 = new Pattern(lefty, righty, "4bt 1:4 - Mirror Hybrid Split-Time");
        Patterns.extraBeat3Patterns.add(eeep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep5 = new Pattern(lefty, righty, "4bt 1:4 - Mirror Hybrid Same-Time");
        Patterns.extraBeat3Patterns.add(eeep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep6 = new Pattern(lefty, righty, "4bt 1:4 - Parallel Hybrid Split-Time");
        Patterns.extraBeat3Patterns.add(eeep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep7 = new Pattern(lefty, righty, "4bt 1:4 - Parallel Hybrid Same-Time");
        Patterns.extraBeat3Patterns.add(eeep7);

        //

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep8 = new Pattern(lefty, righty, "5bt 1:5 - Mirror In-Spin Split-Time");
        Patterns.extraBeat4Patterns.add(eeeep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep9 = new Pattern(lefty, righty, "5bt 1:5 - Mirror In-Spin Same-Time");
        Patterns.extraBeat4Patterns.add(eeeep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep10 = new Pattern(lefty, righty, "5bt 1:5 - Parallel In-Spin Same-Time");
        Patterns.extraBeat4Patterns.add(eeeep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep11 = new Pattern(lefty, righty, "5bt 1:5 - Parallel In-Spin Split-Time");
        Patterns.extraBeat4Patterns.add(eeeep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep = new Pattern(lefty, righty, "5bt 1:5 - Mirror Anti-Spin Split-Time");
        Patterns.extraBeat4Patterns.add(eeeep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep1 = new Pattern(lefty, righty, "5bt 1:5 - Mirror Anti-Spin Same-Time");
        Patterns.extraBeat4Patterns.add(eeeep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep2 = new Pattern(lefty, righty, "5bt 1:5 - Parallel Anti-Spin Split-Time");
        Patterns.extraBeat4Patterns.add(eeeep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep3 = new Pattern(lefty, righty, "5bt 1:5 - Parallel Anti-Spin Same-Time");
        Patterns.extraBeat4Patterns.add(eeeep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep4 = new Pattern(lefty, righty, "5bt 1:5 - Mirror Hybrid Split-Time");
        Patterns.extraBeat4Patterns.add(eeeep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep5 = new Pattern(lefty, righty, "5bt 1:5 - Mirror Hybrid Same-Time");
        Patterns.extraBeat4Patterns.add(eeeep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep6 = new Pattern(lefty, righty, "5bt 1:5 - Parallel Hybrid Split-Time");
        Patterns.extraBeat4Patterns.add(eeeep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep7 = new Pattern(lefty, righty, "5bt 1:5 - Parallel Hybrid Same-Time");
        Patterns.extraBeat4Patterns.add(eeeep7);


        // point hybrids

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph8 = new Pattern(lefty, righty, "Mirror Point-Hybrid Isolation Split");
        Patterns.pointHybridPatterns.add(ph8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph9 = new Pattern(lefty, righty, "Mirror Point-Hybrid Isolation Same");
        Patterns.pointHybridPatterns.add(ph9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph10 = new Pattern(lefty, righty, "Parallel Point-Hybrid Isolation Same");
        Patterns.pointHybridPatterns.add(ph10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph11 = new Pattern(lefty, righty, "Parallel Point-Hybrid Isolation Split");
        Patterns.pointHybridPatterns.add(ph11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph = new Pattern(lefty, righty, "Mirror Point-Hybrid Anti-Spin Split *");
        Patterns.pointHybridPatterns.add(ph);

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph1 = new Pattern(lefty, righty, "Mirror Point-Hybrid Anti-Spin Same *");
        Patterns.pointHybridPatterns.add(ph1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph2 = new Pattern(lefty, righty, "Parallel Point-Hybrid Anti-Spin Split");
        Patterns.pointHybridPatterns.add(ph2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph3 = new Pattern(lefty, righty, "Parallel Point-Hybrid Anti-Spin Same");
        Patterns.pointHybridPatterns.add(ph3);

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
        Patterns.squarePatterns.add(ps);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps1 = new Pattern(lefty, righty, "Square Mirror Isolation Same-Time");
        Patterns.squarePatterns.add(ps1);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps2 = new Pattern(lefty, righty, "Square Parallel Isolation Split-Time");
        Patterns.squarePatterns.add(ps2);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps3 = new Pattern(lefty, righty, "Square Parallel Isolation Same-Time");
        Patterns.squarePatterns.add(ps3);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps4 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Split-Time");
        Patterns.squarePatterns.add(ps4);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps5 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Same-Time");
        Patterns.squarePatterns.add(ps5);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps6 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Split-Time");
        Patterns.squarePatterns.add(ps6);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps7 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Same-Time");
        Patterns.squarePatterns.add(ps7);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps8 = new Pattern(lefty, righty, "Square Mirror Hybrid Split-Time");
        Patterns.squarePatterns.add(ps8);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps9 = new Pattern(lefty, righty, "Square Mirror Hybrid Same-Time");
        Patterns.squarePatterns.add(ps9);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps10 = new Pattern(lefty, righty, "Square Parallel Hybrid Split-Time");
        Patterns.squarePatterns.add(ps10);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps11 = new Pattern(lefty, righty, "Square Parallel Hybrid Same-Time");
        Patterns.squarePatterns.add(ps11);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern psp = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Split-Time");
        Patterns.squarePatterns.add(psp);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps1p = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Same-Time");
        Patterns.squarePatterns.add(ps1p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps2p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Split-Time");
        Patterns.squarePatterns.add(ps2p);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps3p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Same-Time");
        Patterns.squarePatterns.add(ps3p);

        //

        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps4p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Split-Time");
        Patterns.squarePatterns.add(ps4p);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps5p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Same-Time");
        Patterns.squarePatterns.add(ps5p);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps6p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Split-Time");
        Patterns.squarePatterns.add(ps6p);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps7p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Same-Time");
        Patterns.squarePatterns.add(ps7p);

//

        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps8p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Split-Time");
        Patterns.squarePatterns.add(ps8p);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps9p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Same-Time");
        Patterns.squarePatterns.add(ps9p);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps10p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Split-Time *");
        Patterns.squarePatterns.add(ps10p);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps11p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Same-Time");
        Patterns.squarePatterns.add(ps11p);


        //// extra beat trammel


        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et8 = new Pattern(lefty, righty, "Mirror 1:2 Split-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et9 = new Pattern(lefty, righty, "Mirror 1:2 Same-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et10 = new Pattern(lefty, righty, "Parallel 1:2 Same-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et11 = new Pattern(lefty, righty, "Parallel 1:2 Split-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et11);



        /*
        lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et = new Pattern(lefty, righty, "Mirror 1:2 Quarter-time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et1 = new Pattern(lefty, righty, "Mirror 1:2 Quarter-time Perpendicular Trammel");
        Patterns.extraBeatTrammelPatterns.add(et1);

        lefty =  "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et2 = new Pattern(lefty, righty, "Parallel 1:2 Quarter-time 1 Perpendicular Trammel");
        Patterns.extraBeatTrammelPatterns.add(et2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty =  "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et3 = new Pattern(lefty, righty, "Parallel 1:2 Quarter-time Same Trammel");
        Patterns.extraBeatTrammelPatterns.add(et3);
        /**/


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et4 = new Pattern(lefty, righty, "Mirror 1:2 Perp Split-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et5 = new Pattern(lefty, righty, "Mirror 1:2 Perp Same-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et6 = new Pattern(lefty, righty, "Parallel 1:2 Perp Split-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et7 = new Pattern(lefty, righty, "Parallel 1:2 Perp Same-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et7);



        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et20 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid Split-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et21 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid Same-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et22 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid Split-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et23 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid Same-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et23);

        ///


        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et26 = new Pattern(lefty, righty, "Mirror 1:2 1 Perp Split-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et27 = new Pattern(lefty, righty, "Mirror 1:2 1 Perp Same-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et28 = new Pattern(lefty, righty, "Parallel 1:2 1 Perp Split-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et29 = new Pattern(lefty, righty, "Parallel 1:2 1 Perp Same-Time Trammel");
        Patterns.extraBeatTrammelPatterns.add(et29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et30 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid-Path Perp Staggered Trammel");
        Patterns.extraBeatTrammelPatterns.add(et30);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et31 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid-Path Perp Staggered Trammel");
        Patterns.extraBeatTrammelPatterns.add(et31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et32 = new Pattern(lefty, righty, "Stroking Trammel");
        Patterns.extraBeatTrammelPatterns.add(et32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et33 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid-Path Perp Staggered Trammel");
        Patterns.extraBeatTrammelPatterns.add(et33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et34 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid-Path 1 Perp Staggered Trammel");
        Patterns.extraBeatTrammelPatterns.add(et34);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et35 = new Pattern(lefty, righty, "Mirror 1:2 Hybrid-Path 1 Perp Staggered Trammel");
        Patterns.extraBeatTrammelPatterns.add(et35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et36 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid-Path 1 Perp Staggered Trammel");
        Patterns.extraBeatTrammelPatterns.add(et36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et37 = new Pattern(lefty, righty, "Parallel 1:2 Hybrid-Path 1 Perp Staggered Trammel");
        Patterns.extraBeatTrammelPatterns.add(et37);

        ///// quarter square

//

        lefty = "0,0.025,8.6393797973719311,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps = new Pattern(lefty, righty, "Square Mirror Isolation Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps2 = new Pattern(lefty, righty, "Square Parallel Isolation Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps2);

        ////

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps4 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps4);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps6 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps6);

        // //

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps8 = new Pattern(lefty, righty, "Square Mirror Hybrid Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps8);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps10 = new Pattern(lefty, righty, "Square Parallel Hybrid Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps10);

        ////

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qpsp = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Quarter-Time");
        Patterns.quarterSquarePatterns.add(qpsp);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps2p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps2p);

        ////

        lefty = "0,0.025,8.6393797973719311,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps4p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps4p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps6p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps6p);

//              //

        lefty = "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps8p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Quarter-Time");
        Patterns.quarterSquarePatterns.add(qps8p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps10p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Quarter-Time *");
        Patterns.quarterSquarePatterns.add(qps10p);


        ////////////////////////////////////////////////////////////////////////////////////////////
        // CAPS
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap = new Pattern(lefty, righty, "CAP Path:Mir-Same |X| Prop:Mir-Same");
        Patterns.CAPSPatterns.add(cap);

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap4 = new Pattern(lefty, righty, "CAP Path:Mir-Same |X| Prop:Mir-Same Alt");
        Patterns.CAPSPatterns.add(cap4);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap2 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Par-Split");
        Patterns.CAPSPatterns.add(cap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap6 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Par-Split Alt");
        Patterns.CAPSPatterns.add(cap6);



        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap1 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Mir-Split Hybrid");
        Patterns.CAPSPatterns.add(cap1);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap8 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Mir-Split Hybrid Alt");
        Patterns.CAPSPatterns.add(cap8);


        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap3 = new Pattern(lefty, righty, "CAP Path:Mir-Same |X| Prop:Par-Same Hybrid");
        Patterns.CAPSPatterns.add(cap3);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap7 = new Pattern(lefty, righty, "CAP Path:Mir-Same |X| Prop:Par-Same Hybrid Alt");
        Patterns.CAPSPatterns.add(cap7);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // buzzsaw caps
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap = new Pattern(lefty, righty, "Buzzsaw CAP Path:Same |X| Prop:Mir-Same");
        Patterns.buzzsawCAPSPatterns.add(bcap);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap1 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Split |X| Prop:Mir-Split");
        Patterns.buzzsawCAPSPatterns.add(bcap1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap2 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Same |X| Prop:Par-Same");
        Patterns.buzzsawCAPSPatterns.add(bcap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap3 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Split |X| Prop:Par-Split");
        Patterns.buzzsawCAPSPatterns.add(bcap3);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // Vertical CAPS
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap = new Pattern(lefty, righty, "CAP Path:Mir-Split |X| Prop:Mir-Split High/Low");
        Patterns.verticalCAPSPatterns.add(vcap);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap4 = new Pattern(lefty, righty, "CAP Path:Mir-Split |X| Prop:Mir-Split Alt High/Low");
        Patterns.verticalCAPSPatterns.add(vcap4);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap2 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Par-Split High/Low");
        Patterns.verticalCAPSPatterns.add(vcap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap6 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Par-Split Alt High/Low");
        Patterns.verticalCAPSPatterns.add(vcap6);



        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap1 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Mir-Same Hybrid High/Low");
        Patterns.verticalCAPSPatterns.add(vcap1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap8 = new Pattern(lefty, righty, "CAP Path:Par-Split |X| Prop:Mir-Same Hybrid Alt High/Low");
        Patterns.verticalCAPSPatterns.add(vcap8);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap3 = new Pattern(lefty, righty, "CAP Path:Mir-Split |X| Prop:Par-Same Hybrid High/Low");
        Patterns.verticalCAPSPatterns.add(vcap3);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap7 = new Pattern(lefty, righty, "CAP Path:Mir-Split |X| Prop:Par-Same Hybrid Alt High/Low");
        Patterns.verticalCAPSPatterns.add(vcap7);


        ////////////////////////////////////////////////////////////////////////////////////////////
        // Sluice Gates
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," + ((Math.PI) * -1);
        Pattern ssp12 = new Pattern(lefty, righty, "Sluice Gate - Crossing (Mirror) Isolation");
        Patterns.sluiceGatePatterns.add(ssp12);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," +  (Math.PI + (Math.PI/2) * -1);
        Pattern ssp13 = new Pattern(lefty, righty, "Sluice Gate - Follow (Parallel) Isolation");
        Patterns.sluiceGatePatterns.add(ssp13);


        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," + ((Math.PI/2) * -1);
        Pattern ssp12a = new Pattern(lefty, righty, "Sluice Gate - Crossing Mirror-Split Isolation");
        Patterns.sluiceGatePatterns.add(ssp12a);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + (Math.PI + Math.PI/2) + ",QuarterHalfCC," +  ((Math.PI + (Math.PI/2)) * -1);
        Pattern ssp13a = new Pattern(lefty, righty, "Sluice Gate - Follow Parallel-Split Isolation");
        Patterns.sluiceGatePatterns.add(ssp13a);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," + (Math.PI * -1);
        Pattern ssp14 = new Pattern(lefty, righty, "Sluice Gate - Crossing (Mirror) Anti-Spin");
        Patterns.sluiceGatePatterns.add(ssp14);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," + (Math.PI  * -1);
        Pattern ssp15 = new Pattern(lefty, righty, "Sluice Gate - Follow (Parallel) Anti-Spin");
        Patterns.sluiceGatePatterns.add(ssp15);


        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," + ((Math.PI/2) * -1);
        Pattern ssp12fa = new Pattern(lefty, righty, "Sluice Gate - Crossing Mirror-Split Anti-Spin");
        Patterns.sluiceGatePatterns.add(ssp12fa);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + (Math.PI + Math.PI/2) + ",QuarterHalfCC," +  ((Math.PI + (Math.PI/2)) * -1);
        Pattern ssp13fa = new Pattern(lefty, righty, "Sluice Gate - Follow Parallel-Split Anti-Spin");
        Patterns.sluiceGatePatterns.add(ssp13fa);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," + (Math.PI * -1);
        Pattern ssp16 = new Pattern(lefty, righty, "Sluice Gate - Crossing (Mirror) Hybrid");
        Patterns.sluiceGatePatterns.add(ssp16);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," + (Math.PI  * -1);
        Pattern ssp17 = new Pattern(lefty, righty, "Sluice Gate - Follow (Parallel) Hybrid");
        Patterns.sluiceGatePatterns.add(ssp17);


        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,-1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + Math.PI/2 + ",QuarterHalfCC," + ((Math.PI/2) * -1);
        Pattern ssp12fha = new Pattern(lefty, righty, "Sluice Gate - Crossing Mirror-Split Hybrid");
        Patterns.sluiceGatePatterns.add(ssp12fha);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,TranslatedQuarterComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + Math.PI + ",QuarterHalfCC," + (Math.PI) * -1; // pushes shape
        lefty = lefty + ",0," + (Math.PI + Math.PI/2) + ",QuarterHalfCC," +  ((Math.PI + (Math.PI/2)) * -1);
        Pattern ssp13fha = new Pattern(lefty, righty, "Sluice Gate - Follow Parallel-Split Hybrid");
        Patterns.sluiceGatePatterns.add(ssp13fha);


        ////////////////////////////////////////////////////////////////////////////////////////////
        // Ping Pongs
        ////////////////////////////////////////////////////////////////////////////////////////////


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp = new Pattern(lefty, righty, "PingPong - Mirror Isolation Same-Time");
        Patterns.pingpongPatterns.add(pongp);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp1 = new Pattern(lefty, righty, "PingPong - Mirror Isolation Split-Time");
        Patterns.pingpongPatterns.add(pongp1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp2 = new Pattern(lefty, righty, "PingPong - Parallel Isolation Same-Time");
        Patterns.pingpongPatterns.add(pongp2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (0) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp3 = new Pattern(lefty, righty, "PingPong - Parallel Isolation Split-Time");
        Patterns.pingpongPatterns.add(pongp3);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp4 = new Pattern(lefty, righty, "PingPong - Mirror Anti-Spin Same-Time");
        Patterns.pingpongPatterns.add(pongp4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp5 = new Pattern(lefty, righty, "PingPong - Mirror Anti-Spin Split-Time");
        Patterns.pingpongPatterns.add(pongp5);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp6 = new Pattern(lefty, righty, "PingPong - Parallel Anti-Spin Split-Time");
        Patterns.pingpongPatterns.add(pongp6);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp7 = new Pattern(lefty, righty, "PingPong - Parallel Anti-Spin Same-Time");
        Patterns.pingpongPatterns.add(pongp7);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + (Math.PI + Math.PI/2) + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp8 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Par-Split |X| Prop:Mir-Split");
        Patterns.pingpongPatterns.add(pongp8);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp9 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Par-Same |X| Prop:Mir-Split");
        Patterns.pingpongPatterns.add(pongp9);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp10 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Mir-Split |X| Prop:Par-Same");
        Patterns.pingpongPatterns.add(pongp10);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (0) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp11 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Mir-Same |X| Prop:Par-Same");
        Patterns.pingpongPatterns.add(pongp11);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // Chuu chuus
        ////////////////////////////////////////////////////////////////////////////////////////////

        /*
        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern chuup = new Pattern(lefty, righty, "ChuuChuu - Mirror Isolation Split-Time");
        Patterns.basicChuuChuuPatterns.add(chuup);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern chuup1 = new Pattern(lefty, righty, "ChuuChuu - Mirror Isolation Same-Time");
        Patterns.basicChuuChuuPatterns.add(chuup1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern chuup2 = new Pattern(lefty, righty, "ChuuChuu - Parallel Isolation Same-Time");
        Patterns.basicChuuChuuPatterns.add(chuup2);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern chuup3 = new Pattern(lefty, righty, "ChuuChuu - Parallel Isolation Split-Time");
        Patterns.basicChuuChuuPatterns.add(chuup3);
        /**/

        lefty = "0,0.025,4.71238898038469,0,0.025,-3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + Math.PI ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + Math.PI + ",FullReverse," + Math.PI;
        Pattern chuup1s = new Pattern(lefty, righty, "The Chuu Chuu Snake");
        Patterns.snakeChuuChuuPatterns.add(chuup1s);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + 0 ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + 0 + ",FullReverse," + Math.PI;
        Pattern chuups = new Pattern(lefty, righty, "Chuu Chhu Snake - Ur Doing it Wrong");
        Patterns.snakeChuuChuuPatterns.add(chuups);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + Math.PI ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + 0 + ",FullReverse," + Math.PI;
        Pattern chuup2s = new Pattern(lefty, righty, "Half a Chuu Chuu Snake");
        Patterns.snakeChuuChuuPatterns.add(chuup2s);

        lefty =  "0,0.025,4.71238898038469,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + 0 ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + Math.PI + ",FullReverse," + 0;
        Pattern chuup3s = new Pattern(lefty, righty, "One Sided Chuu Chuu Snake");
        Patterns.snakeChuuChuuPatterns.add(chuup3s);


    }
    
}
