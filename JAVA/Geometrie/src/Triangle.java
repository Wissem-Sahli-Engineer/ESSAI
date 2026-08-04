public class Triangle extends Polygone {
    public Triangle(Point2D a, Point2D b, Point2D c) {
        super(new Point2D[]{a, b, c});
    }

    @Override
    public String nom() { return "Triangle"; }

    public boolean estRectangle() {
        double d1 = sommets[0].distance(sommets[1]);
        double d2 = sommets[1].distance(sommets[2]);
        double d3 = sommets[2].distance(sommets[0]);
        double[] s = {d1*d1, d2*d2, d3*d3};
        java.util.Arrays.sort(s);
        return Math.abs(s[2] - (s[0] + s[1])) < 0.001;
    }
}