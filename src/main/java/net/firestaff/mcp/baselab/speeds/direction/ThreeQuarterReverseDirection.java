package net.firestaff.mcp.baselab.speeds.direction;

public class ThreeQuarterReverseDirection implements Direction{

    @Override
    public int updateAngle(double angle, int direction, double mod) {
        return DirectionHelper.updateAsymmetricOnOffAngle(angle, direction, (Math.PI + (Math.PI/2)), mod);
        //return 1;
    }

    public String getName() {
        return "ThreeQuarterReverse";
    }
}
