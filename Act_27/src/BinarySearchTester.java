import java.util.Scanner;
import java.util.ArrayList;

public class BinarySearchTester
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(23);
        array.add(17);
        array.add(12);
        array.add(90);
        array.add(84);
        array.add(38);
        array.add(5);
        array.add(77);
        array.add(44);
        System.out.print("unsorted: ");
        for (int num : array)
            System.out.print(num + " ");
        System.out.println();
        // sort array
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        sortedArray = selectionSort(array);
        System.out.print("sorted:   ");
        for (int num : sortedArray)
            System.out.print(num + " ");
        System.out.println();

        //search for number
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.binarySearch(key, sortedArray);
        if (found == -1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d",
                    found, found +1);
        }
    }

    // SORED IN INCREASING ORDER
    //KEEP TRACK OF CURRENT MINIMUM
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedArray)
    {
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        for (int i = 0; i < sortedArray.size() - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < sortedArray.size(); j++)
            {
                if (sortedArray.get(j) < sortedArray.get(min))
                {
                    min = j;
                }
            }
            int temp = sortedArray.get(i);
            sortedArray.set(i, sortedArray.get(min));
            sortedArray.set(min, temp);
        }
        return sortedArray;
    }
}