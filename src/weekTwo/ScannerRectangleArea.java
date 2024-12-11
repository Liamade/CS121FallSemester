package weekTwo;
import java.util.Scanner;

public class ScannerRectangleArea {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double length, width;

        System.out.println("Gimme the length:");
        length = Double.parseDouble(scr.nextLine());

        System.out.println("Gimme the width");
        width = Double.parseDouble(scr.nextLine());

        double area = (length * width);

        System.out.printf("The area is: "+ area);


    }


}
