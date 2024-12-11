package weekTwo;
import javax.swing.*;

public class DialogBoxTriangleArea {
    public static void main(String[] args) {
        double base, height, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Whats the width?"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Whats the length?"));
        area = base*height*.5;
        String message = String.format("your triangle area is %s", area);
        JOptionPane.showMessageDialog(null, message);
    }
}