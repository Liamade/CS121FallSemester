package weekFive;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(System.in);
        //ask for number of array elements
        System.out.printf("Enter number of array elements: ");
        final int arrayElements = Integer.parseInt(input.nextLine());
        //setup arrays
        int [] array = new int[arrayElements];
        int [] arrayCopy = new int[arrayElements];
        int [] arraySquared = new int[arrayElements];
        int [] arrayReverse = new int[arrayElements];

        //ask for array element
        for (int x = 0; x < arrayElements; x++){
            System.out.printf("Enter array elements %d: ",x);
            array[x] = Integer.parseInt(input.nextLine());
            arrayCopy[x] = array[x];
            arraySquared[x] = (array[x]) * (array[x]);
            arrayReverse[((arrayElements - 1)-x)] = array[x];
        }

        //array original print
        System.out.println("Array - Original");
        for (int x = 0; x < arrayElements; x++){
            System.out.printf("%d ",array[x]);
        }
        System.out.println(" ");

        //array copy print
        System.out.println("Array - Copy");
        for (int x = 0; x < arrayElements; x++){
            System.out.printf("%d ",arrayCopy[x]);
        }
        System.out.println(" ");

        //array Squared print
        System.out.println("Array - Squared");
        for (int x = 0; x < arrayElements; x++){
            System.out.printf("%d ",arraySquared[x]);
        }
        System.out.println(" ");

        //array Reverse print
        System.out.println("Array - Reversed");
        for (int x = 0; x < arrayElements; x++){
            System.out.printf("%d ",arrayReverse[x]);
        }

    }
}
