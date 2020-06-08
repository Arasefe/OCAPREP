package _27Exceptions.Error;

public class Test3 {
    static Double d1;
    static int x = d1.intValue();                   // Exception in thread "main" java.lang.ExceptionInInitializerError

    public static void main(String[] args) {
        System.out.println("HELLO");

    }
}
