package net.firestaff.mcp.baselab.speeds.direction;

public interface Direction {

    public int updateAngle(double angle, int direction, double mod);

    public String getName();
}
