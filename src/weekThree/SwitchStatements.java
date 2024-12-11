package weekThree;
import java.util.Scanner;


public class SwitchStatements {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //ask user for a planet
        System.out.println("Type in a planet in our solar system: ");
        String planet = input.nextLine();

        //switch statement
        switch (planet) {
            case "mercury":
                System.out.println("Radius: 1,516 miles");
                System.out.println("Distance from sun: 57,900,000 km");
                break;

            case "venus":
                System.out.println("Radius: 3,760 miles");
                System.out.println("Distance from sun: 108,200,000 km");
                break;

            case "earth":
                System.out.println("Radius: 3,959 miles");
                System.out.println("Distance from sun: 149,600,000 km");
                break;

            case "mars":
                System.out.println("Radius: 2,106 miles");
                System.out.println("Distance from sun: 227,900,000 km");
                break;

            case "jupiter":
                System.out.println("Radius: 43,441 miles");
                System.out.println("Distance from sun: 778,600,000 km");
                break;

            case "saturn":
                System.out.println("Radius: 36,184 miles");
                System.out.println("Distance from sun: 1,443,500,000 km");
                break;

            case"uranus":
                System.out.println("Radius: 15,759 miles");
                System.out.println("Distance from sun: 2,872,500,000 km");
                break;

            case "neptune":
                System.out.println("Radius: 15,299 miles");
                System.out.println("Distance from sun: 4,495,100,000 km");
                break;

            case "pluto":
                System.out.println("not a planet stupid");
                break;

            default:
                System.out.println("You had one job man");
                break;


        }


    }
}
