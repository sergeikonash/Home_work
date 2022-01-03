package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {

    private double memory = 0;
    private double numberInMemory = 0;
    ICalculator iCalculator;

    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }
    public void saveNumber() {
        numberInMemory = memory;
    }

    public double getNumberFromMemory() {
        memory = numberInMemory;
        numberInMemory = 0;
        return memory;
    }

    public double exponentiation(double firstNumber, int secondNumber) {
        memory = iCalculator.exponentiation(firstNumber, secondNumber);
        return memory;
    }

    public double module(double number) {
        memory = iCalculator.module(number);
        return memory;
    }

    public double rootOfNumber(double number) {
        memory = iCalculator.rootOfNumber(number);
        return memory;
    }

    public double division(double firstNumber, double secondNumber) {
        memory = iCalculator.division(firstNumber, secondNumber);
        return memory;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        memory = iCalculator.multiplication(firstNumber, secondNumber);
        return memory;
    }

    public double addition(double firstNumber, double secondNumber) {
        memory = iCalculator.addition(firstNumber, secondNumber);
        return memory;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        memory = iCalculator.subtraction(firstNumber, secondNumber);
        return memory;
    }

}

