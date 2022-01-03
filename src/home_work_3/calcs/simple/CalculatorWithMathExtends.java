package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        return super.exponentiation(firstNumber, secondNumber);
    }

    @Override
    public double module(double number) {
        return super.module(number);
    }

    @Override
    public double rootOfNumber(double number) {
            return Math.sqrt(number);
    }
}
