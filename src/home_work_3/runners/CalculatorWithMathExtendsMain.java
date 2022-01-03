package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        System.out.println(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)), calc.exponentiation(calc.division(28, 5), 2)));
        // 140.45999999999998
    }
}
