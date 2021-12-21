package home_work_2.home_work_2_2_3;

public class ForOperation implements IArraysOperation{
    @Override
    public void task2_2_1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void task2_2_2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void task2_2_3(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
