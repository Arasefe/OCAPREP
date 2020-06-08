package _27Exceptions.CheckedExceptions;

public class Exception10 {
    /*
    Exception in thread "main" java.lang.StackOverflowError
     */
        public static void main(String[] args) {
            try {
                main(args);
            } catch (Exception ex) {
                System.out.println("CATCH-");
            }
            System.out.println("OUT");
        }
    }

