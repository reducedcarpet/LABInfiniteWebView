package net.firestaff.mcp.baselab.speeds.speed;

public abstract class AbstractSpeed implements Speed {

    double upperSpeed = 1;
    double lowerSpeed = 0;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpperSpeed(double speed) {
        upperSpeed = speed;
    }

    @Override
    public void setLowerSpeed(double speed) {
        lowerSpeed = speed;
    }
}
