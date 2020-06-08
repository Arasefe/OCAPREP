package _27Exceptions.CheckedExceptions;

public class CatchWithReturn {
        public static void main(String[] args) {
            calculate(10,0);

        }

        public static int calculate(int a, int b) {
            try {
                return a/b;
            } catch (ArithmeticException e) {
                System.out.println("error");
               // System.exit(0);
                return 1;
            } finally {
                System.out.println("finally");
                return 0;
            }
        }
    }
