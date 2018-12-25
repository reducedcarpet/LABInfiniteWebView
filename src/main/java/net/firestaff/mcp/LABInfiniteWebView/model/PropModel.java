package net.firestaff.mcp.LABInfiniteWebView.model;

import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.patterns.Pattern;
import net.firestaff.mcp.baselab.patterns.Positions;
import net.firestaff.mcp.baselab.util.PropPagerConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PropModel {

    public int pathDirection = 1;

    public int propDirection = 1;

    public double xAdj = 0;

    public double yAdj = 0;

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

    public boolean use3D = false;
    public String zShape = "";
    public double mod3D = 0;

    public List<String> decoratorShape = new ArrayList<String>();
    public boolean flipProp = false;

    public PropModel() {}

    public PropModel copy()
    {
        PropModel clone = new PropModel();
        clone.complexShape = this.complexShape;
        clone.pathDirection = this.pathDirection;
        clone.propDirection = this.propDirection;
        clone.xAdj = this.xAdj;
        clone.yAdj = this.yAdj;
        clone.pathSizeModifier = this.pathSizeModifier;
        clone.pathAngleIncrement = this.pathAngleIncrement;
        clone.pathAngleModifier = this.pathAngleModifier;
        clone.pathSpeed = this.pathSpeed;
        clone.pathRotation = this.pathRotation;
        clone.propAngleIncrement = this.propAngleIncrement;
        clone.propAngleModifier = this.propAngleModifier;
        clone.propSpeed = this.propSpeed;
        clone.shape = this.shape;
        clone.pivotX = this.pivotX;
        clone.pivotY = this.pivotY;
        clone.speedControl = this.speedControl;
        clone.speedChangeModifier = this.speedChangeModifier;
        clone.directionControl = this.directionControl;
        clone.directionChangeModifier = this.directionChangeModifier;
        clone.zShape = this.zShape;
        clone.use3D = this.use3D;
        return clone;
    }

    public String toString() {
        String pathDirection_ = "CCW";
        if(pathDirection == PropPagerConstants.CW) pathDirection_ = "CW";
        String propDirection_ = "CCW";
        if(propDirection == PropPagerConstants.CW) propDirection_ = "CW";
       //System.out.println("COMPLEX SHAPE: " + complexShape);
        if(complexShape.equals("")) complexShape = "None";


        String pattern = "";
        pattern = pattern + "" + shape;
        pattern = pattern + "," + complexShape;
        pattern = pattern + "," + propDirection_;
        pattern = pattern + "," + pathDirection_;
        pattern = pattern + "," + (int)Math.toDegrees(propAngleModifier);
        pattern = pattern + "," + (int)Math.toDegrees(pathAngleModifier * pathDirection);
        pattern = pattern + "," + (int)Math.toDegrees(pathRotation);
        pattern = pattern + "," + pathSizeModifier;
        pattern = pattern + "," + pathSpeed;
        pattern = pattern + "," + propSpeed;
        pattern = pattern + "," + Positions.getName((int)xAdj,(int)yAdj);
        pattern = pattern + "," + pivotX;
        pattern = pattern + "," + speedControl;
        pattern = pattern + "," + (int)speedChangeModifier;
        pattern = pattern + "," + directionControl;
        pattern = pattern + "," + (int)directionChangeModifier;
        pattern = pattern + "," + use3D;
        pattern = pattern + "," + zShape;

        if(complexShape.equals("None")) complexShape = "";

        return pattern;
    }

    public static String toVerboseString(PropModel l, PropModel r) {
        String lpathDirection_ = "CCW";
        if(l.pathDirection == PropPagerConstants.CW) lpathDirection_ = "CW";
        String lpropDirection_ = "CCW";
        if(l.propDirection == PropPagerConstants.CW) lpropDirection_ = "CW";

        String rpathDirection_ = "CCW";
        if(r.pathDirection == PropPagerConstants.CW) rpathDirection_ = "CW";
        String rpropDirection_ = "CCW";
        if(r.propDirection == PropPagerConstants.CW) rpropDirection_ = "CW";


        String pattern = "\t\t\t\t\t\t\t\tLeft \t| Right\n";
        pattern = pattern + "Shape:\t\t\t\t\t" + l.shape + " \t| " + r.shape + "\n";
        pattern = pattern + "Shape Modifier:\t\t\t" + l.complexShape + " \t| " + r.complexShape + "\n";
        pattern = pattern + "Prop Direction:\t\t\t" + lpropDirection_ + " \t| " + rpropDirection_ + "\n";
        pattern = pattern + "Path Direction:\t\t\t" + lpathDirection_ + " \t| " + rpathDirection_ + "\n";
        pattern = pattern + "Turn Prop:\t\t\t\t\t" + (int)Math.toDegrees(l.propAngleModifier) + " \t| " + (int)Math.toDegrees(r.propAngleModifier) + "\n";
        pattern = pattern + "Push Path:\t\t\t\t" + (int)Math.toDegrees(l.pathAngleModifier * l.pathDirection) + " \t| " + (int)Math.toDegrees(r.pathAngleModifier * r.pathDirection) + "\n";
        pattern = pattern + "Path Rotation:\t\t\t" + (int)Math.toDegrees(l.pathRotation) + " \t| " + (int)Math.toDegrees(r.pathRotation) + "\n";
        pattern = pattern + "Path Size:\t\t\t\t\t" + l.pathSizeModifier + " \t| " + r.pathSizeModifier + "\n";
        pattern = pattern + "Path Speed:\t\t\t\t" + l.pathSpeed + " \t| " + r.pathSpeed + "\n";
        pattern = pattern + "Prop Speed:\t\t\t\t" + l.propSpeed + " \t| " + r.propSpeed + "\n";
        pattern = pattern + "Position:\t\t\t" + Positions.getName((int)l.xAdj,(int)l.yAdj) + " \t| " + Positions.getName((int)r.xAdj,(int)r.yAdj) + "\n";
        pattern = pattern + "Grip Point:\t\t\t\t\t" + l.pivotX + " \t| " + r.pivotX + "\n";
        pattern = pattern + "Speed Control:\t" + l.speedControl + " \t| " + r.speedControl + "\n";
        pattern = pattern + "Speed Mod:\t\t\t\t" + (int)Math.toDegrees(l.speedChangeModifier) + " \t| " + (int)Math.toDegrees(r.speedChangeModifier) + "\n";
        pattern = pattern + "Direction Control:\t" + l.directionControl + " \t| " + r.directionControl + "\n";
        pattern = pattern + "Direction Mod:\t\t\t" + (int)Math.toDegrees(l.directionChangeModifier) + " \t| " + (int)Math.toDegrees(r.directionChangeModifier) + "\n";
        //pattern = pattern + "3D:\t\t\t\t\t\t\t" + l.use3D + " \t| " + r.use3D + "\n";;
        //pattern = pattern + "3D Shape:\t\t\t" + l.zShape + " \t| " + r.zShape + "\n";;

        return pattern;
    }

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
    // 14
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void parsePattern(String phrase) {
        // TODO strip start

        StringTokenizer tokenizer = new StringTokenizer(phrase, ",");
        // in order
        // 1
        String shape_ = tokenizer.nextToken();
        shape = shape_;

        String complexShape_ = tokenizer.nextToken();
        complexShape = complexShape_;

        String propDirection_ = tokenizer.nextToken();
        if(propDirection_.equalsIgnoreCase("CW")) propDirection = 1;
        else propDirection = -1;

        String pathDirection_ = tokenizer.nextToken();
        if(pathDirection_.equalsIgnoreCase("CW")) pathDirection = 1;
        else pathDirection = -1;

        String propAngleModifier_ = tokenizer.nextToken();
        propAngleModifier = Math.toRadians(Double.parseDouble(propAngleModifier_));

        String pathAngleModifier_ = tokenizer.nextToken();
        pathAngleModifier = Math.toRadians(Double.parseDouble(pathAngleModifier_));
        pathAngleModifier *= pathDirection;

        String pathRotation_ = tokenizer.nextToken();
        pathRotation = Math.toRadians(Double.parseDouble(pathRotation_));

        String pathSizeModifier_ = tokenizer.nextToken();
        pathSizeModifier = Double.parseDouble(pathSizeModifier_);

        String pathSpeed_ = tokenizer.nextToken();
        pathSpeed = Double.parseDouble(pathSpeed_);

        String propSpeed_ = tokenizer.nextToken();
        propSpeed = Double.parseDouble(propSpeed_);

        String position_ = tokenizer.nextToken();
        Point p = Positions.getPosition(position_);
        xAdj = p.x;
        yAdj = p.y;

        String pivotX_ = tokenizer.nextToken();
        pivotX = Double.parseDouble(pivotX_);

        if(tokenizer.hasMoreTokens()) {
            String speedControl_ = tokenizer.nextToken();
            if(!speedControl_.equalsIgnoreCase(""))
                speedControl = speedControl_;
        }

        if(tokenizer.hasMoreTokens()) {
            String speedmod_ = tokenizer.nextToken();
            speedChangeModifier = Double.parseDouble(speedmod_);
        }

        if(tokenizer.hasMoreTokens()) {
            String directionControl_ = tokenizer.nextToken();
            if(!directionControl_.equalsIgnoreCase(""))
                directionControl = directionControl_;
        }

        if(tokenizer.hasMoreTokens()) {
            String directionmod_ = tokenizer.nextToken();
            directionChangeModifier = Double.parseDouble(directionmod_);
        }

        if(tokenizer.hasMoreTokens()) {
            String use3D_ = tokenizer.nextToken();
            if(!use3D_.equalsIgnoreCase(""))
                use3D = Boolean.parseBoolean(use3D_);
        }

        if(tokenizer.hasMoreTokens()) {
            String zShape_ = tokenizer.nextToken();
            if(!zShape_.equalsIgnoreCase(""))
                zShape = zShape_;
        }
    }

    // Pattern Format OLD//////////////////////////////////////////////////////////////////////////
    // 1 PropAngle Radians, 2 PropIncrement, 3 PropAngleModifier,
    // 4 PathAngle, 5 PathIncrement, 6 PathAngleModifier, 7 PathSizeModifier
    // 8 PropDirection, 9 PathDirection, 10 PathSpeed
    // 11 Height, 12 Length, 13 Shape String
    // 14 PropSpeed
    // 15 X, 16 XAdj, 17 Y, 18 YAdj
    // OPTIONAL:
    // 19 PropChange
    // 20 PathRotation
    // 21 PathChange <- now SPEEDCONTROL
    // 22 AngleSpeedChangeMod
    // 23 AngleSpeedChangeMod2
    // 24 UseSpeedChange
    // 25 UseSpeedChangeType
    ////////////////////////////////////////////////////////////////////////////////////////////


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
            //System.out.println("up leftText half");
        }
        else if(newX >= 340 && newX <= 350 && newY >= 240 && newY <= 250) {
            this.xAdj = Positions.POINT_UP_RIGHT_HALF.x;
            this.yAdj = Positions.POINT_UP_RIGHT_HALF.y;
            //System.out.println("up rightText half");
        }
        else if(newX >= 140 && newX <= 150 && newY >= 340 && newY <= 350) {
            this.xAdj = Positions.POINT_CENTER_LEFT_HALF.x;
            this.yAdj = Positions.POINT_CENTER_LEFT_HALF.y;
            //System.out.println("center leftText half");
        }
        else if(newX >= 340 && newX <= 350 && newY >= 340 && newY <= 350) {
            this.xAdj = Positions.POINT_CENTER_RIGHT_HALF.x;
            this.yAdj = Positions.POINT_CENTER_RIGHT_HALF.y;
            //System.out.println("center rightText half");
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
    }

    public static void setPatternIn(Pattern p, PropModel left, PropModel right) {
        if(p.getLeftText().contains("CW")) {
            loadPatternin(p, left, right);
            return;
        }
        left.parsePropText(p.getLeftText());
        right.parsePropText(p.getRightText());
    }

    public static void loadPatternin(Pattern p, PropModel left, PropModel right) {
        left.parsePattern(p.getLeftText());
        right.parsePattern(p.getRightText());
    }

    public void setPosition(Point p) {
        this.xAdj = p.x;
        this.yAdj = p.y;
    }
}
