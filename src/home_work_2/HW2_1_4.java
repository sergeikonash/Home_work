package home_work_2;

import java.util.Scanner;

public class HW2_1_4 {
    public static void main(String[] args) {
        long number = 1;

        task1_4(number, 3);
        task1_4(number, 188);
        task1_4(number, -19);

        Scanner scanner = new Scanner(System.in);
        int console = scanner.nextInt();

        task1_4(number, console);
    }
    static void task1_4(long num, long j) {
        System.out.println("Умножаем на " + j);
        long i;
        if (j > (-1)) {
            for (i = num; i > 0; i *= j) {
                if ((i * j) < 0) {
                    System.out.print("Значение до переполнения: " + i);
                }
            }
        } else {
            long k = 0;
            j *= (-1);
            for (i = num; i > 0; i *= j) {
                k++;
                if ((i * j) < 0) {
                    j *= (-1);
                    if (k % 2 > 0) {
                        i *= (-1);
                        System.out.print("Значение до переполнения: " + i);
                        i *= j;
                        break;
                    } else {
                        System.out.print("Значение до переполнения: " + i);
                        i *= j;
                        break;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Значение после переполнения: " + i);
    }
}
