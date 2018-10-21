package net.firestaff.mcp.baselab.speeds.speed;

public interface Speed {
    double updateAngle(double angle, double propAngle, double increment, double speed, int direction, double mod);

    String getName();

    void setUpperSpeed(double speed);

    void setLowerSpeed(double speed);

    Speed copy();
}
