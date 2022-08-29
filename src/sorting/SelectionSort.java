package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            int smallest = arr[i];
            int sIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < smallest) {
                    smallest = arr[j];
                    sIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[sIndex] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("SelectionSort Algorithm");
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));


        System.out.println("Time Complexities: ");
        System.out.println("Best Case: O(n2)");
        System.out.println("Average Case: O(n2)");
        System.out.println("Worst Case: O(n2)");
    }
}
