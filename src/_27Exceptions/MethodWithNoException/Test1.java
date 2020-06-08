package _27Exceptions.MethodWithNoException;

public class Test1 {
        public static void main(String[] args) {
            try {
                System.out.println(1);
            } catch (NullPointerException ex) {
                System.out.println("ONE");
            }
            System.out.println("THREE");
        }
    }

