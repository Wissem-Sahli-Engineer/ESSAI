import java.util.Scanner;

public class Crypto {
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        System.out.println("La chaine initiale etait : '" + s + "'");

        String aCoder = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                aCoder = aCoder + c;
            } else {
                for (int j = 0; j < ALPHABET.length(); j++) {
                    if (c == ALPHABET.charAt(j)) {
                        aCoder = aCoder + c;
                    }
                }
            }
        }

        if (aCoder.length() == 0) {
            System.out.println("La chaine a coder est vide.");
        } else {
            System.out.println("La chaine a coder est : '" + aCoder + "'");

            String chaineCodee = "";
            for (int i = 0; i < aCoder.length(); i++) {
                char c = aCoder.charAt(i);

                if (c == ' ') {
                    chaineCodee = chaineCodee + " ";
                } else {
                    int position = -1;
                    for (int j = 0; j < ALPHABET.length(); j++) {
                        if (c == ALPHABET.charAt(j)) {
                            position = j;
                        }
                    }

                    if (position != -1) {
                        int nouvellePos = (position + DECALAGE) % 26;
                        chaineCodee = chaineCodee + ALPHABET.charAt(nouvellePos);
                    }
                }
            }
            System.out.println("La chaine codee est : '" + chaineCodee + "'");
        }
    }
}