package _25.MethodOverloading;

public class Test3 {
    private static void add(double d1, double d2) {
        System.out.println("double version");
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version");
    }

    public static void add(String d1, String d2){
        System.out.println("String version");
    }

    public static void main(String[] args) {
        add(10.0, null);
    }
}
