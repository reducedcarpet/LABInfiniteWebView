package net.firestaff.mcp.baselab.speeds.speed;

public class HalfCC extends AbstractSpeed implements Speed {

    public String getName() {
        return "HalfCC";
    }

    public double updateAngle(double angle,  double propAngle, double increment, double speed, int direction, double mod) {
        if(lowerSpeed == 0)  return SpeedHelper.updateSymmetricOnOffAngle(angle, propAngle, increment, speed, direction, (Math.PI), mod);
        return SpeedHelper.updateSymmetricPolySpeedAngle(upperSpeed, lowerSpeed, angle, propAngle, increment, speed, direction, (Math.PI), mod);
    }

    public Speed copy() {
        Speed copy = new HalfCC();
        copy.setLowerSpeed(lowerSpeed);
        copy.setUpperSpeed(upperSpeed);
        return copy;
    }
}
