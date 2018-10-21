package net.firestaff.mcp.baselab.speeds.speed;

import net.firestaff.mcp.baselab.speeds.speed.Speed;

public class ConstantSpeed extends AbstractSpeed implements Speed {
    @Override
    public double updateAngle(double angle, double propAngle,  double increment, double speed, int direction, double mod) {
        return 0;
    }

    public String getName() {
        return "Constant";
    }

    public Speed copy() {
        Speed copy = new ConstantSpeed();
        copy.setLowerSpeed(lowerSpeed);
        copy.setUpperSpeed(upperSpeed);
        return copy;
    }
}
