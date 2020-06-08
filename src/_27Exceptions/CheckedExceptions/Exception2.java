package _27Exceptions.CheckedExceptions;

public class Exception2 {

    public static void main(String[] args) throws Exception {
        try {
            m1();
        } finally {
            System.out.println("A");
        }
    }

    private static void m1() throws Exception {
        throw new Exception();
    }

}
