public class TestBiblio {
    public static void main(String[] args) {
        Auteur a1 = new Auteur("Camus", "camus@mail.com", 'm', true);
        Auteur a2 = new Auteur("Zola", "zola@mail.com", 'm', false);

        System.out.println(a1);
        System.out.println(a2);

        Livre l1 = new Livre("L'étranger", "Camus", 1942);
        Livre l2 = new Livre("Germinal", "Zola", 1885);
        Livre l3 = new Livre(l1);
        LivreNumerique l4 = new LivreNumerique("L'homme révolté", "Camus", 1951, "PDF", 1.5);

        System.out.println(l2);
        System.out.println(l4);
        System.out.println("l1 equals l3 = " + l1.equals(l3));
    }
}