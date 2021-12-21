package home_work_2;

import java.util.Scanner;

public class HW2_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1;
        int number2;
        double result = 1;
        while (true) {
            try {
                System.out.println("Введите первое число:");
                number1 = scanner.nextDouble();
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Введено не число");
            }
        }
        while (true) {
            try {
                System.out.println("Введите второе число (целое положительное):");
                String console = scanner.nextLine();
                double num = Double.parseDouble(console.trim());
                if (num % 1 == 0) {
                    number2 = (int) num;
                    break;
                } else {
                    System.out.println("Введено не целое число");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Введено не число");
            }
        }
        System.out.print(number1 + " ^ " + number2 + " = ");
        for (int i = number2; number2 > 0; number2--) {
            result = result * number1;
        }
        System.out.println(result);
    }
}
