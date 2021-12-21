package home_work_2.home_work_2_2_3;

public class WhileOperation implements IArraysOperation{
    @Override
    public void task2_2_1(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    @Override
    public void task2_2_2(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
                i++;
            }
        }
        System.out.println();
    }

    @Override
    public void task2_2_3(int[] array) {
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();
    }
}
