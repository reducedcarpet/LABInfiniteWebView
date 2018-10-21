package net.firestaff.mcp.baselab.speeds.speed;

public class HalfQuarterCC extends AbstractSpeed implements Speed {

    public String getName() {
        return "HalfQuarterCC";
    }

    public double updateAngle(double angle, double propAngle, double increment, double speed, int direction, double mod) {
        //mod = mod % (Math.PI / 2);
        return SpeedHelper.updateAsymmetricOnOffAngle(angle, propAngle, increment, speed, direction, (Math.PI), (Math.PI / 2), mod);
    }

    public Speed copy() {
        Speed copy = new HalfQuarterCC();
        copy.setLowerSpeed(lowerSpeed);
        copy.setUpperSpeed(upperSpeed);
        return copy;
    }
}
