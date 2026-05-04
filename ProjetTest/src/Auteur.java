public class Auteur {
    private String nom;
    private String email;
    private char genre;
    private boolean prix;

    /**
     *
     * @param nom
     * @param email
     * @param genre
     * @param prix
     */

    public Auteur(String nom, String email, char genre, boolean prix) {
        setNom(nom);
        setEmail(email);
        setGenre(genre);
        setPrix(prix);
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email != null && !email.isEmpty()) {
            this.email = email;
        }
    }

    public char getGenre() {
        return genre;
    }
    public void setGenre(char genre) {
        if (genre == 'm' || genre == 'f') {
            this.genre = genre;
        }
    }

    // null + isempty

    public boolean getPrix() {
        return prix;
    }
    public void setPrix(boolean prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        String mentionPrix = prix ? "primé" : "non primé";

        return "Auteur {nom=" + nom + ", email=" + email + ", genre=" + genre + ", " + mentionPrix + "}";
    }
}