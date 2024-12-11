package weekFour;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        //variables
        System.out.println("gimme your speed");
        double speed = input.nextDouble();
        System.out.println("gimme your time");
        int time = input.nextInt();
        System.out.println("Hour Spent          Distance Traveled");
        System.out.println("--------------------------------------");
        //for loop
        for (int x = 0; x<=time; x++){
            System.out.println(x);
            double distance = speed * x;
            System.out.printf("                           %.2f \n",distance);

        }

    }
}
