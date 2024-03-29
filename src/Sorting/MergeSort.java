package Sorting;

public class MergeSort {
    static int[] mergeSort(int[] A) {
        if (A.length == 1)
            return A;

        int[] arr1 = new int[A.length / 2];
        int[] arr2 = new int[A.length - arr1.length];

        for (int i = 0; i < A.length; i++) {
            if (i < arr1.length)
                arr1[i] = A[i];
            else {
                arr2[i - arr1.length] = A[i];
            }
        }

        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);

        return merge(arr1, arr2);
    }

    static int[] merge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] > B[j]) {
                C[k] = B[j];
                j++;
                k++;
            } else {
                C[k] = A[i];
                i++;
                k++;
            }
        }

        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < B.length) {
            C[k] = B[j];
            j++;
            k++;
        }

        return C;
    }
}
