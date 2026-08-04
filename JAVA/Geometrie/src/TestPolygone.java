public class TestPolygone {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 0);
        Point2D b = new Point2D(0, 3);
        Point2D c = new Point2D(4, 0);

        Triangle t = new Triangle(a, b, c);

        System.out.println("Nom: " + t.nom());
        System.out.println("Points: " + t);
        System.out.println("Périmètre: " + t.perimetre());
        System.out.println("Est rectangle: " + t.estRectangle());
        System.out.println("Nombre total de polygones: " + Polygone.comptpoly);
    }
}