package weekTwo;

import java.util.Scanner;

public class ScannerRectanglePerimeter {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double length, width;

        System.out.println("Gimme the length");
        length = Double.parseDouble(scr.nextLine());

        System.out.println("Gimme the width");
        width = Double.parseDouble(scr.nextLine());

        double perimeter = ((2*length) + (2*width));

        System.out.printf("The perimeter is: "+ perimeter);


    }
}
