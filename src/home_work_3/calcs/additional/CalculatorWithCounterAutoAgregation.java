package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {

    CalculatorWithOperator calculatorWithOperator;
    CalculatorWithMathCopy calculatorWithMathCopy;
    CalculatorWithMathExtends calculatorWithMathExtends;
    private long countOperation = 0;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    private void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double exponentiation(double firstNumber, int secondNumber) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.exponentiation(firstNumber, secondNumber);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.exponentiation(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.exponentiation(firstNumber, secondNumber);
        }
    }

    public double module(double number) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.module(number);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.module(number);
        } else {
            return calculatorWithMathExtends.module(number);
        }
    }

    public double rootOfNumber(double number) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.rootOfNumber(number);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.rootOfNumber(number, 2);
        } else {
            return calculatorWithMathExtends.rootOfNumber(number);
        }
    }

    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.division(firstNumber, secondNumber);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.division(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.division(firstNumber, secondNumber);
        }
    }

    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.multiplication(firstNumber, secondNumber);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiplication(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.multiplication(firstNumber, secondNumber);
        }
    }

    public double addition(double firstNumber, double secondNumber) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.addition(firstNumber, secondNumber);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.addition(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.addition(firstNumber, secondNumber);
        }
    }

    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.subtraction(firstNumber, secondNumber);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtraction(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.subtraction(firstNumber, secondNumber);
        }
    }
}
