package weekTwo;
import javax.swing.*;


public class DialogBoxRectangleArea {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Whats the length?"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Whats the width?"));
        double area = width * length;
        String message = String.format("your rectangle area is %s", area);
        JOptionPane.showMessageDialog(null, message);

    }
}