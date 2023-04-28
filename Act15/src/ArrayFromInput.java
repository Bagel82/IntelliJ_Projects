import javax.swing.JOptionPane;

public class ArrayFromInput {
    public static void main(String[] args){
        String[] names = {"", "", ""};
        int[] numbers = {0, 0, 0};
        double[] ds = {0, 0, 0};

        names[0] = JOptionPane.showInputDialog("First name.");
        names[1] = JOptionPane.showInputDialog("Second name.");
        names[2] = JOptionPane.showInputDialog("Third name.");

        numbers[0] = Integer.parseInt(JOptionPane.showInputDialog("First number."));
        numbers[1] = Integer.parseInt(JOptionPane.showInputDialog("Second number."));
        numbers[2] = Integer.parseInt(JOptionPane.showInputDialog("Third number."));

        ds[0] = Integer.parseInt(JOptionPane.showInputDialog("First double."));
        ds[1] = Integer.parseInt(JOptionPane.showInputDialog("Second double."));
        ds[2] = Integer.parseInt(JOptionPane.showInputDialog("Third double."));

        System.out.println("First name:");
        System.out.println(names[0]);
        System.out.println("Second name:");
        System.out.println(names[1]);
        System.out.println("Third name:");
        System.out.println(names[2]);
        System.out.println("First number:");
        System.out.println(numbers[0]);
        System.out.println("Second number:");
        System.out.println(numbers[1]);
        System.out.println("Third number:");
        System.out.println(numbers[2]);
        System.out.println("First double:");
        System.out.println(ds[0]);
        System.out.println("Second double:");
        System.out.println(ds[1]);
        System.out.println("Third double:");
        System.out.println(ds[2]);
    }
}
