public class OopsBanner {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        String[] banner = new String[O.length];

        for (int i = 0; i < O.length; i++) {
            banner[i] = String.join("   ",
                    O[i],   // First O
                    O[i],   // Second O
                    P[i],
                    S[i]
            );
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for O
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method for P
    public static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Method for S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}