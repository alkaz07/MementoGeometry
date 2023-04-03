package geometry;

public class Point extends Object {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceTo(Point t) {
        return Math.sqrt((this.x - t.x) * (this.x - t.x) + (this.y - t.y) * (this.y - t.y));
    }


}
