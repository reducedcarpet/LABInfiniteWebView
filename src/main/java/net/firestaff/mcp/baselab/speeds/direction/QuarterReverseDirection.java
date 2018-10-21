package net.firestaff.mcp.baselab.speeds.direction;

public class QuarterReverseDirection implements Direction{

    @Override
    public int updateAngle(double angle, int direction, double mod) {
        return DirectionHelper.updateAsymmetricOnOffAngle(angle, direction, Math.PI/2, mod);
        //return 1;
    }

    public String getName() {
        return "QuarterReverse";
    }
}
