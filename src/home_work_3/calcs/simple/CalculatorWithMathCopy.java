package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double division (double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public double multiplication (double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double addition (double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtraction (double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double exponentiation (double firstNumber, int secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }

    public double module (double number) {
            return Math.abs(number);
    }

    @Override
    public double rootOfNumber(double firstNumber) {
        return Math.sqrt(firstNumber);
    }

    public double rootOfNumber (double firstNumber, int secondNumber) {
        if (secondNumber == 3) {
            return Math.cbrt(firstNumber);
        } else {
            return Math.pow(firstNumber, 1.0 / secondNumber);
        }
    }
}
