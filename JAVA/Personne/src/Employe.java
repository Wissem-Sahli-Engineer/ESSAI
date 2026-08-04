public class Employe extends Personne {

    public static final String SOCIETE = "eSSAI";
    private float salaire;
    private int numero;
    private static int nombre = 0;

    public Employe(Personne p, float salaire, int numero) {
        super(p);
        setSalaire(salaire);
        setNumero(numero);
        nombre++;
    }
    public Employe() {
        this(new Personne(), 0, 0);
    }

    public Employe(float salaire, int numero) {
        this(new Personne(), salaire, numero);
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public void setNumero(int n) {
        this.numero=n;
    }

    public float getSalaire() {
        return salaire;
    }

    public int getNumero() {
        return numero;
    }

    public static int getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"et Employe à [SOCIETE=" + SOCIETE +", salaire=" + salaire +", numero=" + numero + "]";
    }
}