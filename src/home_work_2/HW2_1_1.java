package home_work_2;

import java.util.Scanner;

public class HW2_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number;
        while (true) {
            System.out.print("Введите положительное число больше 0: ");
            number = scanner.nextLong();
            if (number > 0) {
                break;
            }
        }
        task1_1(number);
        task1_2(number, 1);

    }
    public static void task1_1(long i) {
        long result = 1;
        for (long j = 1; j <= i; j++) {
            result *= j;
        }
        System.out.println(result);
    }
    public static void task1_2(long i, long result) {
        if (i != 0) {
            result *= i;
            i -= 1;
            task1_2(i, result);
        } else {
            System.out.println(result);
        }
    }
}
