package weekThree;
import java.util.Scanner;

public class RestuarantSelector {
    public static void main(String[] args) {
        //set up scanner
        Scanner scanner = new Scanner(System.in);
        //declare variables
        String vegetarian, vegan, glutenF;

        //asks person question
        //stores yes and no answers in respective variables
        System.out.println("Is there anyone who's a vegetarian?");
        vegetarian = scanner.nextLine();
        System.out.println("Is there anyone who's a vegan?");
        vegan = scanner.nextLine();
        System.out.println("Is there anyone who's gluten free?");
        glutenF = scanner.nextLine();

        //asks if result is yes or no
        //.equals for strings
        if(vegetarian.equals("no") && vegan.equals("no") && glutenF.equals("no")){
            System.out.println("Joe's Gourmet burger");
        }
        if(vegetarian.equals("yes") && vegan.equals("no") && glutenF.equals("yes")){
            System.out.println("Main Street Pizza Company, Corner Cafe, or The Chef's Kitchen");
        }
        if(vegetarian.equals("yes") && vegan.equals("yes") && glutenF.equals("yes")) {
            System.out.println("Corner Cafe or The Chef's Kitchen");
        }
        if(vegetarian.equals("yes") && vegan.equals("no") && glutenF.equals("no")) {
            System.out.println("Mamma's Fine Italian, Corner Cafe, The Chef's Kitchen or Main Street Pizza Company");
        }
        else {
            System.out.println("how'd you mess this up?");
        }

    }
}
