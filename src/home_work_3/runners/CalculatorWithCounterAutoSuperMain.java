package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        System.out.println(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)), calc.exponentiation(calc.division(28, 5), 2)));
        // 140.45999999999998
        System.out.println(calc.getCountOperation());
        // 5
    }
}
