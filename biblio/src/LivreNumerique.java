public class LivreNumerique extends Livre {
    private String format;
    private double tailleMo;

    public LivreNumerique(String titre, String auteur, int annee, String format, double tailleMo) {
        super(titre, auteur, annee);
        this.format = format;
        this.tailleMo = tailleMo;
    }

    @Override
    public String toString() {
        return super.toString() + " [Format: " + format + ", Taille: " + tailleMo + " Mo]";
    }
}