package net.firestaff.mcp.LABInfiniteWebView.test;

import net.firestaff.mcp.baselab.patterns.Positions;

import java.util.StringTokenizer;

public class PatternView {

    public int pathDirection = 1;

    public int propDirection = 1;

    public int xAdj = 0;

    public int yAdj = 0;

    public double pathSizeModifier = 1;

    public double pathAngleIncrement = Math.PI / 125;

    public double pathAngleModifier = 0;

    public double pathSpeed = 1;

    public double pathRotation = 0;

    public double propAngleIncrement = Math.PI / 125;

    public double propAngleModifier = 0;

    public double propSpeed = 1;

    public String shape = "Circle";

    public String complexShape = "";

    public double pivotX = 0;

    public double pivotY = 0;

    public String speedControl = "Constant";
    public double speedChangeModifier = 0;

    public String directionControl = "NoChange";
    public double directionChangeModifier = 0;

    public boolean useGravity = false;
    public boolean usePendulums = false;

    public boolean use3D = false;
    public String zShape = "";
    public double mod3D = 0;

    public double upperSpeed = 1;
    public double lowerSpeed = 0;

    // Pattern Format NEW//////////////////////////////////////////////////////////////////////////
    // 1 Shape
    // 2 Complex Shape
    // 3 PropDirection,
    // 4 PathDirection
    // 5 PropAngleModifier
    // 6 pathAngleModifier
    // 7 pathRotation
    // 8 pathSizeModifier
    // 9 pathSpeed
    // 10 propSpeed
    // 11 Position String
    // 12 PivotX
    // 13 SpeedControl String
    // 14 SpeedControl Mod
    // 15 DirectionControl String
    // 16 DirectionControl Mod
    // 17 use3D
    // 18 ZShape String
    ///////////////////////////////////////////////////////////////////////////////////////////////


    public void parsePropText(String phrase) {
        this.pivotX = 0;
        this.pivotY = 0;

        StringTokenizer tokenizer = new StringTokenizer(phrase, ",");
        // in order
        // 1
        String angle = tokenizer.nextToken();
        //this.propAngle = Double.parseDouble(angle);

        String angleIncrement = tokenizer.nextToken();
        double incr1 = Double.parseDouble(angleIncrement);
        //this.propAngleIncrement = incr1; //TODO

        String angleModifier = tokenizer.nextToken();
        this.propAngleModifier = Double.parseDouble(angleModifier);
        //this.propAngle += this.propAngleModifier;
        // no control update needed
        // 4
        String circleAngle = tokenizer.nextToken();
        //this.pathAngle = Double.parseDouble(circleAngle);
        // no control update needed

        String circleAngleIncrement = tokenizer.nextToken();
        double incr = Double.parseDouble(circleAngleIncrement);
        //this.pathAngleIncrement = incr; //TODO

        String circleAngleModifier = tokenizer.nextToken();
        this.pathAngleModifier = Double.parseDouble(circleAngleModifier);

        //this.pathAngle += this.pathAngleModifier;

        // 7
        String circleModifier = tokenizer.nextToken();
        this.pathSizeModifier = Double.parseDouble(circleModifier);

        String direction = tokenizer.nextToken();
        this.propDirection = (int)Double.parseDouble(direction);

        String handDirection = tokenizer.nextToken();
        this.pathDirection = (int)Double.parseDouble(handDirection);
        //this.pathAngleModifier *= this.pathDirection;

        String handSpeed = tokenizer.nextToken();
        this.pathSpeed = Double.parseDouble(handSpeed);

        String height = tokenizer.nextToken();
        //this.height = Double.parseDouble(height);
        // no control update needed

        String length = tokenizer.nextToken();
        //this.length = Double.parseDouble(length);
        // no control update needed

        this.pathRotation = 0;

        String shape_ = tokenizer.nextToken();
        this.shape = shape_;
        if(shape_.endsWith("ComplexShape")) {this.shape = "Circle"; this.complexShape = shape_;}
        else complexShape = "None";

        //System.out.println("shape: " + this.shape + " : " + complexShape);

        String speed = tokenizer.nextToken();
        this.propSpeed = Double.parseDouble(speed);

        String x = tokenizer.nextToken();
        //this.x = Double.parseDouble(x);

        String xadj = tokenizer.nextToken();
        int newX = (int)Double.parseDouble(xadj);

        String y = tokenizer.nextToken();
        //this.y = Double.parseDouble(y);

        String yadj = tokenizer.nextToken();
        int newY = (int)Double.parseDouble(yadj);

        //System.out.println("xnew: " + newX + " ynew: " + newY);

        if(newX >= 240 && newX <= 250 && newY >= 340 && newY <= 350) {
            this.xAdj = Positions.POINT_CENTER.x;
            this.yAdj = Positions.POINT_CENTER.y;
            //System.out.println("center");
        }
        else if(newX >= 240 && newX <= 250 && newY >= 140 && newY <= 150) {
            this.xAdj = Positions.POINT_CENTER_UP.x;
            this.yAdj = Positions.POINT_CENTER_UP.y;
            //System.out.println("center up");
        }
        else if(newX >= 240 && newX <= 250 && newY >= 240 && newY <= 250) {
            this.xAdj = Positions.POINT_CENTER_UP_HALF.x;
            this.yAdj = Positions.POINT_CENTER_UP_HALF.y;
            //System.out.println("center up half");
        }
        else if(newX >= 140 && newX <= 150 && newY >= 240 && newY <= 250) {
            this.xAdj = Positions.POINT_UP_LEFT_HALF.x;
            this.yAdj = Positions.POINT_UP_LEFT_HALF.y;
            //System.out.println("up left half");
        }
        else if(newX >= 340 && newX <= 350 && newY >= 240 && newY <= 250) {
            this.xAdj = Positions.POINT_UP_RIGHT_HALF.x;
            this.yAdj = Positions.POINT_UP_RIGHT_HALF.y;
            //System.out.println("up right half");
        }
        else if(newX >= 140 && newX <= 150 && newY >= 340 && newY <= 350) {
            this.xAdj = Positions.POINT_CENTER_LEFT_HALF.x;
            this.yAdj = Positions.POINT_CENTER_LEFT_HALF.y;
            //System.out.println("center left half");
        }
        else if(newX >= 340 && newX <= 350 && newY >= 340 && newY <= 350) {
            this.xAdj = Positions.POINT_CENTER_RIGHT_HALF.x;
            this.yAdj = Positions.POINT_CENTER_RIGHT_HALF.y;
            //System.out.println("center right half");
        }
        else {
            this.xAdj = Positions.POINT_CENTER.x;
            this.yAdj = Positions.POINT_CENTER.y;
            //System.out.println("center else");
        }
        //System.out.println("xadj: " + xAdj + " yadj: " + yAdj);

        if(tokenizer.hasMoreTokens()) {
            String change = tokenizer.nextToken();
            //this.staffChange = Double.parseDouble(change);
        }
        else {
            //this.staffChange = AbstractProp.defaultStaffChange;
        }

        if(tokenizer.hasMoreTokens()) {
            String rotate = tokenizer.nextToken();
            this.pathRotation = Double.parseDouble(rotate);
            // System.out.println("pathRotation - " + this.pathRotation);
        }
        else {
            this.pathRotation = 0;
        }

        if(tokenizer.hasMoreTokens()) {
            String SC = tokenizer.nextToken();
            if(SC != null && !SC.equalsIgnoreCase(""))
                this.speedControl = SC;
        }
        else {
            this.speedControl = "Constant";
        }

        if(tokenizer.hasMoreTokens()) {
            String rotate = tokenizer.nextToken();
            this.speedChangeModifier = Double.parseDouble(rotate);
            // System.out.println("pathRotation - " + this.pathRotation);
        }
        else {
            this.speedChangeModifier = 0;
        }

        if(tokenizer.hasMoreTokens()) {
            String SC = tokenizer.nextToken();
            if(SC != null && !SC.equalsIgnoreCase(""))
                this.directionControl = SC;
        }
        else {
            this.directionControl = "NoChange";
        }

        if(tokenizer.hasMoreTokens()) {
            String rotate = tokenizer.nextToken();
            this.directionChangeModifier = Double.parseDouble(rotate);
            // System.out.println("pathRotation - " + this.pathRotation);
        }
        else {
            this.directionChangeModifier = 0;
        }

        if(tokenizer.hasMoreTokens()) {
            String useGravity_ = tokenizer.nextToken();
            if(!useGravity_.equalsIgnoreCase(""))
                useGravity = Boolean.parseBoolean(useGravity_);
        }

        if(tokenizer.hasMoreTokens()) {
            String usePendulums_ = tokenizer.nextToken();
            if(!usePendulums_.equalsIgnoreCase(""))
                usePendulums = Boolean.parseBoolean(usePendulums_);
        }
    }


}
