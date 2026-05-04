public class Chaine {
    /**
     *
     * @param s
     * @return
     */

    public static char[] toTableau(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return result;
    }

    /**
     *
     * @param strings
     * @return
     */

    public static char[][] toTableau(String... strings) {

        char[][] m = new char[strings.length][];

        for (int i = 0; i < strings.length; i++) {

            System.out.print("mot " + i + " : ");
            m[i] = toTableau(strings[i]);
        }

        return m;
    }
}