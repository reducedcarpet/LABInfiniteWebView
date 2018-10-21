package net.firestaff.mcp.baselab.speeds.speed;

import net.firestaff.mcp.baselab.speeds.speed.*;

import java.util.ArrayList;
import java.util.List;

public class SpeedConstants {

    public static final Speed FULL = new FullCC();
    public static final Speed THREE_QUARTERS = new ThreeQuarterCC();
    public static final Speed HALF = new HalfCC();
    public static final Speed QUARTER = new QuarterCC();
    public static final Speed CONSTANT = new ConstantSpeed();

    public static final Speed QUARTER_HALF = new QuarterHalfCC();
    public static final Speed HALF_QUARTER = new HalfQuarterCC();

    public static final List<Speed> shapes = new ArrayList<Speed>() {
        {
            add(FULL);
            add(THREE_QUARTERS);
            add(HALF);
            add(QUARTER);
            add(CONSTANT);

            add(QUARTER_HALF);
            add(HALF_QUARTER);
        }};
}
