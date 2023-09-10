package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] ary = {7, 4, 6, 2, 1, 8, 9, 3};
        selectionSort(ary);
        System.out.println(Arrays.toString(ary));
    }
}
