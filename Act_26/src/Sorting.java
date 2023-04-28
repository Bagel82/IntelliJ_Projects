import java.util.Scanner;
public class Sorting {
    public int[] getArray()
    {
        Scanner integers = new Scanner(System.in);
        int[] twentyFive = {0, 0, 0, 0, 0};
        System.out.println("Enter first integer.");
        twentyFive[0] = Integer.parseInt(integers.nextLine());
        System.out.println("Enter second integer.");
        twentyFive[1] = Integer.parseInt(integers.nextLine());
        System.out.println("Enter third integer.");
        twentyFive[2] = Integer.parseInt(integers.nextLine());
        System.out.println("Enter fourth integer.");
        twentyFive[3] = Integer.parseInt(integers.nextLine());
        System.out.println("Enter fifth integer.");
        twentyFive[4] = Integer.parseInt(integers.nextLine());

        return twentyFive;
    }

    public int[] sortArray(int[] arr, int n)
    {
        for (int i = 1; i < n; ++i) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
        return arr;
    }
}
