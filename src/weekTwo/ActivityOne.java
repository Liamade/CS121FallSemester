package weekTwo;

import java.util.Scanner;


//Scanner
public class ActivityOne {
    //main + tab
    public static void main(String[] args) {
        //Declaring variables
        double P,r,A;
        int n,t;
        //P-principal
        //r- annual interest rate
        //n- # of years interest is compounded
        //t- specified number of years
        //A- is the amount of money in account after compounded

        //User Input
        System.out.println("Enter in the original principal amount: ");

        //Make Scanner object ; Declaring an object ; creating an instance of scanner class ; input
        Scanner input = new Scanner(System.in);
        //takes the input and puts it into the P variable
        P = Double.parseDouble(input.nextLine());

        System.out.println("Enter in the annual interest rate: ");
        r = Double.parseDouble(input.nextLine())/100;

        System.out.println("Enter in the number of times compounded: ");
        n = Integer.parseInt(input.nextLine());

        System.out.println("Enter in the years: ");
        t = Integer.parseInt(input.nextLine());

        // A = P(1+r/n)^nt
        A = P * Math.pow((1+(r/n)),(n*t));

        // %s - string
        // %f - floats
        // %d - integers
        // %c - characters
        System.out.printf("After %d years you have: $ %.2f",t,A);







    }
}
