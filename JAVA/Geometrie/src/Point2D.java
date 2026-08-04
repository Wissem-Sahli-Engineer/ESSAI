public class Point2D {
    private double x;
    private double y;

    public Point2D() { this(0, 0); }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }
}