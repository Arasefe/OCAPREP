package _14PassByValue.PassingString;

public class Test7 {
    public static void main(String args[]) {
        String s = "Aras Efe";
        int i = 5;
        passByValueMethod1(i);                          // A copy of i is created
        System.out.println(i);                          // 5

        passByValueMethod2(s);                          // A copy of s is created
        System.out.println(s);                          // Aras Efe
    }

    public static void passByValueMethod1(int i) {
        System.out.println(++i);                        // 6
    }
    public static void passByValueMethod2(String s) {
        s = "Tulpar Ege";
        System.out.println(s);                          // Tulpar Ege
    }
}
