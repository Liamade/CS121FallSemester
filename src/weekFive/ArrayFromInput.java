package weekFive;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(System.in);
        //setup variables
        String[] names = new String[4];
        int[] age = new int[4];
        int[] grade = new int[4];

        for (int x=0; x <= 3; x++){
            //fill in arrays
            System.out.println("Name: ");
            names[x] = input.nextLine();
            System.out.println("Age: ");
            age[x] = Integer.parseInt(input.nextLine());
            System.out.println("Grade: ");
            grade[x] = Integer.parseInt(input.nextLine());
        }
        //print header
        System.out.println("Name     Age     Grade");
        System.out.println("-----------------------");
        //print variables
        for (int x=0; x<=3; x++){
            System.out.println(names[x]+"     "+age[x]+"        "+grade[x]);

        }

    }
}
