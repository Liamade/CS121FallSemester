package weekFour;

import java.util.Scanner;
import java.util.Random;


public class ESPGame {
    public static <Int> void main(String[] args) {
        //set up util
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        //variables
        int wonGames=0;
        String randomcolor="blue";


        //for loop
        for (int x=1; x<=10; x++){
            //random generator
            int randomINT = random.nextInt(5);
            //switch case
            switch (randomINT){
                case 0:
                    randomcolor="red";
                    break;
                case 1:
                    randomcolor="blue";
                    break;
                case 2:
                    randomcolor="green";
                    break;
                case 3:
                    randomcolor="purple";
                    break;
                case 4:
                    randomcolor="pink";
                    break;
            }
            System.out.println(x + ".) pick a color if you dare: ");
            String usrColor = input.nextLine();
            //check if right
            if (usrColor.equals(randomcolor)){
                System.out.println("you got it right!!!!");
                wonGames+=1;
            }
            else{
                System.out.println("you got it wrong nooooo");
                System.out.printf("the correct color was %s \n",randomcolor);
            }
        }
        System.out.printf("you got %d out of 10 right",wonGames);
    }
}
