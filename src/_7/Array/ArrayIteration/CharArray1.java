package _7.Array.ArrayIteration;

public class CharArray1 {
    public static void main(String[] args) {
        charMethod();
    }

    public static void charMethod() {
        String pets = "Parrot";
        for (char c : pets.toCharArray()) {
            System.out.print(c+" ");
        }
    }
}
