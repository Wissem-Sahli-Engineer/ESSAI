public class Polygone {
    protected Point2D[] sommets;
    public static int comptpoly = 0;

    public Polygone(Point2D[] sommets) {
        this.sommets = sommets;
        comptpoly++;
    }

    public String nom() { return "polygone"; }

    public double perimetre() {
        double p = 0;
        for (int i = 0; i < sommets.length; i++) {
            Point2D p1 = sommets[i];
            Point2D p2 = sommets[(i + 1) % sommets.length];
            p += p1.distance(p2);
        }
        return p;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Point2D s : sommets) sb.append(s.toString());
        return sb.append("]").toString();
    }

    @Override
    public boolean equals(Object that){
        if (this == that) return true;
        if ( that == null || !(that instanceof Polygone)) return false;
        Polygone p = (Polygone) that;
        if (sommets.length != p.sommets.length) return false;
        for ( int i =0;i < sommets.length;i++){
            if (!sommets[i].equals(p.sommets[i])) return false;
        }
        return true;
    }
}