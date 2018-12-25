package net.firestaff.mcp.baselab.speeds.speed;

public class FullCC extends AbstractSpeed implements Speed {

    public String getName() {
        return "FullCC";
    }

    public double updateAngle(double angle, double propAngle,  double increment, double speed, int direction, double mod) {
        //mod = mod % (Math.PI * 2);
        //if(lowerSpeed == 0)
            return SpeedHelper.updateSymmetricOnOffAngle(angle, propAngle, increment, speed, direction, (Math.PI * 2), mod);
        //else return SpeedHelper.updateSymmetricPolySpeedAngle(upperSpeed, lowerSpeed, angle, propAngle, increment, speed, direction, (Math.PI * 2), mod);
    }

    public Speed copy() {
        Speed copy = new FullCC();
        copy.setLowerSpeed(lowerSpeed);
        copy.setUpperSpeed(upperSpeed);
        return copy;
    }
}
