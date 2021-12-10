package home_work_1;

public class HW_6 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        System.out.println(createPhoneNumber(numbers));
    }
    static String createPhoneNumber(int[] number) {
        String code = "(" + number[0] + number[1] + number[2] + ")";
        String num = " " + number[3] + number[4] + number[5] + "-" + number[6] + number[7] + number[8] + number[9];
        return code + num;
    }
}
