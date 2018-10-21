package net.firestaff.mcp.baselab.speeds.direction;

public class DirectionHelper{

    public static int updateAsymmetricOnOffAngle(double angle, int direction, double period, double mod) {

        //double still = (increment * speed * direction);
        double circleAngle = Math.abs ((angle + mod) % (period * 2.0));

        //System.out.println("Direction: " + direction + " angle " + circleAngle + " period " + period);
        // 0 -> period return 0 = moving
        if (circleAngle <= period) {
            //System.out.println("Direction NO CHANGE: " + direction);
            return direction ;
        }
        else {
            //System.out.println("Direction CHANGE: " + direction * -1);
            return direction * -1;
        }
    }

    public static Direction getDirectionControl(String name) {
        Direction togo = new NoChange();

        if (name == null) return togo;
        if (name == "" || name.equalsIgnoreCase("None")) return togo;

        String shape = name;
        for (Direction s : DirectionConstants.shapes) {
            if (s.getName().equalsIgnoreCase(shape)) {
                togo = s;
                break;
            }
        }
        return togo;
    }
}
