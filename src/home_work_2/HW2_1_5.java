package home_work_2;

public class HW2_1_5 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 2; j < 6; j++) {
                if ((i * j) < 10 & i < 10) {
                    System.out.print(j + " x " + i + " = " + i * j + "   |   ");
                } else if ((i * j) > 9 & i < 10) {
                    System.out.print(j + " x " + i + " = " + i * j + "  |   ");
                } else {
                    System.out.print(j + " x " + i + " = " + i * j + " |   ");
                }
            }
        }
        System.out.println();
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 6; j < 10; j++) {
                if ((i * j) < 10 & i < 10) {
                    System.out.print(j + " x " + i + " = " + i * j + "   |   ");
                } else if ((i * j) > 9 & i < 10) {
                    System.out.print(j + " x " + i + " = " + i * j + "  |   ");
                } else {
                    System.out.print(j + " x " + i + " = " + i * j + " |   ");
                }
            }
        }
    }
}
