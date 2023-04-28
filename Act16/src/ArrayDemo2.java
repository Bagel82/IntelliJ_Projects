public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] array2 = new int[4][3];
        array2[0][0] = 566;
        array2[0][1] = 34;
        array2[0][2] = 34;
        array2[1][0] = 55;
        array2[1][1] = 243;
        array2[1][2] = 24356;
        array2[2][0] = 56786;
        array2[2][1] = 42;
        array2[2][2] = 5665;
        array2[3][0] = 5787;
        array2[3][1] = 6475;
        array2[3][2] = 346;
        for (int row = 0; row < array2.length; row++) {
            for (int col = 0; col < array2[row].length; col++) {
                System.out.printf("%d ", array2[row][col]);
            }
            System.out.println();
        }
    }
}