package home_work_3.calcs;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        double a = 4.1;
        double b = 15 * 7; // 105.0
        double c = Math.pow((28.0 / 5.0), 2); // 31.359999999999996
        double result = a + b + c; // 140.45999999999998
        System.out.println(result);
    }
}
