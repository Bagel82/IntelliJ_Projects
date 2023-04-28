public class ArrayDemo3 {
    public static void main(String[] args) {
        String[][] ls = { {"a", "s", "t"},
                {"n", "m", "i"} };
        for (String[] row : ls) {
            for (String col : row) {
                System.out.printf("%s ", col);
            }
            System.out.println();
        }
    }
}