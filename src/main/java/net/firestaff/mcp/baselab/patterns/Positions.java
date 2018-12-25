package net.firestaff.mcp.baselab.patterns;

import net.firestaff.mcp.baselab.util.Point;
import java.util.HashMap;


public class Positions {

    public static int unit_x = 205;
    public static int unit_y = 9;

    public static int center_x = 0;
    public static int center_y = 0;

    public static Point POINT_CENTER = new Point(center_x,center_y);
    public static Point POINT_CENTER_UP = new Point(center_x,center_y - unit_x);
    public static Point POINT_CENTER_DOWN = new Point(center_x,center_y + unit_x);
    public static Point POINT_CENTER_LEFT = new Point(center_x - unit_x,center_y);
    public static Point POINT_CENTER_RIGHT = new Point(center_x + unit_x,center_y);

    public static Point POINT_CENTER_UP_HALF = new Point(center_x,center_y - (unit_x/2));
    public static Point POINT_CENTER_DOWN_HALF = new Point(center_x,center_y + (unit_x/2));
    public static Point POINT_CENTER_LEFT_HALF = new Point(center_x - (unit_x/2),center_y);
    public static Point POINT_CENTER_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y);

    public static Point POINT_UP_LEFT = new Point(center_x - unit_x,center_y - unit_x);
    public static Point POINT_UP_RIGHT = new Point(center_x + unit_x,center_y - unit_x);
    public static Point POINT_DOWN_LEFT = new Point(center_x - unit_x,center_y + unit_x);
    public static Point POINT_DOWN_RIGHT = new Point(center_x + unit_x,center_y + unit_x);

    public static Point POINT_UP_LEFT_HALF = new Point(center_x - (unit_x/2),center_y - (unit_x/2));
    public static Point POINT_UP_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y - (unit_x/2));
    public static Point POINT_DOWN_LEFT_HALF = new Point(center_x - (unit_x/2),center_y + (unit_x/2));
    public static Point POINT_DOWN_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y + (unit_x/2));

    public static String STRING_CENTER = "center";
    public static String STRING_CENTER_UP = "center_up";
    public static String STRING_CENTER_DOWN = "center_down";
    public static String STRING_CENTER_LEFT = "center_left";
    public static String STRING_CENTER_RIGHT = "center_right";

    public static String STRING_CENTER_UP_HALF = "center_up_half";
    public static String STRING_CENTER_DOWN_HALF = "center_down_half";
    public static String STRING_CENTER_LEFT_HALF = "center_left_half";
    public static String STRING_CENTER_RIGHT_HALF = "center_right_half";

    public static String STRING_UP_LEFT = "up_left";
    public static String STRING_UP_RIGHT = "up_right";
    public static String STRING_DOWN_LEFT = "down_left";
    public static String STRING_DOWN_RIGHT = "down_right";

    public static String STRING_UP_LEFT_HALF = "up_left_half";
    public static String STRING_UP_RIGHT_HALF = "up_right_half";
    public static String STRING_DOWN_LEFT_HALF = "down_left_half";
    public static String STRING_DOWN_RIGHT_HALF = "down_right_half";

    public static HashMap<String, Point> positionMap = new HashMap<String, Point>();
    public static HashMap<Point, String> positionBackMap = new HashMap<Point, String>();

    public static Point getPosition(String name) {
        Point p = POINT_CENTER;
        p = positionMap.get(name);
        if(p == null) p = POINT_CENTER;
        return p;
    }

    public static String getName(int x, int y) {
        Point p = new Point(x, y);
        String result = positionBackMap.get(p);
        if(result != null) return result;
        return "center";
    }

    public static void initValues(int unit_x_, int unit_y_) {
        unit_x = unit_x_;
        unit_y = unit_y_;

        POINT_CENTER = new Point(center_x,center_y);
        POINT_CENTER_UP = new Point(center_x,center_y - unit_x);
        POINT_CENTER_DOWN = new Point(center_x,center_y + unit_x);
        POINT_CENTER_LEFT = new Point(center_x - unit_x,center_y);
        POINT_CENTER_RIGHT = new Point(center_x + unit_x,center_y);

        POINT_CENTER_UP_HALF = new Point(center_x,center_y - (unit_x/2));
        POINT_CENTER_DOWN_HALF = new Point(center_x,center_y + (unit_x/2));
        POINT_CENTER_LEFT_HALF = new Point(center_x - (unit_x/2),center_y);
        POINT_CENTER_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y);

        POINT_UP_LEFT = new Point(center_x - unit_x,center_y - unit_x);
        POINT_UP_RIGHT = new Point(center_x + unit_x,center_y - unit_x);
        POINT_DOWN_LEFT = new Point(center_x - unit_x,center_y + unit_x);
        POINT_DOWN_RIGHT = new Point(center_x + unit_x,center_y + unit_x);

        POINT_UP_LEFT_HALF = new Point(center_x - (unit_x/2),center_y - (unit_x/2));
        POINT_UP_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y - (unit_x/2));
        POINT_DOWN_LEFT_HALF = new Point(center_x - (unit_x/2),center_y + (unit_x/2));
        POINT_DOWN_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y + (unit_x/2));


        positionMap.put("center",POINT_CENTER);
        positionMap.put("center_up",POINT_CENTER_UP);
        positionMap.put("center_down",POINT_CENTER_DOWN);
        positionMap.put("center_left",POINT_CENTER_LEFT);
        positionMap.put("center_right",POINT_CENTER_RIGHT);
        positionMap.put("center_up_half",POINT_CENTER_UP_HALF);
        positionMap.put("center_down_half",POINT_CENTER_DOWN_HALF);
        positionMap.put("center_left_half",POINT_CENTER_LEFT_HALF);
        positionMap.put("center_right_half",POINT_CENTER_RIGHT_HALF);
        positionMap.put("up_left",POINT_UP_LEFT);
        positionMap.put("up_right",POINT_UP_RIGHT);
        positionMap.put("down_left",POINT_DOWN_LEFT);
        positionMap.put("down_right",POINT_DOWN_RIGHT);
        positionMap.put("up_left_half",POINT_UP_LEFT_HALF);
        positionMap.put("up_right_half",POINT_UP_RIGHT_HALF);
        positionMap.put("down_left_half",POINT_DOWN_LEFT_HALF);
        positionMap.put("down_right_half",POINT_DOWN_RIGHT_HALF);

        for (String o : positionMap.keySet()) {
            positionBackMap.put(positionMap.get(o), o);
        }

    }

    public String toString() {
        String result = "";
        for (String o : positionMap.keySet()) {
            result = result + o + ": x:" + positionMap.get(o).x + " y:" + positionMap.get(o).y + "\n";
        }
        return result;
    }
}
