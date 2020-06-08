package _27Exceptions.UncheckedExceptions;

public class Test2 {

    public static void main(String[] args) {

        divide(10,0);

    }

    private static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException ae) {
            ae.getMessage();
            return 0;
        } finally {
            System.out.println("Arithmetic Exception is handled");
            return 0;
        }

    }
}

