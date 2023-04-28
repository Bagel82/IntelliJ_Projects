import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class totalCalories
{
    private final DateFormat totalCalories = new SimpleDateFormat("MM/dd/yyyy");
    public double calcCalories(double rate, String pickupDate, String returnDate) {
        int days = 0;
        try {
            Date date1 = totalCalories.parse(pickupDate);
            System.out.println("date1: " + date1);
            Date date2 = totalCalories.parse(returnDate);
            System.out.println("date2: " + date2);
            long difference = date2.getTime() - date1.getTime();
            System.out.println("difference: " + difference);
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
            System.out.println("difference converted to days: " + days);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return rate * days;
    }
}