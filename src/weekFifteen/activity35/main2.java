package weekFifteen.activity35;

import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //array
        int[] studentGrades = new int[5];
        //ask the user for 5 grades
            //input those grades into studentGrades
        //mergeSort(studentGrades)
    }
    //mergeSort

    public static void MergeSort(int[] array){
        if(array.length <= 1){
            return;
        }
        //splitting the array into two
        int mid = (array.length/2);
        int[] arrayA = new int[mid];
        int[] arrayB = new int[array.length - mid];
        //copy the elements of initial array into arrayA & arrayB
        System.arraycopy(array, 0, arrayA, 0, mid);
        System.arraycopy(array, mid, arrayB, 0, array.length - mid);
        //recursively do merge method
        MergeSort(arrayA);
        MergeSort(arrayB);

        //merge method
        Merge(array, arrayA, arrayB);
    }


    //merge
    public static void Merge(int[] array, int[] arrayA, int[]arrayB){
        int i = 0, j = 0, k = 0;
        //merge arrayA and arrayB


    }
}
