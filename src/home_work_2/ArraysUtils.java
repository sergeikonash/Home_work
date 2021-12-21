package home_work_2;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        int[] container2 = arrayRandom(5, 100);

    }

    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какого размера массив создать?");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните созданный массив значениями:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}
