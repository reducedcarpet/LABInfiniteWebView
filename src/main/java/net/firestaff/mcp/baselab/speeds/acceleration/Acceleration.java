package net.firestaff.mcp.baselab.speeds.acceleration;

public interface Acceleration {

    public double updateAngle(double angle, double increment, double speed, int direction);

    public void reset(int propDirection);
}
