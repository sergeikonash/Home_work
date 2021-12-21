package home_work_2;

import static home_work_2.ArraysUtils.*;

public class HW2_2_2 {
    public static void main(String[] args) {
//        int[] arr = arrayFromConsole();
        task2_2_3(arrayFromConsole());
        task2_2_2(arrayFromConsole());
        task2_2_1(arrayFromConsole());
    }

    public static void task2_2_1(int[] array) {
//do-while
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.println();
//while
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
//for
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
//for each
        i = 0;
        for (int j : array) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void task2_2_2(int[] array) {
//do-while
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
                i++;
            }
        } while (i < array.length);
        System.out.println();
//while
        i = 0;
        while (i < array.length) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
                i++;
            }
        }
        System.out.println();
//for
        for (i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
//for each
        i = 0;
        for (int j : array) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void task2_2_3(int[] array) {
//do-while
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();
//while
        i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();
//for
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
//for each
        i = array.length - 1;
        for (int j : array) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();
    }
}
