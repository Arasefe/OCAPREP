package _2.StaticVariables;

public class StaticVariable3 {
    static int x = 5;
    static int y;

    public static void main(String[] args) {
        int x = (x = 3) * 4;
        System.out.println(x);
        methodA(1);
    }

    public static void methodA(int y) {
        try {
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException AE) {
            System.out.println("Arithmetic exception caught");
        } finally {
            System.out.println("Done");
        }
        System.out.println("End of story");
    }
}
