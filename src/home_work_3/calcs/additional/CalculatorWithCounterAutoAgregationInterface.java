package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    ICalculator iCalculator;
    private long countOperation = 0;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    private void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double exponentiation(double firstNumber, int secondNumber) {
        incrementCountOperation();
        return iCalculator.exponentiation(firstNumber, secondNumber);
    }

    public double module(double number) {
        incrementCountOperation();
        return iCalculator.module(number);
    }

    public double rootOfNumber(double number) {
        incrementCountOperation();
        return iCalculator.rootOfNumber(number);
    }

    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return iCalculator.division(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return iCalculator.multiplication(firstNumber, secondNumber);
    }

    public double addition(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return iCalculator.addition(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return iCalculator.subtraction(firstNumber, secondNumber);
    }

}
