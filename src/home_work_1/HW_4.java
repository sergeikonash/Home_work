package home_work_1;

public class HW_4 {
    public static void main(String[] args) {
        boolean result = sleepIn(false, true);
        if (result == true) {
            System.out.println("Можем спать дальше!");
        } else {
            System.out.println("Пора идти на работу...");
        }
    }
    static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday==true | vacation==true) {
            return true;
        } else {
            return false;
        }
    }
}
