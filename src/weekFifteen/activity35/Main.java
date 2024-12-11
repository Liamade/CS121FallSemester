package weekFifteen.activity35;

public class Main {
    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7, 13, 20, 54, 27};

        System.out.println("Unsorted array:");
        printArray(array);

        mergeSort(array);

        System.out.println("\nSorted array:");
        printArray(array);

    }
    // Main function to sort an array using merge sort
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return; // Base case: if array has 1 or 0 elements, it's already sorted
        }

        // Step 1: Divide the array into two halves
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Step 2: Copy data into left and right subarrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Step 3: Recursively sort each half
        mergeSort(left);
        mergeSort(right);

        // Step 4: Merge the two halves
        merge(array, left, right);
    }

    // Function to merge two sorted subarrays into one sorted array
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the arrays while both left and right arrays have elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of left subarray (if any)
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right subarray (if any)
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    // Utility method to print an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}