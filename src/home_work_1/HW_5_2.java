package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class HW_5_2 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean resultVasil = Objects.equals(name, "Вася");
        boolean resultAnast = Objects.equals(name, "Анастасия");
        if (resultVasil) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (resultAnast) {
            System.out.println("Я тебя так долго ждал");
        }
        else  {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
