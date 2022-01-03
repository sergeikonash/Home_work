package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        System.out.println(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)), calc.exponentiation(calc.division(28, 5), 2)));
        // 140.45999999999998
        System.out.println(calc.getCountOperation());
        // 5

        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        System.out.println(calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)), calculator.exponentiation(calculator.division(28, 5), 2)));
        // 140.45999999999998
        System.out.println(calculator.getCountOperation());
        // 5

        CalculatorWithCounterAutoAgregation calculator1 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        System.out.println(calculator1.addition(calculator1.addition(4.1, calculator1.multiplication(15, 7)), calculator1.exponentiation(calculator1.division(28, 5), 2)));
        // 140.45999999999998
        System.out.println(calculator1.getCountOperation());
        // 5

        CalculatorWithCounterAutoAgregation calculator2 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());
        System.out.println(calculator2.addition(calculator2.addition(4.1, calculator2.multiplication(15, 7)), calculator2.exponentiation(calculator2.division(28, 5), 2)));
        // 140.45999999999998
        System.out.println(calculator2.getCountOperation());
        // 5
    }
}
