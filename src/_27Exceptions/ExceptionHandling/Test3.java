package _27Exceptions.ExceptionHandling;

public class Test3 {
    private static void m1() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            m1();
        } finally {
            System.out.println("Arithmetic Exception");
        }
    }
}
