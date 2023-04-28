import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
public class studentSet {
    Set<String> student = new HashSet<String>();
    Scanner ask = new Scanner(System.in);
    public void addStudents()
    {
        boolean t = true;
        while (t == true)
        {
            System.out.println("Enter student names, or enter q to stop");
            String name = ask.nextLine();
            if (name.equals("q"))
            {
                t = false;
            }
            else
            {
                student.add(name);
            }
        }
    }
    public void displayStudents()
    {
        Iterator<String> iterator = student.iterator();
        while (iterator.hasNext())
        {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}