public class tableau {
    // int i = 0;

    public static void init(int[] t) {
        for (int i=0; i < t.length; i++) {
            t[i] = -1;
        }
    }

    public static void aff(int[] t) {
        for (int i =0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static boolean ajout(int[] t, int elem) {
        for (int i =0; i < t.length; i++) {
            if (t[i] == -1) {
                t[i] = elem;
                return true;
            }
        }
        return false;
    }

    public static int rechercher(int[] t, int elem) {
        for (int i =0; i < t.length; i++) {
            if (t[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    public static int maxtab(int[] t) {
        int max = -1;
        for (int i =0; i < t.length; i++) {
            if (t[i] != -1) {
                if (t[i] > max) {
                    max = t[i];
                }
            }
        }
        return max;
    }

    public static int mintab(int[] t) {
        int min = 999999999;
        for (int i =0; i < t.length; i++) {
            if (t[i] != -1) {
                if (t[i] < min) {
                    min = t[i];
                }
            }
        }
        return min;
    }

    public static double moytab(int[] t) {
        double somme = 0;
        double compteur = 0;

        for (int i =0; i < t.length; i++) {
            if (t[i] != -1) {
                somme = somme + t[i];
                compteur = compteur + 1;
            }
        }

        if (compteur == 0) {
            return 0;
        }
        return somme / compteur;
    }

    public static void main(String[] args) {
        int[] monTab = new int[7];

        init(monTab);
        aff(monTab);

        ajout(monTab, 69);
        aff(monTab);

        System.out.println(ajout(monTab, 459));
        aff(monTab);

        boolean testFull = ajout(monTab, 325);
        System.out.println(testFull);
        System.out.println("pos de 69 : " + rechercher(monTab, 69));
        System.out.println("pos de 96 : " + rechercher(monTab, 96));
        System.out.println("max : " + maxtab(monTab));
        System.out.println("min : " + mintab(monTab));
        System.out.println("moy : " + moytab(monTab));
    }
}