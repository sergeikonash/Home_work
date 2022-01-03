package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        System.out.println(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)), calc.exponentiation(calc.division(28, 5), 2)));
        // 140.45999999999998
    }
}
