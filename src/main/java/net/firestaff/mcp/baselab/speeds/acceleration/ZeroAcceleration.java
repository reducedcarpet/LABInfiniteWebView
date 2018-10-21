package net.firestaff.mcp.baselab.speeds.acceleration;

import net.firestaff.mcp.baselab.speeds.acceleration.Acceleration;

public class ZeroAcceleration implements Acceleration {
    @Override
    public double updateAngle(double angle, double increment, double speed, int direction) {
        return 0;
    }

    public void reset(int dir) {}
}
