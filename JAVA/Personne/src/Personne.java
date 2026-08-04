public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String genre;

    public Personne(String nom, String prenom, int age, String genre) {
        setNom(nom);
        setPrenom(prenom);
        setAge(age);
        setGenre(genre);
    }

    public Personne() {
        this("", "", 0, "");
    }

    public Personne(Personne p) {
        this(p.nom, p.prenom, p.age, p.genre);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("l'age doit etre compris entre 0 et 130 ");
        }
    }

    public void setGenre(String genre) {
        if (genre.equals("Masculin") || genre.equals("Feminin") || genre.equals("")) {
            this.genre = genre;
        } else {
            System.out.println("le genre doit etre Masculin ou Feminin");
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getGenre() {
        return genre;
    }
    public void sameLastName(Personne p) {
        if(this.nom.equals(p.nom)) {
            System.out.println("Ils ont le meme nom de famille");
        }
        else System.out.println("Ils n'ont pas le meme nom de famille");
    }
    public Personne oldest(Personne p) {
        if(this.age>p.age) {
            return(this);
        }
        else {
            return(p);
        }
    }
    public boolean estMajeure() {
        if(this.age>=18) {return (true);}
        else return (false);
    }

    @Override
    public String toString() {

        String g;
        if (this.genre.equals("Masculin")) {
            g = "un homme";
        } else {
            g = "une femme";
        }

        String m;
        if (this.age >= 18) {
            m = "majeur";
        } else {
            m = "mineur";
        }
        return "Je m'appelle " + nom + " " + prenom + "\n" +
                "je suis " + g + "\n" +
                "je suis " + m;
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (!(that instanceof Personne)) {
            return false;
        }
        Personne p = (Personne) that;
        return this.nom.equals(p.nom) &&
                this.prenom.equals(p.prenom) &&
                this.age == p.age &&
                this.genre.equals(p.genre);
    }

}