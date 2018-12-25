package net.firestaff.mcp.baselab.speeds.speed;

public class QuarterCC extends AbstractSpeed implements Speed {

    public String getName() {
        return "QuarterCC";
    }

    public double updateAngle(double angle, double propAngle, double increment, double speed, int direction, double mod) {
        //if(lowerSpeed == 0)
            return SpeedHelper.updateSymmetricOnOffAngle(angle, propAngle, increment, speed, direction, (Math.PI / 2), mod);
        //else
        //    return SpeedHelper.updateSymmetricPolySpeedAngle(upperSpeed, lowerSpeed, angle, propAngle, increment, speed, direction, (Math.PI / 2), mod);
    }

    public Speed copy() {
        Speed copy = new QuarterCC();
        copy.setLowerSpeed(lowerSpeed);
        copy.setUpperSpeed(upperSpeed);
        return copy;
    }
}
