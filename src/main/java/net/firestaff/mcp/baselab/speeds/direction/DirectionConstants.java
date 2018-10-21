package net.firestaff.mcp.baselab.speeds.direction;

import java.util.ArrayList;
import java.util.List;

public class DirectionConstants {

    public static final Direction NO_CHANGE = new NoChange();
    public static final Direction HALF = new HalfReverseDirection();
    public static final Direction FULL = new FullReverseDirection();
    public static final Direction QUARTER = new QuarterReverseDirection();
    public static final Direction THREEQUARTERS = new ThreeQuarterReverseDirection();

    public static final List<Direction> shapes = new ArrayList<Direction>() {
        {
            add(NO_CHANGE);
            add(HALF);
            add(FULL);
            add(QUARTER);
            add(THREEQUARTERS);

        }};
}
