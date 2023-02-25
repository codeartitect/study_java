/**
 * 자료형
 */
public class Chapter3 {
    public void numberData() {
        System.out.println("Chapter3");
        System.out.println("--------");

        // <정수>
        // int -> 최댓값 약 20억
        int a = 0;
        while (a >= 0) {
            a = a + 100000000;
            System.out.println(a);
        }

        // long -> 최댓값 약 900경ㅋㅋㅋㅋ..
        long b = 0;
        while (b >= 0) {
            b = b + 10000000000000L;
            System.out.println(b);
        }

        // <실수>
        // double -> 기본형
        double d = 3.14;
        System.out.println(d);

        // float
        float c = 3.14F;
        System.out.println(c);

        // <8진수와 16진수>
        // 8진수
        int octal = 023;        // 십진수 19
        System.out.println(octal);

        // 16진수
        int hex = 0xC;          // 십진수 12
        System.out.println(hex);
    }
    public static void main(String[] args) {
    }
}