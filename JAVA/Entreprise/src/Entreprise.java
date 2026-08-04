import java.util.ArrayList;

public class Entreprise {

    private ArrayList<Employe> employes;

    public Entreprise() {
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        if (e != null) {
            this.employes.add(e);
        }
    }

    public void supprimerEmploye(int numero) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getNumero() == numero) {
                employes.remove(i);
                break;
            }
        }
    }

    public double salaireMoyen() {
        if (employes.isEmpty()) {
            return 0.0;
        }

        double sommeSalaires = 0.0;
        for (int i = 0; i < employes.size(); i++) {
            sommeSalaires += employes.get(i).getSalaire();
        }

        return sommeSalaires / employes.size();
    }
}