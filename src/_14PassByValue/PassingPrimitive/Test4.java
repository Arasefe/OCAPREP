package _14PassByValue.PassingPrimitive;

public class Test4 {

    public static void main(String[] args) {
        int num = 6;                                    // Copy of int num is created and passed
        newNumber(num);
        System.out.println(num);                        // 6
    }

    public static void newNumber(int num) {
        num = 8;                                        // Copy of int num is set to 8
        System.out.println(num);                        // 8

    }
}
