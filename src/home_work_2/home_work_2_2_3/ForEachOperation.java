package home_work_2.home_work_2_2_3;

public class ForEachOperation implements IArraysOperation{
    @Override
    public void task2_2_1(int[] array) {
        int i = 0;
        for (int j : array) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    @Override
    public void task2_2_2(int[] array) {
        int i = 0;
        for (int j : array) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
        System.out.println();
    }

    @Override
    public void task2_2_3(int[] array) {
        int i = array.length - 1;
        for (int j : array) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();
    }
}
