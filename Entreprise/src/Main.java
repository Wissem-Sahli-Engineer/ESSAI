public class Main {
    public static void main(String[] args) {

        Entreprise monEntreprise = new Entreprise();

        Employe e1 = new Employe(101, "Alice", 2500);
        Employe e2 = new Employe(102, "Bob", 3000);
        Employe e3 = new Employe(103, "Alice", 2800);

        monEntreprise.ajouterEmploye(e1);
        monEntreprise.ajouterEmploye(e2);
        monEntreprise.ajouterEmploye(e3);
        monEntreprise.ajouterEmploye(null);


        double moyenne = monEntreprise.salaireMoyen();
        System.out.println("Salaire moyen initial : " + moyenne + " dinar");

        System.out.println("\nSuppression de l'employé numéro 102 (Bob)...");
        monEntreprise.supprimerEmploye(102);

        System.out.println("Nouveau salaire moyen : " + monEntreprise.salaireMoyen() + " dinar");
    }
}