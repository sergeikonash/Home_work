package home_work_1;

public class HW_3 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-11) + " получение абсолютного значения");
        System.out.println(Math.sin(Math.toRadians(90)) + " синус 90 градусов");
        System.out.println(Math.pow(3,2) + " возведение в степень");
        System.out.println(Math.sqrt(9) + " вычисление квадратного корня");
        System.out.println(((int) (Math.random() * 10)) + " генерация случайного числа от 0 до 10");
        System.out.println(Math.round(1.5) + " " + Math.floor(1.3) + " " + Math.ceil(1.3) + " округление (в меньшую если <0,5 и в большую, если >=0.5), до ближайшего меньшего и до ближайшего большего");
    }
}
