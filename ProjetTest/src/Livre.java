public class Livre {
    public static final int EXEMPLAIRES = 3;
    private String titre;
    private Auteur[] auteur;
    private int anneePublication;
    private int nbExemplaires;
    private boolean disponible;

    public Livre(String titre, Auteur[] auteurs, int anneePublication) {
        setTitre(titre);
        setAuteurs(auteurs);
        setAnneePublication(anneePublication);
        this.nbExemplaires = EXEMPLAIRES;
        this.disponible = true;
    }

    /* Getters */

    public int getAnnePublication(){
        return anneePublication;
    }
    public String getTitre(){
        return titre;
    }
    public Auteur[] getAuteurs(){
        return auteurs;
    }
    public int getNbExemplaires(){
        return nbExemplaires;
    }
    public boolean isDisponible(){
        return disponible;
    }

    /* Setters */
    private void setTitre(String titre){
        this.titre = (titre == null) ? "" : titre;
    }
    private void setAnneePublication(int annee){
        this.anneePublication = (annee >= 0) ? annee : 0;
    }
    private void setAuteurs(Auterus auteurs){
        if (auteurs != null) {
            this.auteurs = auteurs;
        }
    }

    public void emprunter() {
        if (nbExemplaires > 0) {
            nbExemplaires--;
            if (nbExemplaires == 0) { disponible = false; }
        } else {
            System.out.println("aucun exemp dispo pour le livre.");
        }
    }

    public void retourner() {
        if (nbExemplaires < EXEMPLAIRES) {
            nbExemplaires++;
            disponible = true;
        } else {
            System.out.println("tous les exemp sont déjà dispos.");
        }
    }

}
