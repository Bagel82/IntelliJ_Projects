public class Main {
    public static void main(String[] args) {
        Sorting S = new Sorting();
        int[] arr = S.getArray();
        int l = arr.length;
        System.out.println("The unsorted array is:");
        for (int i = 0; i < l; i ++)
        {
            System.out.println(arr[i]);
        }

        int[] sortArr = S.sortArray(arr, l);
        System.out.println("The sorted array is:");
        for (int i = 0; i < l; i ++)
        {
            System.out.println(sortArr[i]);
        }
    }
}