package Project01;

import java.util.Random;
import java.util.Scanner;


public class characterBattle {
    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(System.in);
        //setup random
        Random rand = new Random();
        //variables
        int hitChance, equalSpeed;
        boolean condition = true;
        int numRounds = 0;
        int attributePoints = 40;
        //player 1 variables
        String nameOne, moveNameOne = "stuff";
        int movePowerOne = 0, attackSpeedOne = 0, hitPointsOne = 0, armorOne = 0, winsOne = 0;

        //player 2 variables
        String nameTwo, moveNameTwo = "stuff";
        int movePowerTwo = 0, attackSpeedTwo = 0, hitPointsTwo = 0, armorTwo = 0, winsTwo = 0;

        //introduction
        System.out.printf("Welcome to the great battle arena! \n");
        //ask user for number of rounds
        while (condition = true) {
            System.out.printf("pick an odd number of rounds: ");
            numRounds = Integer.parseInt(input.nextLine());
            //odd number check
            if (numRounds % 2 == 0) {
                System.out.println("not an odd number pick again");
            } else {
                break;
            }
        }
        //Player names
        System.out.printf("Enter in player 1's name: ");
        nameOne = input.nextLine();
        System.out.printf("Enter in player 2's name: ");
        nameTwo = input.nextLine();

        //ROUNDS
        for (int x = 1; x <= numRounds; x++) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("------------------Round %d------------------ \n", x);
            System.out.println(" ");
            //ask stats of player one
            System.out.printf("Enter in %s's special move name: ", nameOne);
            moveNameOne = input.nextLine();
            System.out.println(" ");
            while (condition = true) {
                System.out.printf("Attribute points: %d \n", attributePoints);
                System.out.printf("%s's attack speed: ", nameOne);
                attackSpeedOne = Integer.parseInt(input.nextLine());
                attributePoints -= attackSpeedOne;
                System.out.println(" ");

                System.out.printf("Attribute points: %d \n", attributePoints);
                System.out.printf("%s's attack power: ", nameOne);
                movePowerOne = Integer.parseInt(input.nextLine());
                attributePoints -= movePowerOne;
                System.out.println(" ");

                System.out.printf("Attribute points: %d \n", attributePoints);
                System.out.printf("%s's hit points: ", nameOne);
                hitPointsOne = Integer.parseInt(input.nextLine());
                attributePoints -= hitPointsOne;
                hitPointsOne = (hitPointsOne * 2);
                System.out.println(" ");

                System.out.printf("Attribute points: %d \n", attributePoints);
                System.out.printf("%s's armor points: ", nameOne);
                armorOne = Integer.parseInt(input.nextLine());
                attributePoints -= armorOne;
                System.out.println(" ");

                //check attribute distribution
                if (attributePoints == 0) {
                    attributePoints = 40;
                    break;
                } else {
                    attributePoints = 40;
                    System.out.println("Invalid Points Distribution Please Try Again");
                    System.out.println(" ");
                }
            }
            //ask stats of player two
            System.out.printf("Enter in %s's special move name: ", nameTwo);
            moveNameTwo = input.nextLine();
            System.out.println(" ");
            while (condition = true) {
                System.out.printf("Attribute points: %d \n", attributePoints);
                System.out.printf("%s's attack speed: ", nameTwo);
                attackSpeedTwo = Integer.parseInt(input.nextLine());
                attributePoints -= attackSpeedTwo;
                System.out.println(" ");

                System.out.printf("Attribute points: %d \n", attributePoints);
                System.out.printf("%s's attack power: ", nameTwo);
                movePowerTwo = Integer.parseInt(input.nextLine());
                attributePoints -= movePowerTwo;
                System.out.println(" ");

                System.out.printf("Attribute points: %d \n", attributePoints);
                System.out.printf("%s's hit points: ", nameTwo);
                hitPointsTwo = Integer.parseInt(input.nextLine());
                attributePoints -= hitPointsTwo;
                hitPointsTwo = (hitPointsTwo * 2);
                System.out.println(" ");

                System.out.printf("Attribute points: %d \n", attributePoints);
                System.out.printf("%s's armor points: ", nameTwo);
                armorTwo = Integer.parseInt(input.nextLine());
                attributePoints -= armorTwo;
                System.out.println(" ");

                //check attribute distribution
                if (attributePoints == 0) {
                    attributePoints = 40;
                    break;
                } else {
                    attributePoints = 40;
                    System.out.println("Invalid Points Distribution Please Try Again");
                }
            }
            //fighting round
            while (condition = true) {
                if (attackSpeedOne > attackSpeedTwo) {
                    System.out.println("-------------------------");
                    System.out.printf("%s is faster and attacks \n", nameOne);
                    System.out.println("-------------------------");
                    System.out.println(" ");
                    //hit chance generator
                    hitChance = rand.nextInt(101);
                    //player 1 attacks
                    if ((armorTwo * 2) < hitChance) {
                        System.out.println("-------------------------");
                        System.out.printf("%s attacks %s with %s for %d hit points \n", nameOne, nameTwo, moveNameOne, movePowerOne);
                        System.out.println("-------------------------");
                        hitPointsTwo -= movePowerOne;
                        System.out.println("-------------------------");
                        System.out.printf("%s hit points: %d \n", nameTwo, hitPointsTwo);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                    } else {
                        System.out.println("-------------------------");
                        System.out.printf("%s misses his attack \n", nameOne);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                    }
                    //check hp
                    if (hitPointsTwo <= 0) {
                        System.out.printf("------------%s wins!------------ \n", nameOne);
                        winsOne += 1;
                        break;
                    }
                    System.out.println(" ");
                    //hit chance generator
                    hitChance = rand.nextInt(101);
                    //player 2 attacks
                    if ((armorOne * 2) < hitChance) {
                        System.out.println("-------------------------");
                        System.out.printf("%s attacks %s with %s for %d hit points \n", nameTwo, nameOne, moveNameTwo, movePowerTwo);
                        System.out.println("-------------------------");
                        hitPointsOne -= movePowerTwo;
                        System.out.println("-------------------------");
                        System.out.printf("%s hit points: %d \n", nameOne, hitPointsOne);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                    } else {
                        System.out.println("-------------------------");
                        System.out.printf("%s misses his attack \n", nameTwo);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                    }
                    //check hp
                    if (hitPointsOne <= 0) {
                        System.out.printf("------------%s wins!------------ \n", nameTwo);
                        winsTwo += 1;
                        break;
                    }
                }
                if (attackSpeedOne < attackSpeedTwo) {
                    System.out.println("-------------------------");
                    System.out.printf("%s is faster and attacks \n", nameTwo);
                    System.out.println("-------------------------");
                    System.out.println(" ");
                    //chance generator
                    hitChance = rand.nextInt(101);
                    //player 2 attacks
                    if ((armorOne * 2) < hitChance) {
                        System.out.println("-------------------------");
                        System.out.printf("%s attacks %s with %s for %d hit points \n", nameTwo, nameOne, moveNameTwo, movePowerTwo);
                        System.out.println("-------------------------");
                        hitPointsOne -= movePowerTwo;
                        System.out.println("-------------------------");
                        System.out.printf("%s hit points: %d \n", nameOne, hitPointsOne);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                    } else {
                        System.out.println("-------------------------");
                        System.out.printf("%s misses his attack \n", nameTwo);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                    }
                    //check hp
                    if (hitPointsOne <= 0) {
                        System.out.printf("------------%s wins!------------ \n", nameTwo);
                        winsTwo += 1;
                        break;
                    }
                    System.out.println(" ");
                    //hit chance generator
                    hitChance = rand.nextInt(101);
                    //player 1 attacks
                    if ((armorTwo * 2) < hitChance) {
                        System.out.println("-------------------------");
                        System.out.printf("%s attacks %s with %s for %d hit points \n", nameOne, nameTwo, moveNameOne, movePowerOne);
                        System.out.println("-------------------------");
                        hitPointsTwo -= movePowerOne;
                        System.out.println("-------------------------");
                        System.out.printf("%s hit points: %d \n", nameTwo, hitPointsTwo);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                    } else {
                        System.out.println("-------------------------");
                        System.out.printf("%s misses his attack \n", nameOne);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                    }
                    //check hp
                    if (hitPointsTwo <= 0) {
                        System.out.printf("------------%s wins!------------ \n", nameOne);
                        winsOne += 1;
                        break;
                    }
                    System.out.println(" ");


                } else {
                    equalSpeed = rand.nextInt(2);
                    //player 2 attacks
                    if (equalSpeed == 0) {
                        System.out.println("-------------------------");
                        System.out.printf("%s is faster and attacks \n", nameTwo);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                        //chance generator
                        hitChance = rand.nextInt(101);
                        //player 2 attacks
                        if ((armorOne * 2) < hitChance) {
                            System.out.println("-------------------------");
                            System.out.printf("%s attacks %s with %s for %d hit points \n", nameTwo, nameOne, moveNameTwo, movePowerTwo);
                            System.out.println("-------------------------");
                            hitPointsOne -= movePowerTwo;
                            System.out.println("-------------------------");
                            System.out.printf("%s hit points: %d \n", nameOne, hitPointsOne);
                            System.out.println("-------------------------");
                            System.out.println(" ");
                        } else {
                            System.out.println("-------------------------");
                            System.out.printf("%s misses his attack \n", nameTwo);
                            System.out.println("-------------------------");
                            System.out.println(" ");
                        }
                        //check hp
                        if (hitPointsOne <= 0) {
                            System.out.printf("------------%s wins!------------ \n", nameTwo);
                            winsTwo += 1;
                            break;
                        }
                        //hit chance generator
                        hitChance = rand.nextInt(101);
                        //player 1 attacks
                        if ((armorTwo * 2) < hitChance) {
                            System.out.println("-------------------------");
                            System.out.printf("%s attacks %s with %s for %d hit points \n", nameOne, nameTwo, moveNameOne, movePowerOne);
                            System.out.println("-------------------------");
                            hitPointsTwo -= movePowerOne;
                            System.out.println("-------------------------");
                            System.out.printf("%s hit points: %d \n", nameTwo, hitPointsTwo);
                            System.out.println("-------------------------");
                            System.out.println(" ");
                        } else {
                            System.out.println("-------------------------");
                            System.out.printf("%s misses his attack \n", nameOne);
                            System.out.println("-------------------------");
                            System.out.println(" ");
                        }
                        //check hp
                        if (hitPointsTwo <= 0) {
                            System.out.printf("------------%s wins!------------ \n", nameOne);
                            winsOne += 1;
                            break;
                        }
                    }
                    else{
                        System.out.println("-------------------------");
                        System.out.printf("%s is faster and attacks \n", nameOne);
                        System.out.println("-------------------------");
                        System.out.println(" ");
                        //hit chance generator
                        hitChance = rand.nextInt(101);
                        //player 1 attacks
                        if ((armorTwo * 2) < hitChance) {
                            System.out.println("-------------------------");
                            System.out.printf("%s attacks %s with %s for %d hit points \n", nameOne, nameTwo, moveNameOne, movePowerOne);
                            System.out.println("-------------------------");
                            hitPointsTwo -= movePowerOne;
                            System.out.println("-------------------------");
                            System.out.printf("%s hit points: %d \n", nameTwo, hitPointsTwo);
                            System.out.println("-------------------------");
                            System.out.println(" ");
                        } else {
                            System.out.println("-------------------------");
                            System.out.printf("%s misses his attack \n", nameOne);
                            System.out.println("-------------------------");
                            System.out.println(" ");
                        }
                        //check hp
                        if (hitPointsTwo <= 0) {
                            System.out.printf("------------%s wins!------------ \n", nameOne);
                            winsOne += 1;
                            break;
                        }
                        //hit chance generator
                        hitChance = rand.nextInt(101);
                        //player 2 attacks
                        if ((armorOne * 2) < hitChance) {
                            System.out.println("-------------------------");
                            System.out.printf("%s attacks %s with %s for %d hit points \n", nameTwo, nameOne, moveNameTwo, movePowerTwo);
                            System.out.println("-------------------------");
                            hitPointsOne -= movePowerTwo;
                            System.out.println("-------------------------");
                            System.out.printf("%s hit points: %d \n", nameOne, hitPointsOne);
                            System.out.println("-------------------------");
                            System.out.println(" ");
                        } else {
                            System.out.println("-------------------------");
                            System.out.printf("%s misses his attack \n", nameTwo);
                            System.out.println("-------------------------");
                            System.out.println(" ");
                        }
                        //check hp
                        if (hitPointsOne <= 0) {
                            System.out.printf("------------%s wins!------------ \n", nameTwo);
                            winsTwo += 1;
                            break;
                        }

                    }

                }


            }


        }
        if (winsTwo > winsOne) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("-------------------------");
            System.out.printf("%s wins!! \n",nameTwo);
            System.out.println("-------------------------");

        }
        else {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("-------------------------");
            System.out.printf("%s wins!! \n",nameOne);
            System.out.println("-------------------------");


        }
    }
}