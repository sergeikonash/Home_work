package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());
        System.out.println(calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)), calculator.exponentiation(calculator.division(28, 5), 2)));
        // результат вычисления 140.45999999999998

       calculator.saveNumber(); // сохранил ответ в память
        // при вычислении новой операции и повторном вызове метода saveNumber() ответ пересохранится
        System.out.println(calculator.getNumberFromMemory()); // получил ответ из памяти
        System.out.println(calculator.getNumberFromMemory()); // память очистилась

    }
}
