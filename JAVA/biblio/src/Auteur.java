public class Auteur {
    private String nom;
    private String email;
    private char genre;
    private boolean prime;

    public Auteur(String nom, String email, char genre, boolean prime) {
        this.nom = nom;
        this.email = email;
        this.genre = genre;
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Auteur [nom=" + nom + ", email=" + email + ", genre=" + genre + ", " + (prime ? "primé" : "non primé") + "]";
    }
}