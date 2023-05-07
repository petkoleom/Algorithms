package Sorting;

import java.util.Arrays;

public class _Sorting {
    public static void main(String[] args) {
        int[] A = { 4, 3, 7, 6, 9, 8, 2, 1, 5, 0 };
        System.out.println(Arrays.toString(InsertionSort.insertionSort(A)));
        System.out.println(Arrays.toString(MergeSort.mergeSort(A)));
    }

}
