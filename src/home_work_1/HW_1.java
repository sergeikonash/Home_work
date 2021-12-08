package home_work_1;

public class HW_1 {
    public static void main(String[] args) {
    task1_2();
    task1_3();
    }
    static void task1_2() {
        byte a = 42; //00101010
        byte b = 15; //00001111
        System.out.println(a|b); //00101010 | 00001111 = 00101111
        System.out.println(a&b); //00101010 & 00001111 = 00001010
        System.out.println(a^b); //00101010 ^ 00001111 = 00100101
        System.out.println(~a); //~00101010 = 11010101
        System.out.println(~b); //~00001111 = 11110000
        System.out.println(a<<1); //00101010 << 1 = 01010100
        System.out.println(b<<1); //00001111 << 1 = 00011110
        System.out.println(a>>1); //00101010 >> 1 = 00010101
        System.out.println(b>>1); //00001111 >> 1 = 00000111
        System.out.println(a>>>4); //00101010 >>> 4 = 00000010
        System.out.println(b>>>3); //00001111 >>> 3 = 00000001
        System.out.println(a<<=1); //00101010 <<= 1 = 01010100
        a = 42;
        System.out.println(b<<=1); //00001111 <<= 1 = 00011110
        b = 15;
        System.out.println(a|=b); //00101010 |= 00001111 = 101111
    }
    static void task1_3() {
        byte a = -42; //11010110
        byte b = -15; //11110001

        System.out.println(a|b); //11010110 | 11110001 = 11110111
        System.out.println(a&b); //11010110 & 11110001 = 11010000
        System.out.println(a^b); //11010110 ^ 11110001 = 100111
        System.out.println(~a); //~11010110 = 101001
        System.out.println(~b); //~11110001 = 1110
        System.out.println(a<<1); //11010110 << 1 = 10101100
        System.out.println(b<<1); //11110001 << 1 = 11100010
        System.out.println(a>>1); //11010110 >> 1 = 11101011
        System.out.println(b>>1); //11110001 >> 1 = 11111000
        System.out.println(a>>>4); //11010110 >>> 4 = 11111101
        System.out.println(b>>>3); //11110001 >>> 3 = 11111110
        System.out.println(a<<=1); //11010110 <<= 1 = 10101100
        a = -42;
        System.out.println(b<<=1); //11110001 <<= 1 = 11100010
        b = -15;
        System.out.println(a|=b); //11010110 |= 11110001 = 11011111
    }
    static void task1_5() {
        float a = 42.5f; //побитовые операторы применяются только к целочисленным типам
/*      System.out.println(~a); java: bad operand type float for unary operator '~'
        System.out.println(a<<1); java: bad operand types for binary operator '<<'
        System.out.println(a>>1);
        System.out.println(a>>>4);
        System.out.println(a<<=1);
*/
    }
}
