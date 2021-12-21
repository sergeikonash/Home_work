package home_work_2;

import java.util.Scanner;

public class HW2_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("Введите целое число:");
                String console = scanner.nextLine();
                double num = Double.parseDouble(console.trim());
                if (num % 1 == 0) {
                    number = (int) num;
                    break;
                } else {
                    System.out.println("Введено не целое число");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Введено не число");
            }
        }
        String result = "";
        long productOfNumber = 1;
        int partOfNumber = number % 10;
        productOfNumber *= partOfNumber;
        result = partOfNumber + " = " + result;
        number /= 10;
        while (number > 0) {
            partOfNumber = number % 10;
            productOfNumber *= partOfNumber;
            result = partOfNumber + " * " + result;
            number /= 10;
        }
        System.out.println(result + productOfNumber);
    }
}
