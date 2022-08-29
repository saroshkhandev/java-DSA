package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void conquer(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1;

        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            merged[x++] = arr[idx2++];
        }

        for(int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2; //(start + end) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        System.out.println("MergeSort Algorithm");
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        divide(arr, 0, n - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Time Complexities: ");
        System.out.println("Best Case: O(n*log n)");
        System.out.println("Average Case: O(n*log n)");
        System.out.println("Worst Case: O(n*log n)");
    }
}
