import java.util.ArrayList;
public class Entreprise {
    public ArrayList<Employe> Entrep;
    public Entreprise() {
        this.Entrep=new ArrayList<Employe>();
    }
    public void setEmploye(Employe e) {
        if(e==null) System.out.println("Le table ne peut pas contenir des valeur null");
        else this.Entrep.add(e);
    }
    public void suppression(int n) {
        for (int i=0;i<this.Entrep.size();i++) {
            if(this.Entrep.get(i).getNumero()==n) {
                this.Entrep.remove(i);
                for (int j = i;j<this.Entrep.size()-1;j++) {
                    this.Entrep.set(j,this.Entrep.get(j+1));
                }
            }
        }
    }
    public int nbr(String nom) {
        int nbr =0;
        for(int i=0;i<this.Entrep.size();i++) {
            if(this.Entrep.get(i).getNom().equals(nom)) nbr++;
        }
        return nbr;
    }
    public float moySalaire() {
        float moy=0;
        for(int i=0;i<this.Entrep.size();i++) {
            moy+=this.Entrep.get(i).getSalaire();
        }
        return (moy/this.Entrep.size());

    }
}