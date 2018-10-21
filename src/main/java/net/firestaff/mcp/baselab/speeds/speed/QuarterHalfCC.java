package net.firestaff.mcp.baselab.speeds.speed;

public class QuarterHalfCC extends AbstractSpeed implements Speed {

    public String getName() {
        return "QuarterHalfCC";
    }

    public double updateAngle(double angle, double propAngle, double increment, double speed, int direction, double mod) {
        //mod = mod % (Math.PI / 2);
        return SpeedHelper.updateAsymmetricOnOffAngle(angle, propAngle, increment, speed, direction, (Math.PI / 2), (Math.PI), mod);
    }

    public Speed copy() {
        Speed copy = new QuarterHalfCC();
        copy.setLowerSpeed(lowerSpeed);
        copy.setUpperSpeed(upperSpeed);
        return copy;
    }
}

