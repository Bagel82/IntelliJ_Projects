package classArrayList;
import javax.swing.JOptionPane;

public class CourseInfo {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("How many classes?"));
        String[][] classes = new String[4][n];
        for (int j = 0; j < n; j ++) {
            classes[0][j] = JOptionPane.showInputDialog("Name of class " + String.valueOf(j + 1));
            classes[1][j] = JOptionPane.showInputDialog("GPA of class " + String.valueOf(j + 1));
            classes[2][j] = JOptionPane.showInputDialog("Score of class " + String.valueOf(j + 1));
            classes[3][j] = JOptionPane.showInputDialog("Letter Grade of class " + String.valueOf(j + 1));
        }
        for (int row = 0; row < classes.length; row++) {
            for (int col = 0; col < classes[row].length; col++) {
                System.out.printf("%s ", classes[row][col]);
            }
            System.out.println();
        }
    }
}
