package weekSix;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        //declare arrays
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 1, 1}
        };
        double[][] array2 = {
                {1.1, 1.2, 1.3},
                {2.1, 2.2, 2.3},
                {3.1, 3.2, 3.3}
        };
        String[][] array3 = {
                {"bertha", "gertrude", "helga"},
                {"terry", "jerry", "barry"}
        };
        //print array1 using regular for loop
        System.out.println("Array 1");
        for (int x = 0; x <= 3; x++) {
            System.out.printf("%d  %d  %d \n", array1[x][0], array1[x][1], array1[x][2]);
        }
        //print array2 using enhanced for loop
        System.out.println("Array 2");
        for (double[] row : array2) {
            for (double column : row) {
                System.out.printf("%.2f  ", column);
            }
        }
        System.out.println(" ");
        System.out.println("Array 3");
        for (int x = 0; x <= 1; x++) {
            System.out.printf("%s  %s  %s \n", array3[x][0], array3[x][1], array3[x][2]);


        }

    }

}
