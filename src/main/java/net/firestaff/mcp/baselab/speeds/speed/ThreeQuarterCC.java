package net.firestaff.mcp.baselab.speeds.speed;

public class ThreeQuarterCC extends AbstractSpeed implements Speed {

    public String getName() {
        return "ThreeQuarterCC";
    }

    public double updateAngle(double angle,  double propAngle, double increment, double speed, int direction, double mod) {
        mod = mod % (Math.PI * 2);
        return SpeedHelper.updateSymmetricOnOffAngle(angle, propAngle, increment, speed, direction, (Math.PI + (Math.PI/2)), mod);
    }

    public Speed copy() {
        Speed copy = new ThreeQuarterCC();
        copy.setLowerSpeed(lowerSpeed);
        copy.setUpperSpeed(upperSpeed);
        return copy;
    }
}
