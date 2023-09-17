package algorithms;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                combined[k] = arr1[i];
                i++;
                k++;
            } else {
                combined[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            combined[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            combined[k] = arr2[j];
            j++;
            k++;
        }
        return combined;
    }
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int midIndex = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));
        return merge(left, right);
    }
    public static void main(String[] args) {
        int[] ary = {9, 4, 6, 1, 8, 7};
        int[] sortedAry = mergeSort(ary);
        System.out.println(Arrays.toString(sortedAry));
    }
}
