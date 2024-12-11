package Project02;//IMPORT MODULES
import java.util.Scanner;
import java.util.Random;

public class    TestScores {
    public static void main(String[] args) {
        //initialize imports
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //constants
        final int SIZE = (rand.nextInt(8)+3);
        //variables
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        //ask for # test scores
        System.out.printf("%d TEST SCORES\n",SIZE);
        System.out.println("--------------------");
        for (int x = 1 ; x <= SIZE ; x++){
            System.out.printf("Test Score #%d: ",x);
            testScores[x-1] = Integer.parseInt(input.nextLine());
        }

        //close scanner
        input.close();

        //convert test scores to letter grade
        for (int x = 1; x <= SIZE ; x++){
            letterGrades[x-1] = getLetterGrade(testScores[x-1]);
        }

        //print test scores
        printGrades(testScores,letterGrades);

        //Print highest score
        System.out.println("Highest Score: " + getHighestScore(testScores));

        //print lowest Score
        System.out.println("Lowest Score: " + getLowestScore(testScores));

        //print average score
        System.out.printf("Average Score: %.2f",getAverageScore(testScores));


    }

    //TEST SCORE TO LETTER GRADE METHOD
    private static char getLetterGrade(int testScore){
        if (testScore >= 90){
            return 'A';
        }
        else if (testScore >= 80) {
            return 'B';
        }
        else if (testScore >= 70) {
            return 'C';
        }
        else if (testScore >= 60) {
            return 'D';
        }
        else{
            return 'F';
        }
    }

    //PRINT GRADES METHOD
    private static void printGrades(int[] testScore, char[] letterGrade){
        System.out.println(" ");
        System.out.println("SCORE     GRADE");
        System.out.println("----------------");
        for (int x = 1 ; x <= testScore.length ; x++){
            System.out.printf("| %d    |    %c  |\n",testScore[x-1],letterGrade[x-1]);
        }
        System.out.println("----------------");
    }

    //PRINT THE HIGHEST SCORE METHOD
    private static int getHighestScore(int[] testScore){
        int highestScore = 0;
        for (int x = 1 ; x <= testScore.length ; x++){
            if (testScore[x-1] > highestScore){
                highestScore = testScore[x-1];
            }
        }
        return highestScore;
    }

    //PRINT THE LOWEST SCORE METHOD
    private static int getLowestScore(int[] testScore){
        int lowestScore = 1000;
        for (int x = 1 ; x <= testScore.length ; x++){
            if (testScore[x-1] < lowestScore){
                lowestScore = testScore[x-1];
            }
        }
        return lowestScore;
    }

    //PRINT THE AVERAGE SCORE METHOD
    private static double getAverageScore(int[] testScore){
        double averageScore = 0;
        for (int x = 1 ; x <= testScore.length ; x++){
            averageScore += testScore[x-1];
            }
        return(averageScore/testScore.length);
        }


    }




