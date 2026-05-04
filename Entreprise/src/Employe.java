class Employe {
    private int numero;
    private String nom;
    private double salaire;

    /**
     * @param numero
     * @param nom
     * @param salaire
     */
    public Employe(int numero, String nom, double salaire) {
        this.numero = numero;
        this.nom = nom;
        this.salaire = salaire;
    }

    public int getNumero() { return numero; }

    public String getNom() { return nom; }

    public double getSalaire() { return salaire; }
}