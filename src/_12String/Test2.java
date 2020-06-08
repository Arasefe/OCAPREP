package _12String;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();                      // creates new String name "Java"
        String s2 = "Java";                             // String s2="Java";

        System.out.println(s1 == s2);
    }
}
