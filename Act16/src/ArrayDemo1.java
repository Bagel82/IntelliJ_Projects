public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][] a1 = { {533, 5432, 24354}, {76, 7346, 807}, {234, 423, 2}, {234, 6446, 1212} };
        for (int[] row : a1) {
            for (int col : row) {
                System.out.printf("%d ", col);
            }
            System.out.println();
        }
    }
}