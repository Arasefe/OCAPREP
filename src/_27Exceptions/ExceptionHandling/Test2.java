package _27Exceptions.ExceptionHandling;

public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (NullPointerException ex) {
            System.out.println("ONE");

        }
        System.out.println("THREE");
    }
}
