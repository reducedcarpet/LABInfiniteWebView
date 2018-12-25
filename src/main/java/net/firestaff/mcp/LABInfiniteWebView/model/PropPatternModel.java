package net.firestaff.mcp.LABInfiniteWebView.model;

import lombok.*;
import net.firestaff.mcp.baselab.patterns.Positions;
import net.firestaff.mcp.baselab.util.PropPagerConstants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.io.Serializable;
import java.util.StringTokenizer;

@Entity
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode  @ToString
public class PropPatternModel implements Serializable {


    //private @Id @GeneratedValue Long id;
    private @Id String textPattern;

    private int pathDirection = 1;
    private int propDirection = 1;
    private int xAdj = 0;
    private int yAdj = 0;
    private double pathSizeModifier = 1;
    private double pathAngleModifier = 0;
    private double pathSpeed = 1;
    private double pathRotation = 0;
    private double propAngleModifier = 0;
    private double propSpeed = 1;
    private String shape = "Circle";
    private String complexShape = "";
    private double pivotX = 0;
    private double pivotY = 0;

    private String speedControl = "Constant";
    private double speedChangeModifier = 0;

    private String directionControl = "NoChange";
    private double directionChangeModifier = 0;

    private boolean useGravity = false;
    private boolean usePendulums = false;

    private boolean use3D;
    private String zShape;
    private double mod3D;
    private boolean flip3D;
    private boolean twist3D;

    private double upperSpeed;
    private double lowerSpeed;

    public void setTextPattern(String textPattern) {
        parsePropText(textPattern);
        this.textPattern = toString();
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
        pattern = pattern + "," + Positions.getName(xAdj,yAdj);
        pattern = pattern + "," + pivotX;
        pattern = pattern + "," + speedControl;
        pattern = pattern + "," + (int)speedChangeModifier;
        pattern = pattern + "," + directionControl;
        pattern = pattern + "," + (int)directionChangeModifier;
        pattern = pattern + "," + use3D;
        pattern = pattern + "," + zShape;
        pattern = pattern + "," + mod3D;
        pattern = pattern + "," + flip3D;
        pattern = pattern + "," + twist3D;
        pattern = pattern + "," + upperSpeed;
        pattern = pattern + "," + lowerSpeed;
        pattern = pattern + "," + useGravity;
        pattern = pattern + "," + usePendulums;

        if(complexShape.equals("None")) complexShape = "";

        return pattern;
    }

    private void parsePropText(String phrase) {
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
            this.xAdj = (int)Positions.POINT_CENTER.x;
            this.yAdj = (int)Positions.POINT_CENTER.y;
            //System.out.println("center");
        }
        else if(newX >= 240 && newX <= 250 && newY >= 140 && newY <= 150) {
            this.xAdj = (int)Positions.POINT_CENTER_UP.x;
            this.yAdj = (int)Positions.POINT_CENTER_UP.y;
            //System.out.println("center up");
        }
        else if(newX >= 240 && newX <= 250 && newY >= 240 && newY <= 250) {
            this.xAdj = (int)Positions.POINT_CENTER_UP_HALF.x;
            this.yAdj = (int)Positions.POINT_CENTER_UP_HALF.y;
            //System.out.println("center up half");
        }
        else if(newX >= 140 && newX <= 150 && newY >= 240 && newY <= 250) {
            this.xAdj = (int)Positions.POINT_UP_LEFT_HALF.x;
            this.yAdj = (int)Positions.POINT_UP_LEFT_HALF.y;
            //System.out.println("up left half");
        }
        else if(newX >= 340 && newX <= 350 && newY >= 240 && newY <= 250) {
            this.xAdj = (int)Positions.POINT_UP_RIGHT_HALF.x;
            this.yAdj = (int)Positions.POINT_UP_RIGHT_HALF.y;
            //System.out.println("up right half");
        }
        else if(newX >= 140 && newX <= 150 && newY >= 340 && newY <= 350) {
            this.xAdj = (int)Positions.POINT_CENTER_LEFT_HALF.x;
            this.yAdj = (int)Positions.POINT_CENTER_LEFT_HALF.y;
            //System.out.println("center left half");
        }
        else if(newX >= 340 && newX <= 350 && newY >= 340 && newY <= 350) {
            this.xAdj = (int)Positions.POINT_CENTER_RIGHT_HALF.x;
            this.yAdj = (int)Positions.POINT_CENTER_RIGHT_HALF.y;
            //System.out.println("center right half");
        }
        else {
            this.xAdj = (int)Positions.POINT_CENTER.x;
            this.yAdj = (int)Positions.POINT_CENTER.y;
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
            String use3D_ = tokenizer.nextToken();
            if(!use3D_.equalsIgnoreCase(""))
                use3D = Boolean.parseBoolean(use3D_);
            else use3D = false;
        }

        if(tokenizer.hasMoreTokens()) {
            String zShape_ = tokenizer.nextToken();
            if(!zShape_.equalsIgnoreCase(""))
                zShape = zShape_;
        }

        if(tokenizer.hasMoreTokens()) {
            String useFlip_ = tokenizer.nextToken();
            if(!useFlip_.equalsIgnoreCase(""))
                flip3D = Boolean.parseBoolean(useFlip_);
            else flip3D = false;
        }

        if(tokenizer.hasMoreTokens()) {
            String useTwist_ = tokenizer.nextToken();
            if(!useTwist_.equalsIgnoreCase(""))
                twist3D = Boolean.parseBoolean(useTwist_);
            else twist3D = false;
        }
    }

}
