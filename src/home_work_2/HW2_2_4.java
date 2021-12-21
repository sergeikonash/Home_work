package home_work_2;

import static home_work_2.ArraysUtils.*;

public class HW2_2_4 {

    //На автомате перешел к заданию и не сразу вспомнил, что уже решали эти задачи...

    public static void main(String[] args) {
        int[] array = arrayRandom(7, 100);
        System.out.println(task2_4_1(array));
        System.out.println(task2_4_2(array));
    }
    static int task2_4_1(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // для визуализации и проверки
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                summ += arr[i];
            }
        }
        System.out.println(); // для визуализации и проверки
        return summ;
    }

    static int task2_4_2(int[] arr) {
        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // для визуализации и проверки
            if (i % 2 == 0) {
                if (arr[i] > maxNumber) {
                    maxNumber = arr[i];
                }
            }
        }
        System.out.println(); // для визуализации и проверки
        return maxNumber;
    }
    //Вспомнил после решения второй задачи =)
}
