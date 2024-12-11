package weekSix;
import java.util.Scanner;

public class Rectangle {
    //static -  indicates a variable, method,  or a class member
    //setup scanner that is static
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        //declare variables
        double length,width,area;

        //calling methods
        length = getLength();
        width = getWidthh();
        area = getArea(length, width);
        displayData(length, width, area);
        input.close();



    }
    public static double getLength(){
        System.out.printf("Enter in Length: ");
        double length = Double.parseDouble(input.nextLine());
        return length;                              //returns length
    }
    public static double getWidthh(){
        System.out.printf("Enter in Width: ");
        double width = Double.parseDouble(input.nextLine());
        return width;                              //returns length
    }
    public static double getArea(double length, double width){
        double area = length * width;
        return area;                              //returns length
    }
    public static void displayData(double length, double width, double area){
        System.out.printf("Rectangle Length: %.2f \n",length);
        System.out.printf("Rectangle Width: %.2f \n",width);
        System.out.printf("Rectangle Area: %.2f \n",area);

    }
}
