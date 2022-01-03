package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOperation = 0;

    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        countOperation++;
        return super.exponentiation(firstNumber, secondNumber);
    }

    @Override
    public double module(double number) {
        countOperation++;
        return super.module(number);
    }

    @Override
    public double rootOfNumber(double number) {
        countOperation++;
        return super.rootOfNumber(number);
    }

    @Override
    public double division(double firstNumber, double secondNumber) {
        countOperation++;
        return super.division(firstNumber, secondNumber);
    }

    @Override
    public double multiplication(double firstNumber, double secondNumber) {
        countOperation++;
        return super.multiplication(firstNumber, secondNumber);
    }

    @Override
    public double addition(double firstNumber, double secondNumber) {
        countOperation++;
        return super.addition(firstNumber, secondNumber);
    }

    @Override
    public double subtraction(double firstNumber, double secondNumber) {
        countOperation++;
        return super.subtraction(firstNumber, secondNumber);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
