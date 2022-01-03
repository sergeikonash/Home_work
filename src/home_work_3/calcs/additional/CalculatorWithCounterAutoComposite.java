package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {

    CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
    private long countOperation = 0;

    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double exponentiation(double firstNumber, int secondNumber) {
        incrementCountOperation();
        return calculator.exponentiation(firstNumber, secondNumber);
    }

    public double module(double number) {
        incrementCountOperation();
        return calculator.module(number);
    }

    public double rootOfNumber(double number) {
        incrementCountOperation();
        return calculator.rootOfNumber(number);
    }

    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.division(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.multiplication(firstNumber, secondNumber);
    }

    public double addition(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.addition(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.subtraction(firstNumber, secondNumber);
    }
}
