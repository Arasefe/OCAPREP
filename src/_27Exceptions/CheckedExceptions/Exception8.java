package _27Exceptions.CheckedExceptions;

public class Exception8 {
        private static String s;
        public static void main(String[] args) {
            try {
                System.out.println(s.length());
            } catch( NullPointerException e) {
                System.out.println("DONE");
            }
        }
}
