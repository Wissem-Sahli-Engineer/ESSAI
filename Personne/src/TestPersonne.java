public class TestPersonne {
    public static void main(String[] args) {

        Personne p1 = new Personne();

        p1.setNom("Sahli");
        p1.setPrenom("Wissem");
        p1.setAge(50);
        p1.setGenre("Masculin");

        System.out.println(p1);

        Personne p2 = new Personne(p1);

        p2.setPrenom("mezinos");

        p2.setAge(24);

        System.out.println("Personne p2 :");
        System.out.println(p2);

        Personne p3 = new Personne("binga", "binga", 31, "Masculin");

        System.out.println("Personne p3:");
        System.out.println(p3);

        Employe e1= new Employe();
        Employe e2= new Employe(p1,1500.3f,4);
        Employe e3= new Employe(p2,1400.3f,6);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        Entreprise ent=new Entreprise();
        ent.setEmploye(e1);
        ent.setEmploye(e2);
        ent.setEmploye(e3);
        System.out.println(ent.nbr("sahli"));
        System.out.println(ent.moySalaire());



    }
}