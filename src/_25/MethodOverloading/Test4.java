package _25.MethodOverloading;

public class Test4 {
    public static void main(String[] args) {
        extractInt(2.7);
        extractInt(2);

    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
    private static void extractInt(Number number){
        System.out.println(number.intValue());

    }
    private static void extractInt(int x){
        System.out.println(x);
    }
}
