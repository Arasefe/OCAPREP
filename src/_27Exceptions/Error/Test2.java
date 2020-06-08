package _27Exceptions.Error;

public class Test2 {
    static {
        System.out.println(1 / 0);                // Exception in thread "main" java.lang.ExceptionInInitializerError
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}

