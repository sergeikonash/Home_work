package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        double result = 1;
        for (int i = secondNumber; i > 0; i--) {
            result *= firstNumber;
        }
        return result;
    }

    public double module (double number) {
        if (number < 0) {
            return number * (-1);
        } else {
            return number;
        }
    }

    public double rootOfNumber (double number) {
        return Math.sqrt(number);
    }
}
