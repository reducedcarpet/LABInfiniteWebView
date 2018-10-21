package net.firestaff.mcp.baselab.speeds.speed;

public class ChuuChuuSpeed extends AbstractSpeed implements Speed {
    double still;
    double circleAngle;
    double realIncrement;
    double difference;

    double period = Math.PI;

    @Override
    public double updateAngle(double angle, double propAngle, double increment, double speed, int direction, double mod) {
        still = (increment * speed * direction) * -1.0;
        circleAngle = Math.abs (angle % (Math.PI * 2.0));
        realIncrement = increment * speed * direction;
        //System.out.println(circleAngle);

        if(circleAngle == (period)) {
           //System.out.println("Equal");
            return still;
        }
        /*
        // one before
        if(circleAngle < period && circleAngle + realIncrement > (period)) {
            difference = (period - circleAngle);
           //System.out.println("before: " + difference + " c: " + direction + " s: " + still + " a: " + angle);
            if(direction > 0) return still - difference;
            return still + difference;
        }
        /*
        // one after
        if(circleAngle > period && circleAngle - realIncrement < (period)) {
            difference = (circleAngle - period);
           //System.out.println("after: " + difference + " c: " + direction + " s: " + still + " a: " + angle);
            if(direction > 0) return still - difference;
            return still + difference;
        } /**/
        if(circleAngle > (period)) return still;

        else return 0;
    }

    public String getName() {
        return "ChuuChuu";
    }

    public Speed copy() {
        Speed copy = new ChuuChuuSpeed();
        copy.setLowerSpeed(lowerSpeed);
        copy.setUpperSpeed(upperSpeed);
        return copy;
    }
}
