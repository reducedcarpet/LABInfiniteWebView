package net.firestaff.mcp.baselab.speeds.direction;

public class NoChange implements Direction{
    @Override
    public int updateAngle(double angle, int direction, double mod) {
        return direction;
    }
    public String getName() {
        return "NoChange";
    }
}
