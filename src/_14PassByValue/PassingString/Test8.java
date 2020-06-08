package _14PassByValue.PassingString;

public class Test8 {
    public static void main(String args[]) {
        String s = "Aras Efe";
        int age = 5;
        someMethod1(age);
        System.out.println(age);

        someMethod2(s);
        System.out.println(s);
    }

    public static void someMethod1(int i) {
        System.out.println(++i);
    }
    public static void someMethod2(String s) {
        s = "Tulpar Ege";
        System.out.println(s);
    }
}
