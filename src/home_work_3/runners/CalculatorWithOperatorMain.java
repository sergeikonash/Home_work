package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator CWO = new CalculatorWithOperator();
        System.out.println(CWO.addition(CWO.addition(4.1, CWO.multiplication(15, 7)), CWO.exponentiation(CWO.division(28, 5), 2)));
        // 140.45999999999998
        // ранее связывание + позднее связывание
    }
}
