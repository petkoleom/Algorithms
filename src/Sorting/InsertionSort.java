package Sorting;

public class InsertionSort {
    static int[] insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int x = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > x) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = x;
        }

        return A;
    }
}
