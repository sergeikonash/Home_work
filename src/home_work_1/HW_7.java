package home_work_1;

//Пока выполнена не до конца
public class HW_7 {
    public static void main(String[] args) {
        System.out.println(toBinaryString( -42));
    }
    static String toBinaryString(int number) {
        String binar = "";
        int binarNumber;
        if (number > 0) {
            while(number !=0 ) {
                binarNumber = number % 2;
                binar = binarNumber + binar;
                number = number / 2;
            }
            binar = "00" + binar;
        } else if (number == 0) {
            binar = "0";
        } else {
            while(number !=0 ) {
                binarNumber = number % 2;
                if (binarNumber == 0) {
                    binar = (binarNumber * (-1) + 1) + binar;
                    number = number / 2;
                } else {
                    binar = (binarNumber * (-1) - 1) + binar;
                    number = number / 2;
                }
            }
            binar = "11" + binar;
        }
        return binar;
    }
}
