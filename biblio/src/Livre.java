public class Livre {
    protected String titre;
    protected String auteur;
    protected int annee;
    protected boolean disponible = true;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public Livre(Livre autre) {
        this.titre = autre.titre;
        this.auteur = autre.auteur;
        this.annee = autre.annee;
        this.disponible = autre.disponible;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Livre livre = (Livre) that;
        return annee == livre.annee && titre.equals(livre.titre) && auteur.equals(livre.auteur);
    }

    @Override
    public String toString() {
        return titre + ", " + auteur + " en " + annee + ": " + (disponible ? "disponible" : "emprunté");
    }
}