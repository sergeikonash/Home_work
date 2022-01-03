package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        double operation1 = calc.multiplication(15, 7);
        calc.incrementCountOperation();
        double operation2 = calc.addition(4.1, operation1);
        calc.incrementCountOperation();
        double operation3 = calc.division(28, 5);
        calc.incrementCountOperation();
        double operation4 = calc.exponentiation(operation3, 2);
        calc.incrementCountOperation();
        double operation5 = calc.addition(operation2, operation4);
        calc.incrementCountOperation();
        System.out.println(operation5);
        // 140.45999999999998
        System.out.println(calc.getCountOperation());
        // 5
    }
}
