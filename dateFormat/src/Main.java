import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        totalCalories totalCalories = new totalCalories();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of calories per day:");
        double rate = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the start date as mm/dd/yyyy:");
        String pickupDate = scanner.nextLine();
        System.out.println("Enter the end date as mm/dd/yyyy:");
        String returnDate = scanner.nextLine();
        double fee = totalCalories.calcCalories(rate, pickupDate, returnDate);
        System.out.printf("Total calories = %.2f", fee);
    }
}