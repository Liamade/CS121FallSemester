package weekFour;

import java.util.Scanner;

public class GuessingGame {
    private static Boolean True;

    public static void main(String[] args) {
        //variables
        Boolean theLoop = false;
        Integer guesses = 5;
        Integer number = 63;

        //scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number 1 to 100 or enter 'q' to give up: ");
        //loop
        while  (!theLoop) {

            //introduction
            System.out.printf("Number of guesses: %d \n",guesses);
            System.out.println("Guess:");
            //input
            String guess = input.nextLine();

            //quit function
            if (guesses==1){
                System.out.println("you lost!");
                theLoop = true;
                break;
            }
            else if (guess.equals("q")) {
                System.out.println("Thank you for playing");
                theLoop = true;
                break;
            }

            else {
                int numberGuess = Integer.parseInt(guess);
                //too high
                if (numberGuess > number){
                    System.out.println("Guess too high");
                    guesses-=1;
                }

                //too low
                else if (numberGuess < number) {
                    System.out.println("Guess too low");
                    guesses -= 1;
                }

                //guess is correct
                else {
                    System.out.println("You're won!");
                    theLoop = true;
                    break;
                    }
        }
        }

    }
}
