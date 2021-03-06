package net.firestaff.mcp.baselab.patterns;

class HoopPatternHelperVTG {

    static {

        // Thread the needle
        String lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,0.2,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        String righty = "0,0.025,0.0,0,0.025,1.5707963267948966,0.2,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ptt = new Pattern(lefty, righty, "Thread the Needle");
        HoopPatternsVTG.basicTutorialPatterns.add(ptt);
        // 3Bt Weave
        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,145.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,145.0,0,345.0";
        Pattern ptt3 = new Pattern(lefty, righty, "3Bt Weave");
        HoopPatternsVTG.basicTutorialPatterns.add(ptt3);
        // The Fountain
        lefty =  "0,0.025,0.0,0,0.025,0.0,1.5,1.0,1.0,1.0,9.0,205.0,Circle,6.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.5,1.0,1.0,1.0,9.0,205.0,Circle,6.0,0,250.0,0,345.0";
        Pattern ptt2 = new Pattern(lefty, righty, "The Fountain");
        HoopPatternsVTG.basicTutorialPatterns.add(ptt2);
        // Windmill
        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,245.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,245.0";
        Pattern pttt3 = new Pattern(lefty, righty, "Windmill");
        HoopPatternsVTG.basicTutorialPatterns.add(pttt3);
        // CAP
        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,3.0,0,250.0,0,345.0";
        Pattern ptt5 = new Pattern(lefty, righty, "CAP");
        HoopPatternsVTG.basicTutorialPatterns.add(ptt5);
        // 4 Petal Anti-Spin Flower
        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern pttt7 = new Pattern(lefty, righty, "4 Petal Anti-Spin Flower");
        HoopPatternsVTG.basicTutorialPatterns.add(pttt7);
        // 4 Petal Inspin Flower
        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern pttt71 = new Pattern(lefty, righty, "4 Petal In-Spin Flower");
        HoopPatternsVTG.basicTutorialPatterns.add(pttt71);
        // Hoop Isolations
        lefty =  "0,0.025,0.0,0,0.025,0.0,0.5,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,345.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.5,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,145.0,0,345.0";
        Pattern ptt10 = new Pattern(lefty, righty, "Hoop Isolations");
        HoopPatternsVTG.basicTutorialPatterns.add(ptt10);


        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p = new Pattern(lefty, righty, "Split-Opp Isolation");
        HoopPatternsVTG.basicPatterns.add(p);
        HoopPatternsVTG.basic12Patterns.add(p);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1 = new Pattern(lefty, righty, "Tog-Opp Isolation");
        HoopPatternsVTG.basicPatterns.add(p1);
        HoopPatternsVTG.basic12Patterns.add(p1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p2 = new Pattern(lefty, righty, "Tog-Same Isolation");
        HoopPatternsVTG.basicPatterns.add(p2);
        HoopPatternsVTG.basic12Patterns.add(p2);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p3 = new Pattern(lefty, righty, "Split-Same Isolation");
        HoopPatternsVTG.basicPatterns.add(p3);
        HoopPatternsVTG.basic12Patterns.add(p3);


        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p4 = new Pattern(lefty, righty, "Split-Opp Anti-Spin");
        HoopPatternsVTG.basicPatterns.add(p4);
        HoopPatternsVTG.basic12Patterns.add(p4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p5 = new Pattern(lefty, righty, "Tog-Opp Anti-Spin");
        HoopPatternsVTG.basicPatterns.add(p5);
        HoopPatternsVTG.basic12Patterns.add(p5);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p6 = new Pattern(lefty, righty, "Split-Same Anti-Spin");
        HoopPatternsVTG.basicPatterns.add(p6);
        HoopPatternsVTG.basic12Patterns.add(p6);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p7 = new Pattern(lefty, righty, "Tog-Same Anti-Spin");
        HoopPatternsVTG.basicPatterns.add(p7);
        HoopPatternsVTG.basic12Patterns.add(p7);


        // point basics

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po = new Pattern(lefty, righty, "Split-Time Centered");
        HoopPatternsVTG.pointPatterns.add(po);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po2 = new Pattern(lefty, righty, "Together-Time Centered");
        HoopPatternsVTG.pointPatterns.add(po2);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po1 = new Pattern(lefty, righty, "Opp-Dir Quarter-Time Centered");
        HoopPatternsVTG.pointPatterns.add(po1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern po3 = new Pattern(lefty, righty, "Same-Dir Quarter-Time Centered");
        HoopPatternsVTG.pointPatterns.add(po3);

        // close

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh = new Pattern(lefty, righty, "Opp-Dir Offset Points");
        HoopPatternsVTG.pointPatterns.add(poh);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh2 = new Pattern(lefty, righty, "Same-Dir Offset Points");
        HoopPatternsVTG.pointPatterns.add(poh2);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh1 = new Pattern(lefty, righty, "Opp-Dir Quarter-Time Offset Points");
        HoopPatternsVTG.pointPatterns.add(poh1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern poh3 = new Pattern(lefty, righty, "Same-Dir Quarter-Time Offset Points");
        HoopPatternsVTG.pointPatterns.add(poh3);

        // full

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof = new Pattern(lefty, righty, "Opp-Dir Side by Side");
        HoopPatternsVTG.pointPatterns.add(pof);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof2 = new Pattern(lefty, righty, "Same-Dir Side by Side");
        HoopPatternsVTG.pointPatterns.add(pof2);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof1 = new Pattern(lefty, righty, "Opp-Dir Quarter-Time Side by Side");
        HoopPatternsVTG.pointPatterns.add(pof1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0";
        Pattern pof3 = new Pattern(lefty, righty, "Same-Dir Quarter-Time Side by Side");
        HoopPatternsVTG.pointPatterns.add(pof3);

        //**/


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p8 = new Pattern(lefty, righty, "Path:Split-Same |X| Prop:Split-Opp Hybrid");
        HoopPatternsVTG.basicPatterns.add(p8);
        HoopPatternsVTG.basic12Patterns.add(p8);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p9 = new Pattern(lefty, righty, "Path:Tog-Same |X| Prop:Split-Opp Hybrid");
        HoopPatternsVTG.basicPatterns.add(p9);
        HoopPatternsVTG.basic12Patterns.add(p9);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p10 = new Pattern(lefty, righty, "Path:Split-Opp |X| Prop:Tog-Same Hybrid");
        HoopPatternsVTG.basicPatterns.add(p10);
        HoopPatternsVTG.basic12Patterns.add(p10);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p11 = new Pattern(lefty, righty, "Path:Tog-Opp |X| Prop:Tog-Same Hybrid");
        HoopPatternsVTG.basicPatterns.add(p11);
        HoopPatternsVTG.basic12Patterns.add(p11);

        //





        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p12 = new Pattern(lefty, righty, "Quarter-Time (Opp-Dir) Isolation");
        HoopPatternsVTG.basicPatterns.add(p12);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p13 = new Pattern(lefty, righty, "Quarter-Time (Same-Dir) Isolation");
        HoopPatternsVTG.basicPatterns.add(p13);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p14 = new Pattern(lefty, righty, "Quarter-Time (Opp-Dir) Anti-Spin");
        HoopPatternsVTG.basicPatterns.add(p14);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p15 = new Pattern(lefty, righty, "Quarter-Time (Same-Dir) Anti-Spin");
        HoopPatternsVTG.basicPatterns.add(p15);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p16 = new Pattern(lefty, righty, "Quarter-Time (Opp-Dir) Hybrid");
        HoopPatternsVTG.basicPatterns.add(p16);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p17 = new Pattern(lefty, righty, "Quarter-Time (Same-Dir) Hybrid");
        HoopPatternsVTG.basicPatterns.add(p17);




        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s0 = new Pattern(lefty, righty, "Starting Position - Together - Right");
        HoopPatternsVTG.basicPatterns.add(s0);

        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s01 = new Pattern(lefty, righty, "Starting Position - Together - Left");
        HoopPatternsVTG.basicPatterns.add(s01);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s02 = new Pattern(lefty, righty, "Starting Position - Together - Top");
        HoopPatternsVTG.basicPatterns.add(s02);

        lefty =  "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s03 = new Pattern(lefty, righty, "Starting Position - Together - Bottom");
        HoopPatternsVTG.basicPatterns.add(s03);

        lefty =  "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern s1 = new Pattern(lefty, righty, "Starting Position - Split Horizontal");
        HoopPatternsVTG.basicPatterns.add(s1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0,0.0";
        Pattern s2 = new Pattern(lefty, righty, "Starting Position - Split Vertical");
        HoopPatternsVTG.basicPatterns.add(s2);

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q0 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Bottom Right");
        HoopPatternsVTG.basicPatterns.add(q0);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q1 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Bottom Left");
        HoopPatternsVTG.basicPatterns.add(q1);

        lefty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q2 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Top Right");
        HoopPatternsVTG.basicPatterns.add(q2);

        lefty = "0,0.025,1.5707963267948966,0,0.025,4.71238898038469,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,250.0,0,345.0,0.0,0.0";
        Pattern q3 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Top Left");
        HoopPatternsVTG.basicPatterns.add(q3);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,350.0,0,248.0,0.0,0.0,0.0";
        Pattern q4 = new Pattern(lefty, righty, "Starting Position - Cross - Together");
        HoopPatternsVTG.basicPatterns.add(q4);

        lefty = "0,0.025,4.71238898038469,0,0.025,3.141592653589793,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        Pattern q5 = new Pattern(lefty, righty, "Starting Position - Cross - Apart");
        HoopPatternsVTG.basicPatterns.add(q5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        Pattern q6 = new Pattern(lefty, righty, "Starting Position - Cross - Quartertime");
        HoopPatternsVTG.basicPatterns.add(q6);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,350.0,0.0,0.0,0.0";
        Pattern q7 = new Pattern(lefty, righty, "Starting Position - Perpendicular - Split-Time");
        HoopPatternsVTG.basicPatterns.add(q7);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,146.0,0,248.0,0.0,0.0,0.0";
        righty = "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,1.0,0.0,9.0,205.0,Circle,0.0,0,248.0,0,145.0,0.0,0.0,0.0";
        Pattern q8 = new Pattern(lefty, righty, "Starting Position - Perpendicular - Together-Time");
        HoopPatternsVTG.basicPatterns.add(q8);


        //32

        HoopPatternsVTG.startingPositions.add(s0);
        HoopPatternsVTG.startingPositions.add(s01);
        HoopPatternsVTG.startingPositions.add(s02);
        HoopPatternsVTG.startingPositions.add(s03);
        HoopPatternsVTG.startingPositions.add(s1);
        HoopPatternsVTG.startingPositions.add(s2);
        HoopPatternsVTG.startingPositions.add(q0);
        HoopPatternsVTG.startingPositions.add(q1);
        HoopPatternsVTG.startingPositions.add(q2);
        HoopPatternsVTG.startingPositions.add(q3);
        HoopPatternsVTG.startingPositions.add(q4);
        HoopPatternsVTG.startingPositions.add(q5);
        HoopPatternsVTG.startingPositions.add(q6);
        HoopPatternsVTG.startingPositions.add(q7);
        HoopPatternsVTG.startingPositions.add(q8);


        // basic Cateye

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t8 = new Pattern(lefty, righty, "Split-Opp Cateye Hands-Together");
        HoopPatternsVTG.basicPatterns.add(t8); //33
        HoopPatternsVTG.basicTrammelPatterns.add(t8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t9 = new Pattern(lefty, righty, "Tog-Opp Cateye Hands-Split");
        HoopPatternsVTG.basicPatterns.add(t9);
        HoopPatternsVTG.basicTrammelPatterns.add(t9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t10 = new Pattern(lefty, righty, "Tog-Same Cateye");
        HoopPatternsVTG.basicPatterns.add(t10);
        HoopPatternsVTG.basicTrammelPatterns.add(t10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t11 = new Pattern(lefty, righty, "Split-Same Cateye");
        HoopPatternsVTG.basicPatterns.add(t11);
        HoopPatternsVTG.basicTrammelPatterns.add(t11);


        lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t = new Pattern(lefty, righty, "Opp-Dir Quarter-time Cateye");
        HoopPatternsVTG.basicPatterns.add(t);
        //HoopPatternsVTG.basicTrammelPatterns.add(t);

        lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t1 = new Pattern(lefty, righty, "Opp-Dir Quarter-time Perpendicular Cateye");
        HoopPatternsVTG.basicPatterns.add(t1);
        //HoopPatternsVTG.basicTrammelPatterns.add(t1);

        lefty =  "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t2 = new Pattern(lefty, righty, "Same-Dir Quarter-time 1-Perpendicular Cateye");
        HoopPatternsVTG.basicPatterns.add(t2);
        //HoopPatternsVTG.basicTrammelPatterns.add(t2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t3 = new Pattern(lefty, righty, "Same-Dir Quarter-time Same Cateye");
        HoopPatternsVTG.basicPatterns.add(t3);
        //HoopPatternsVTG.basicTrammelPatterns.add(t3);



        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t4 = new Pattern(lefty, righty, "Split-Opp Perpendicular Cateye Hands-Split");
        HoopPatternsVTG.basicPatterns.add(t4);
        HoopPatternsVTG.basicTrammelPatterns.add(t4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t5 = new Pattern(lefty, righty, "Tog-Opp Perpendicular Cateye Hands-Tog");
        HoopPatternsVTG.basicPatterns.add(t5);
        HoopPatternsVTG.basicTrammelPatterns.add(t5);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t6 = new Pattern(lefty, righty, "Split-Same Perpendicular Cateye Hands-Tog");
        HoopPatternsVTG.basicPatterns.add(t6);
        HoopPatternsVTG.basicTrammelPatterns.add(t6);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0, 1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t7 = new Pattern(lefty, righty, "Tog-Same Perpendicular Cateye Hands-Split");
        HoopPatternsVTG.basicPatterns.add(t7);
        HoopPatternsVTG.basicTrammelPatterns.add(t7);



        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t20 = new Pattern(lefty, righty, "Piston Cateye");
        HoopPatternsVTG.basicPatterns.add(t20);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t21 = new Pattern(lefty, righty, "Brush-By Cateye");
        HoopPatternsVTG.basicPatterns.add(t21);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t22 = new Pattern(lefty, righty, "Turning-T Cateye");
        HoopPatternsVTG.basicPatterns.add(t22);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t23 = new Pattern(lefty, righty, "Poi-Line Cateye");
        HoopPatternsVTG.basicPatterns.add(t23);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t23);

        lefty = "0,0.025,7.853981633974483,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t24 = new Pattern(lefty, righty, "Cross Cateye");
        HoopPatternsVTG.basicPatterns.add(t24);
        HoopPatternsVTG.basicTrammelPatterns.add(t24);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t25 = new Pattern(lefty, righty, "Yet Another Hybrid-Path Cateye");
        HoopPatternsVTG.basicPatterns.add(t25);
        //HoopPatternsVTG.hybridPathTrammelPatterns.add(t25);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t26 = new Pattern(lefty, righty, "Split-Opp 1-Perp Cateye Hands-Split");
        HoopPatternsVTG.basicPatterns.add(t26);
        HoopPatternsVTG.basicTrammelPatterns.add(t26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t27 = new Pattern(lefty, righty, "Tog-Opp 1-Perp Cateye Hands-Tog");
        HoopPatternsVTG.basicPatterns.add(t27);
        HoopPatternsVTG.basicTrammelPatterns.add(t27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t28 = new Pattern(lefty, righty, "Split-Same 1-Perp Cateye Hands-Tog");
        HoopPatternsVTG.basicPatterns.add(t28);
        HoopPatternsVTG.basicTrammelPatterns.add(t28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern t29 = new Pattern(lefty, righty, "Tog-Same 1-Perp Cateye Hands-Split");
        HoopPatternsVTG.basicPatterns.add(t29);
        HoopPatternsVTG.basicTrammelPatterns.add(t29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t30 = new Pattern(lefty, righty, "Fly-By Cateye");
        HoopPatternsVTG.basicPatterns.add(t30);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t30);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t31 = new Pattern(lefty, righty, "Linkage Cateye");
        HoopPatternsVTG.basicPatterns.add(t31);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t32 = new Pattern(lefty, righty, "Low Turning-T Cateye");
        HoopPatternsVTG.basicPatterns.add(t32);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t33 = new Pattern(lefty, righty, "Poi-Line Alt Cateye");
        HoopPatternsVTG.basicPatterns.add(t33);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t34 = new Pattern(lefty, righty, "Folding Piston Cateye");
        HoopPatternsVTG.basicPatterns.add(t34);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t34);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t35 = new Pattern(lefty, righty, "Folding Linkage Cateye");
        HoopPatternsVTG.basicPatterns.add(t35);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t36 = new Pattern(lefty, righty, "Big-Line Cateye");
        HoopPatternsVTG.basicPatterns.add(t36);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern t37 = new Pattern(lefty, righty, "Pass-Through Cateye");
        HoopPatternsVTG.basicPatterns.add(t37);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(t37);

        // Cateye quartertime / staggered  st

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st8 = new Pattern(lefty, righty, "Staggered Opp Cateye");
        HoopPatternsVTG.basicPatterns.add(st8);
        HoopPatternsVTG.basicTrammelPatterns.add(st8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st9 = new Pattern(lefty, righty, "Staggered Opp Cateye");
        HoopPatternsVTG.basicPatterns.add(st9);
        //HoopPatternsVTG.basicTrammelPatterns.add(st9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st10 = new Pattern(lefty, righty, "Staggered Same Cateye");
        HoopPatternsVTG.basicPatterns.add(st10);
        HoopPatternsVTG.basicTrammelPatterns.add(st10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st11 = new Pattern(lefty, righty, "Staggered Split-Same Cateye");
        HoopPatternsVTG.basicPatterns.add(st11);
        //HoopPatternsVTG.basicTrammelPatterns.add(st11);




        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st4 = new Pattern(lefty, righty, "Staggered Opp Perpendicular Cateye");
        HoopPatternsVTG.basicPatterns.add(st4);
        HoopPatternsVTG.basicTrammelPatterns.add(st4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st5 = new Pattern(lefty, righty, "Staggered Tog-Opp Perpendicular Cateye");
        HoopPatternsVTG.basicPatterns.add(st5);
        //HoopPatternsVTG.basicTrammelPatterns.add(st5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st6 = new Pattern(lefty, righty, "Staggered Same Perpendicular Cateye");
        HoopPatternsVTG.basicPatterns.add(st6);
        HoopPatternsVTG.basicTrammelPatterns.add(st6);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st7 = new Pattern(lefty, righty, "Staggered Same Perpendicular Cateye");
        HoopPatternsVTG.basicPatterns.add(st7);
        //HoopPatternsVTG.basicTrammelPatterns.add(st7);



        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st20 = new Pattern(lefty, righty, "Split-Opp Hybrid-Path Cateye");
        HoopPatternsVTG.basicPatterns.add(st20);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(st20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st21 = new Pattern(lefty, righty, "Tog-Opp Hybrid-Path Cateye");
        HoopPatternsVTG.basicPatterns.add(st21);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(st21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st22 = new Pattern(lefty, righty, "Split-Same Hybrid-Path Cateye");
        HoopPatternsVTG.basicPatterns.add(st22);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(st22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st23 = new Pattern(lefty, righty, "Tog-Same Hybrid-Path Cateye");
        HoopPatternsVTG.basicPatterns.add(st23);
        HoopPatternsVTG.hybridPathTrammelPatterns.add(st23);



        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st26 = new Pattern(lefty, righty, "Staggered Opp 1-Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st26);
        HoopPatternsVTG.basicTrammelPatterns.add(st26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st27 = new Pattern(lefty, righty, "Staggered Tog-Opp 1-Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st27);
        //HoopPatternsVTG.basicTrammelPatterns.add(st27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st28 = new Pattern(lefty, righty, "Staggered Same 1-Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st28);
        HoopPatternsVTG.basicTrammelPatterns.add(st28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        Pattern st29 = new Pattern(lefty, righty, "Staggered Tog-Same 1-Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st29);
        //HoopPatternsVTG.basicTrammelPatterns.add(st29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st30 = new Pattern(lefty, righty, "Split-Opp Hybrid-Path Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st30); //80

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st31 = new Pattern(lefty, righty, "Tog-Opp Hybrid-Path Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st32 = new Pattern(lefty, righty, "Split-Same Hybrid-Path Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st33 = new Pattern(lefty, righty, "Tog-Same Hybrid-Path Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st34 = new Pattern(lefty, righty, "Split-Opp Hybrid-Path 1-Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st34); //84

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st35 = new Pattern(lefty, righty, "Tog-Opp Hybrid-Path 1-Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st36 = new Pattern(lefty, righty, "Split-Same Hybrid-Path 1-Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
        Pattern st37 = new Pattern(lefty, righty, "Tog-Same Hybrid-Path 1-Perp Cateye");
        HoopPatternsVTG.basicPatterns.add(st37); //87

        // perpendicular /////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp8 = new Pattern(lefty, righty, "Tog-Opp 1:1 In-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(pp8);

        lefty = "0,0.025,3.141592653589793,0,0.025,4.7123889803846896,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp9 = new Pattern(lefty, righty, "Split-Opp 1:1 In-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(pp9);

        lefty =  "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp10 = new Pattern(lefty, righty, "Tog-Same 1:1 In-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(pp10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,4.7123889803846896,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp11 = new Pattern(lefty, righty, "Split-Same 1:1 In-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(pp11);

        //

        lefty = "0,0.025,4.7123889803846896,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp = new Pattern(lefty, righty, "Split-Opp 1:1 Anti-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(pp);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp1 = new Pattern(lefty, righty, "Tog-Opp 1:1 Anti-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(pp1);

        lefty =  "0,0.025,4.7123889803846896,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp2 = new Pattern(lefty, righty, "Split-Same 1:1 Anti-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(pp2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp3 = new Pattern(lefty, righty, "Tog-Same 1:1 Anti-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(pp3);

        //

        lefty = "0,0.025,0.0,0,0.025,4.7123889803846896,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp4 = new Pattern(lefty, righty, "Split-Same 1:1 Hybrid");
        HoopPatternsVTG.perpendicularPatterns.add(pp4);

        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp5 = new Pattern(lefty, righty, "Tog-Same 1:1 Hybrid");
        HoopPatternsVTG.perpendicularPatterns.add(pp5);

        lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp6 = new Pattern(lefty, righty, "Tog-Opp 1:1 Hybrid");
        HoopPatternsVTG.perpendicularPatterns.add(pp6);

        lefty = "0,0.025,0.0,0,0.025,4.7123889803846896,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern pp7 = new Pattern(lefty, righty, "Split-Opp 1:1 Hybrid");
        HoopPatternsVTG.perpendicularPatterns.add(pp7);

        /////

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p8 = new Pattern(lefty, righty, "Split-Opp One-Perp Iso/In-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(p1p8);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p9 = new Pattern(lefty, righty, "Tog-Opp One-Perp Iso/In-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(p1p9);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p10 = new Pattern(lefty, righty, "Tog-Same One-Perp Iso/In-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(p1p10);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p11 = new Pattern(lefty, righty, "Split-Same One-Perp Iso/In-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(p1p11);

        //

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p = new Pattern(lefty, righty, "Split-Opp 1-Perpendicular Anti-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(p1p);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p1 = new Pattern(lefty, righty, "Tog-Opp 1-Perpendicular Anti-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(p1p1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p2 = new Pattern(lefty, righty, "Split-Same 1-Perpendicular Anti-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(p1p2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p3 = new Pattern(lefty, righty, "Tog-Same 1-Perpendicular Anti-Spin");
        HoopPatternsVTG.perpendicularPatterns.add(p1p3);

        //

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p4 = new Pattern(lefty, righty, "Split-Same 1-Perpendicular Hybrid");
        HoopPatternsVTG.perpendicularPatterns.add(p1p4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p5 = new Pattern(lefty, righty, "Tog-Same 1-Perpendicular Hybrid");
        HoopPatternsVTG.perpendicularPatterns.add(p1p5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p6 = new Pattern(lefty, righty, "Split-Opp 1-Perpendicular Hybrid");
        HoopPatternsVTG.perpendicularPatterns.add(p1p6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern p1p7 = new Pattern(lefty, righty, "Tog-Opp 1-Perpendicular Hybrid");
        HoopPatternsVTG.perpendicularPatterns.add(p1p7);


        // extra beats    ////////////////////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep8 = new Pattern(lefty, righty, "2bt 1:2 - Split-Opp In-Spin");
        HoopPatternsVTG.extraBeatPatterns.add(ep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep9 = new Pattern(lefty, righty, "2bt 1:2 - Tog-Opp In-Spin");
        HoopPatternsVTG.extraBeatPatterns.add(ep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep10 = new Pattern(lefty, righty, "2bt 1:2 - Tog-Same In-Spin");
        HoopPatternsVTG.extraBeatPatterns.add(ep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep11 = new Pattern(lefty, righty, "2bt 1:2 - Split-Same In-Spin");
        HoopPatternsVTG.extraBeatPatterns.add(ep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep = new Pattern(lefty, righty, "2bt 1:2 - Split-Opp Anti-Spin");
        HoopPatternsVTG.extraBeatPatterns.add(ep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep1 = new Pattern(lefty, righty, "2bt 1:2 - Tog-Opp Anti-Spin");
        HoopPatternsVTG.extraBeatPatterns.add(ep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep2 = new Pattern(lefty, righty, "2bt 1:2 - Split-Same Anti-Spin");
        HoopPatternsVTG.extraBeatPatterns.add(ep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep3 = new Pattern(lefty, righty, "2bt 1:2 - Tog-Same Anti-Spin");
        HoopPatternsVTG.extraBeatPatterns.add(ep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep4 = new Pattern(lefty, righty, "2bt 1:2 - Split-Opp Hybrid");
        HoopPatternsVTG.extraBeatPatterns.add(ep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep5 = new Pattern(lefty, righty, "2bt 1:2 - Tog-Opp Hybrid");
        HoopPatternsVTG.extraBeatPatterns.add(ep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep6 = new Pattern(lefty, righty, "2bt 1:2 - Split-Same Hybrid");
        HoopPatternsVTG.extraBeatPatterns.add(ep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
        Pattern ep7 = new Pattern(lefty, righty, "2bt 1:2 - Tog-Same Hybrid");
        HoopPatternsVTG.extraBeatPatterns.add(ep7);

        //

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep8 = new Pattern(lefty, righty, "3bt 1:3 - Split-Opp In-Spin");
        HoopPatternsVTG.extraBeat2Patterns.add(eep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep9 = new Pattern(lefty, righty, "3bt 1:3 - Tog-Opp In-Spin");
        HoopPatternsVTG.extraBeat2Patterns.add(eep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep10 = new Pattern(lefty, righty, "3bt 1:3 - Tog-Same In-Spin");
        HoopPatternsVTG.extraBeat2Patterns.add(eep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep11 = new Pattern(lefty, righty, "3bt 1:3 - Split-Same In-Spin");
        HoopPatternsVTG.extraBeat2Patterns.add(eep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep = new Pattern(lefty, righty, "3bt 1:3 - Split-Opp Anti-Spin");
        HoopPatternsVTG.extraBeat2Patterns.add(eep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep1 = new Pattern(lefty, righty, "3bt 1:3 - Tog-Opp Anti-Spin");
        HoopPatternsVTG.extraBeat2Patterns.add(eep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep2 = new Pattern(lefty, righty, "3bt 1:3 - Split-Same Anti-Spin");
        HoopPatternsVTG.extraBeat2Patterns.add(eep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep3 = new Pattern(lefty, righty, "3bt 1:3 - Tog-Same Anti-Spin");
        HoopPatternsVTG.extraBeat2Patterns.add(eep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep4 = new Pattern(lefty, righty, "3bt 1:3 - Split-Opp Hybrid");
        HoopPatternsVTG.extraBeat2Patterns.add(eep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep5 = new Pattern(lefty, righty, "3bt 1:3 - Tog-Opp Hybrid");
        HoopPatternsVTG.extraBeat2Patterns.add(eep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep6 = new Pattern(lefty, righty, "3bt 1:3 - Split-Same Hybrid");
        HoopPatternsVTG.extraBeat2Patterns.add(eep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
        Pattern eep7 = new Pattern(lefty, righty, "3bt 1:3 - Tog-Same Hybrid");
        HoopPatternsVTG.extraBeat2Patterns.add(eep7);

//

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep8 = new Pattern(lefty, righty, "4bt 1:4 - Split-Opp In-Spin");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep9 = new Pattern(lefty, righty, "4bt 1:4 - Tog-Opp In-Spin");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep10 = new Pattern(lefty, righty, "4bt 1:4 - Tog-Same In-Spin");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep11 = new Pattern(lefty, righty, "4bt 1:4 - Split-Same In-Spin");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep = new Pattern(lefty, righty, "4bt 1:4 - Split-Opp Anti-Spin");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep1 = new Pattern(lefty, righty, "4bt 1:4 - Tog-Opp Anti-Spin");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep2 = new Pattern(lefty, righty, "4bt 1:4 - Split-Same Anti-Spin");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep3 = new Pattern(lefty, righty, "4bt 1:4 - Tog-Same Anti-Spin");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep4 = new Pattern(lefty, righty, "4bt 1:4 - Split-Opp Hybrid");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep5 = new Pattern(lefty, righty, "4bt 1:4 - Tog-Opp Hybrid");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep6 = new Pattern(lefty, righty, "4bt 1:4 - Split-Same Hybrid");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
        Pattern eeep7 = new Pattern(lefty, righty, "4bt 1:4 - Tog-Same Hybrid");
        HoopPatternsVTG.extraBeat3Patterns.add(eeep7);

        //

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep8 = new Pattern(lefty, righty, "5bt 1:5 - Split-Opp In-Spin");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep9 = new Pattern(lefty, righty, "5bt 1:5 - Tog-Opp In-Spin");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep10 = new Pattern(lefty, righty, "5bt 1:5 - Tog-Same In-Spin");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep11 = new Pattern(lefty, righty, "5bt 1:5 - Split-Same In-Spin");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep = new Pattern(lefty, righty, "5bt 1:5 - Split-Opp Anti-Spin");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep1 = new Pattern(lefty, righty, "5bt 1:5 - Tog-Opp Anti-Spin");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep2 = new Pattern(lefty, righty, "5bt 1:5 - Split-Same Anti-Spin");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep3 = new Pattern(lefty, righty, "5bt 1:5 - Tog-Same Anti-Spin");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep3);

        //

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep4 = new Pattern(lefty, righty, "5bt 1:5 - Split-Opp Hybrid");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep4);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep5 = new Pattern(lefty, righty, "5bt 1:5 - Tog-Opp Hybrid");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep5);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep6 = new Pattern(lefty, righty, "5bt 1:5 - Split-Same Hybrid");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep6);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
        Pattern eeeep7 = new Pattern(lefty, righty, "5bt 1:5 - Tog-Same Hybrid");
        HoopPatternsVTG.extraBeat4Patterns.add(eeeep7);


        // point hybrids

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph8 = new Pattern(lefty, righty, "Opp-Dir Point-Hybrid Isolation Split");
        HoopPatternsVTG.pointHybridPatterns.add(ph8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph9 = new Pattern(lefty, righty, "Opp-Dir Point-Hybrid Isolation Same");
        HoopPatternsVTG.pointHybridPatterns.add(ph9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph10 = new Pattern(lefty, righty, "Same-Dir Point-Hybrid Isolation Same");
        HoopPatternsVTG.pointHybridPatterns.add(ph10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph11 = new Pattern(lefty, righty, "Same-Dir Point-Hybrid Isolation Split");
        HoopPatternsVTG.pointHybridPatterns.add(ph11);

        //

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph = new Pattern(lefty, righty, "Opp-Dir Point-Hybrid Anti-Spin Split *");
        HoopPatternsVTG.pointHybridPatterns.add(ph);

        lefty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph1 = new Pattern(lefty, righty, "Opp-Dir Point-Hybrid Anti-Spin Same *");
        HoopPatternsVTG.pointHybridPatterns.add(ph1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph2 = new Pattern(lefty, righty, "Same-Dir Point-Hybrid Anti-Spin Split");
        HoopPatternsVTG.pointHybridPatterns.add(ph2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
        Pattern ph3 = new Pattern(lefty, righty, "Same-Dir Point-Hybrid Anti-Spin Same");
        HoopPatternsVTG.pointHybridPatterns.add(ph3);

        // point hybrids perp
				/*

				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph8p = new Pattern(lefty, righty, "Opp-Dir Perpendicular Point-Hybrid Isolation Split");
				Patterns.pointHybridPatterns.add(ph8p);

				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph9p = new Pattern(lefty, righty, "Opp-Dir Perpendicular Point-Hybrid Isolation Same");
				Patterns.pointHybridPatterns.add(ph9p);

				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph10p = new Pattern(lefty, righty, "Same-Dir Perpendicular Point-Hybrid Isolation Same");
				Patterns.pointHybridPatterns.add(ph10p);

				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph11p = new Pattern(lefty, righty, "Same-Dir Perpendicular Point-Hybrid Isolation Split");
				Patterns.pointHybridPatterns.add(ph11p);

				//

				lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern php = new Pattern(lefty, righty, "Opp-Dir Perpendicular Point-Hybrid Anti-Spin Split *");
				Patterns.pointHybridPatterns.add(php);

				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph1p = new Pattern(lefty, righty, "Opp-Dir Perpendicular Point-Hybrid Anti-Spin Same *");
				Patterns.pointHybridPatterns.add(ph1p);

				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph2p = new Pattern(lefty, righty, "Same-Dir Perpendicular Point-Hybrid Anti-Spin Split");
				Patterns.pointHybridPatterns.add(ph2p);

				lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph3p = new Pattern(lefty, righty, "Same-Dir Perpendicular Point-Hybrid Anti-Spin Same");
				Patterns.pointHybridPatterns.add(ph3p);

				/**/
        //

        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps = new Pattern(lefty, righty, "Square Split-Opp Isolation");
        HoopPatternsVTG.squarePatterns.add(ps);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps1 = new Pattern(lefty, righty, "Square Tog-Opp Isolation");
        HoopPatternsVTG.squarePatterns.add(ps1);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps2 = new Pattern(lefty, righty, "Square Split-Same Isolation");
        HoopPatternsVTG.squarePatterns.add(ps2);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps3 = new Pattern(lefty, righty, "Square Tog-Same Isolation");
        HoopPatternsVTG.squarePatterns.add(ps3);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps4 = new Pattern(lefty, righty, "Square Split-Opp Anti-Spin");
        HoopPatternsVTG.squarePatterns.add(ps4);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps5 = new Pattern(lefty, righty, "Square Tog-Opp Anti-Spin");
        HoopPatternsVTG.squarePatterns.add(ps5);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps6 = new Pattern(lefty, righty, "Square Split-Same Anti-Spin");
        HoopPatternsVTG.squarePatterns.add(ps6);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps7 = new Pattern(lefty, righty, "Square Tog-Same Anti-Spin");
        HoopPatternsVTG.squarePatterns.add(ps7);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps8 = new Pattern(lefty, righty, "Square Split-Opp Hybrid");
        HoopPatternsVTG.squarePatterns.add(ps8);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps9 = new Pattern(lefty, righty, "Square Tog-Opp Hybrid");
        HoopPatternsVTG.squarePatterns.add(ps9);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps10 = new Pattern(lefty, righty, "Square Split-Same Hybrid");
        HoopPatternsVTG.squarePatterns.add(ps10);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps11 = new Pattern(lefty, righty, "Square Tog-Same Hybrid");
        HoopPatternsVTG.squarePatterns.add(ps11);

        //

        lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern psp = new Pattern(lefty, righty, "Square Perpendicular Split-Opp Isolation");
        HoopPatternsVTG.squarePatterns.add(psp);

        lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps1p = new Pattern(lefty, righty, "Square Perpendicular Tog-Opp Isolation");
        HoopPatternsVTG.squarePatterns.add(ps1p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps2p = new Pattern(lefty, righty, "Square Perpendicular Split-Same Isolation");
        HoopPatternsVTG.squarePatterns.add(ps2p);

        lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps3p = new Pattern(lefty, righty, "Square Perpendicular Tog-Same Isolation");
        HoopPatternsVTG.squarePatterns.add(ps3p);

        //

        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps4p = new Pattern(lefty, righty, "Square Perpendicular Split-Opp Anti-Spin");
        HoopPatternsVTG.squarePatterns.add(ps4p);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps5p = new Pattern(lefty, righty, "Square Perpendicular Tog-Opp Anti-Spin");
        HoopPatternsVTG.squarePatterns.add(ps5p);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps6p = new Pattern(lefty, righty, "Square Perpendicular Split-Same Anti-Spin");
        HoopPatternsVTG.squarePatterns.add(ps6p);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps7p = new Pattern(lefty, righty, "Square Perpendicular Tog-Same Anti-Spin");
        HoopPatternsVTG.squarePatterns.add(ps7p);

//

        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps8p = new Pattern(lefty, righty, "Square Perpendicular Split-Opp Hybrid");
        HoopPatternsVTG.squarePatterns.add(ps8p);

        lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps9p = new Pattern(lefty, righty, "Square Perpendicular Tog-Opp Hybrid");
        HoopPatternsVTG.squarePatterns.add(ps9p);

        lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps10p = new Pattern(lefty, righty, "Square Perpendicular Split-Same Hybrid *");
        HoopPatternsVTG.squarePatterns.add(ps10p);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty =  "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern ps11p = new Pattern(lefty, righty, "Square Perpendicular Tog-Same Hybrid");
        HoopPatternsVTG.squarePatterns.add(ps11p);


        //// extra beat Cateye


        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et8 = new Pattern(lefty, righty, "Split-Opp 1:2 Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et8);

        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et9 = new Pattern(lefty, righty, "Tog-Opp 1:2 Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et9);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et10 = new Pattern(lefty, righty, "Tog-Same 1:2 Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et10);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et11 = new Pattern(lefty, righty, "Split-Same 1:2 Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et11);



            /*
            lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
            righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
            Pattern et = new Pattern(lefty, righty, "Opp-Dir  1:2 Quarter-time Cateye");
            HoopPatternsVTG.extraBeatTrammelPatterns.add(et);

            lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
            righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
            Pattern et1 = new Pattern(lefty, righty, "Opp-Dir  1:2 Quarter-time Perpendicular Cateye");
            HoopPatternsVTG.extraBeatTrammelPatterns.add(et1);

            lefty =  "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
            righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
            Pattern et2 = new Pattern(lefty, righty, "Same-Dir  1:2 Quarter-time 1-Perpendicular Cateye");
            HoopPatternsVTG.extraBeatTrammelPatterns.add(et2);

            lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
            righty =  "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
            Pattern et3 = new Pattern(lefty, righty, "Same-Dir  1:2 Quarter-time Same Cateye");
            HoopPatternsVTG.extraBeatTrammelPatterns.add(et3);
            /**/


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et4 = new Pattern(lefty, righty, "Split-Opp 1:2 Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et5 = new Pattern(lefty, righty, "Tog-Opp 1:2 Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et5);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et6 = new Pattern(lefty, righty, "Split-Same 1:2 Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et6);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et7 = new Pattern(lefty, righty, "Tog-Same 1:2 Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et7);



        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et20 = new Pattern(lefty, righty, "Split-Opp 1:2 Hybrid-Path Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et20);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et21 = new Pattern(lefty, righty, "Tog-Opp 1:2 Hybrid-Path Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et21);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et22 = new Pattern(lefty, righty, "Split-Same 1:2 Hybrid-Path Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et22);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et23 = new Pattern(lefty, righty, "Tog-Same 1:2 Hybrid-Path Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et23);

        ///


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et26 = new Pattern(lefty, righty, "Split-Opp  1:2 1-Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et26);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et27 = new Pattern(lefty, righty, "Tog-Opp  1:2 1-Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et27);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et28 = new Pattern(lefty, righty, "Split-Same  1:2 1-Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et28);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        Pattern et29 = new Pattern(lefty, righty, "Tog-Same  1:2 1-Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et29);


        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et30 = new Pattern(lefty, righty, "Opp-Dir Staggered 1:2 Hybrid-Path Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et30);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et31 = new Pattern(lefty, righty, "Opp-Dir Staggered 1:2 Hybrid-Path Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et31);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et32 = new Pattern(lefty, righty, "Stroking Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et32);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et33 = new Pattern(lefty, righty, "Same-Dir Staggered 1:2 Hybrid-Path Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et33);


        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et34 = new Pattern(lefty, righty, "Opp-Dir Staggered 1:2 Hybrid-Path 1-Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et34);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et35 = new Pattern(lefty, righty, "Opp-Dir Staggered 1:2 Hybrid-Path 1-Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et35);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et36 = new Pattern(lefty, righty, "Same-Dir Staggered 1:2 Hybrid-Path 1-Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et36);

        lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
        Pattern et37 = new Pattern(lefty, righty, "Same-Dir Staggered 1:2 Hybrid-Path 1-Perp Cateye");
        HoopPatternsVTG.extraBeatTrammelPatterns.add(et37);

        ///// quarter square

//

        lefty = "0,0.025,8.6393797973719311,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps = new Pattern(lefty, righty, "Square Opp-Dir Isolation Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps2 = new Pattern(lefty, righty, "Square Same-Dir Isolation Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps2);

        ////

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps4 = new Pattern(lefty, righty, "Square Opp-Dir Anti-Spin Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps4);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps6 = new Pattern(lefty, righty, "Square Same-Dir Anti-Spin Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps6);

        // //

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps8 = new Pattern(lefty, righty, "Square Opp-Dir Hybrid Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps8);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps10 = new Pattern(lefty, righty, "Square Same-Dir Hybrid Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps10);

        ////

        lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qpsp = new Pattern(lefty, righty, "Square Perpendicular Opp-Dir Isolation Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qpsp);

        lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps2p = new Pattern(lefty, righty, "Square Perpendicular Same-Dir Isolation Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps2p);

        ////

        lefty = "0,0.025,8.6393797973719311,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps4p = new Pattern(lefty, righty, "Square Perpendicular Opp-Dir Anti-Spin Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps4p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps6p = new Pattern(lefty, righty, "Square Perpendicular Same-Dir Anti-Spin Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps6p);

//              //

        lefty = "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0";
        righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps8p = new Pattern(lefty, righty, "Square Perpendicular Opp-Dir Hybrid Quarter-Time");
        HoopPatternsVTG.quarterSquarePatterns.add(qps8p);

        lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        righty = "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
        Pattern qps10p = new Pattern(lefty, righty, "Square Perpendicular Same-Dir Hybrid Quarter-Time *");
        HoopPatternsVTG.quarterSquarePatterns.add(qps10p);


        ////////////////////////////////////////////////////////////////////////////////////////////
        // CAPS
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap = new Pattern(lefty, righty, "CAP Path:Tog-Opp |X| Prop:Tog-Opp");
        HoopPatternsVTG.CAPSPatterns.add(cap);

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap4 = new Pattern(lefty, righty, "CAP Path:Tog-Opp |X| Prop:Tog-Opp Alt");
        HoopPatternsVTG.CAPSPatterns.add(cap4);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap2 = new Pattern(lefty, righty, "CAP Path:Split-Same |X| Prop:Split-Same");
        HoopPatternsVTG.CAPSPatterns.add(cap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap6 = new Pattern(lefty, righty, "CAP Path:Split-Same |X| Prop:Split-Same Alt");
        HoopPatternsVTG.CAPSPatterns.add(cap6);



        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap1 = new Pattern(lefty, righty, "CAP Path:Split-Same |X| Prop:Opp Hybrid");
        HoopPatternsVTG.CAPSPatterns.add(cap1);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap8 = new Pattern(lefty, righty, "CAP Path:Split-Same |X| Prop:Opp Hybrid Alt");
        HoopPatternsVTG.CAPSPatterns.add(cap8);

        lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap3 = new Pattern(lefty, righty, "CAP Path:Tog-Opp |X| Prop:Same Hybrid");
        HoopPatternsVTG.CAPSPatterns.add(cap3);

        lefty =  "0,0.025,3.141592653589793,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalLeftComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern cap7 = new Pattern(lefty, righty, "CAP Path:Tog-Opp |X| Prop:Same Hybrid Alt");
        HoopPatternsVTG.CAPSPatterns.add(cap7);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // buzzsaw caps
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,3.141592653589793,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap = new Pattern(lefty, righty, "Buzzsaw CAP Path:Together |X| Prop:Tog-Opp");
        HoopPatternsVTG.buzzsawCAPSPatterns.add(bcap);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap1 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Split |X| Prop:Split-Opp");
        HoopPatternsVTG.buzzsawCAPSPatterns.add(bcap1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap2 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Together |X| Prop:Tog-Same");
        HoopPatternsVTG.buzzsawCAPSPatterns.add(bcap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfVerticalRightComplexShape,1.0,0,250.0,0,345.0";
        Pattern bcap3 = new Pattern(lefty, righty, "Buzzsaw CAP Path:Split |X| Prop:Split-Same");
        HoopPatternsVTG.buzzsawCAPSPatterns.add(bcap3);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // Vertical CAPS
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap = new Pattern(lefty, righty, "CAP Path:Split-Opp |X| Prop:Split-Opp High/Low");
        HoopPatternsVTG.verticalCAPSPatterns.add(vcap);

        lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap4 = new Pattern(lefty, righty, "CAP Path:Split-Opp |X| Prop:Split-Opp Alt High/Low");
        HoopPatternsVTG.verticalCAPSPatterns.add(vcap4);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap2 = new Pattern(lefty, righty, "CAP Path:Split-Same |X| Prop:Split-Same High/Low");
        HoopPatternsVTG.verticalCAPSPatterns.add(vcap2);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap6 = new Pattern(lefty, righty, "CAP Path:Split-Same |X| Prop:Split-Same Alt High/Low");
        HoopPatternsVTG.verticalCAPSPatterns.add(vcap6);



        lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap1 = new Pattern(lefty, righty, "CAP Path:Split-Same |X| Prop:Split-Same Hybrid High/Low");
        HoopPatternsVTG.verticalCAPSPatterns.add(vcap1);

        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap8 = new Pattern(lefty, righty, "CAP Path:Split-Same |X| Prop:Split-Same Hybrid Alt High/Low");
        HoopPatternsVTG.verticalCAPSPatterns.add(vcap8);


        lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap3 = new Pattern(lefty, righty, "CAP Path:Split-Opp |X| Prop:Tog-Opp Hybrid High/Low");
        HoopPatternsVTG.verticalCAPSPatterns.add(vcap3);

        lefty =   "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalTopComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HalfHorizontalBottomComplexShape,1.0,0,250.0,0,345.0";
        Pattern vcap7 = new Pattern(lefty, righty, "CAP Path:Split-Opp |X| Prop:Tog-Opp Hybrid Alt High/Low");
        HoopPatternsVTG.verticalCAPSPatterns.add(vcap7);




        ////////////////////////////////////////////////////////////////////////////////////////////
        // Ping Pongs
        ////////////////////////////////////////////////////////////////////////////////////////////


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp = new Pattern(lefty, righty, "PingPong - Tog-Opp Isolation ");
        HoopPatternsVTG.pingpongPatterns.add(pongp);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp1 = new Pattern(lefty, righty, "PingPong - Split-Opp Isolation");
        HoopPatternsVTG.pingpongPatterns.add(pongp1);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp2 = new Pattern(lefty, righty, "PingPong - Tog-Same Isolation");
        HoopPatternsVTG.pingpongPatterns.add(pongp2);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (0) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp3 = new Pattern(lefty, righty, "PingPong - Split-Same Isolation");
        HoopPatternsVTG.pingpongPatterns.add(pongp3);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp4 = new Pattern(lefty, righty, "PingPong - Tog-Opp Anti-Spin");
        HoopPatternsVTG.pingpongPatterns.add(pongp4);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp5 = new Pattern(lefty, righty, "PingPong - Split-Opp Anti-Spin");
        HoopPatternsVTG.pingpongPatterns.add(pongp5);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + 0 + ",FullReverse";
        Pattern pongp6 = new Pattern(lefty, righty, "PingPong - Split-Same Anti-Spin");
        HoopPatternsVTG.pingpongPatterns.add(pongp6);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp7 = new Pattern(lefty, righty, "PingPong - Tog-Same Anti-Spin");
        HoopPatternsVTG.pingpongPatterns.add(pongp7);


        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + (Math.PI + Math.PI/2) + ",HalfCC," + (Math.PI) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp8 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Split-Same |X| Prop:Split-Opp");
        HoopPatternsVTG.pingpongPatterns.add(pongp8);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp9 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Tog-Same |X| Prop:Split-Opp");
        HoopPatternsVTG.pingpongPatterns.add(pongp9);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (Math.PI) * -1 + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp10 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Split-Opp |X| Prop:Tog-Same");
        HoopPatternsVTG.pingpongPatterns.add(pongp10);

        lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        lefty = lefty + ",0," + Math.PI/2 + ",HalfCC," + (0) + ",FullReverse";
        righty = righty + ",0," + Math.PI/2 + ",HalfCC," + Math.PI + ",FullReverse";
        Pattern pongp11 = new Pattern(lefty, righty, "PingPong - Hybrid Path:Tog-Opp |X| Prop:Tog-Same");
        HoopPatternsVTG.pingpongPatterns.add(pongp11);


        ////////////////////////////////////////////////////////////////////////////////////////////
        // Chuu chuus
        ////////////////////////////////////////////////////////////////////////////////////////////

        lefty = "0,0.025,4.71238898038469,0,0.025,-3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + Math.PI ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + Math.PI + ",FullReverse," + Math.PI;
        Pattern chuup1s = new Pattern(lefty, righty, "The Chuu Chuu Snake");
        HoopPatternsVTG.snakeChuuChuuPatterns.add(chuup1s);

        lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + 0 ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + 0 + ",FullReverse," + Math.PI;
        Pattern chuups = new Pattern(lefty, righty, "Chuu Chhu Snake - Ur Doing it Wrong");
        HoopPatternsVTG.snakeChuuChuuPatterns.add(chuups);

        lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + Math.PI ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + 0 + ",FullReverse," + Math.PI;
        Pattern chuup2s = new Pattern(lefty, righty, "Half a Chuu Chuu Snake");
        HoopPatternsVTG.snakeChuuChuuPatterns.add(chuup2s);

        lefty =  "0,0.025,4.71238898038469,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,PausedCapHalfTwoComplexShape,1.0,0,250.0,0,345.0";
        righty = righty + ",0," + (Math.PI/2) + ",HalfCC,0.0,FullReverse," + 0 ; // pushes shape
        lefty = lefty + ",0," + (Math.PI/2) + ",HalfCC," + Math.PI + ",FullReverse," + 0;
        Pattern chuup3s = new Pattern(lefty, righty, "One Sided Chuu Chuu Snake");
        HoopPatternsVTG.snakeChuuChuuPatterns.add(chuup3s);
    }


}

