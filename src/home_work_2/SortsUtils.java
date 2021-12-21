package home_work_2;

import java.util.Arrays;

public class SortsUtils {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 2, 8, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
        int[] arr3_1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr3_1));
        System.out.println(Arrays.toString(bubbleSort(arr3_1)));
        int[] arr3_2 = {1, 1, 1, 1};
        System.out.println(Arrays.toString(arr3_2));
        System.out.println(Arrays.toString(bubbleSort(arr3_2)));
        int[] arr3_3 = {9, 1, 5, 99, 9, 9};
        System.out.println(Arrays.toString(arr3_3));
        System.out.println(Arrays.toString(bubbleSort(arr3_3)));
        int[] arr3_4 = {};
        System.out.println(Arrays.toString(arr3_4));
        System.out.println(Arrays.toString(bubbleSort(arr3_4)));
    }
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] shakerSort(int[] array) {
        //здесь будет код
        return array;
    }
}
