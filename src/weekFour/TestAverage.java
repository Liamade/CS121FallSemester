package weekFour;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(System.in);
        //variables
        int numStudents, numTests;
        double testScore, totalScore = 0, averageScore=0;

        //ask how many students and tests
        System.out.println("How many students are there?");
        numStudents = input.nextInt();
        System.out.println("How many tests are there?");
        numTests = input.nextInt();

        //loop
        for (double x=1.0 ; x<=numStudents ; x++){
            System.out.println("Student number: "+x);
            System.out.println("------------------");

            //test scores
            for (int y=1 ; y<=numTests; y++){
                System.out.println("Enter Score: "+y);
                testScore = input.nextInt();
                totalScore+=testScore;
            }
            //average
            averageScore = (totalScore)/(numTests);
            System.out.printf("Average Score:  %.2f \n",averageScore);
            totalScore = 0;
            averageScore = 0;

        }
    }
}
