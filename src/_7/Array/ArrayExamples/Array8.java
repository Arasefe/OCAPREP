package _7.Array.ArrayExamples;

public class Array8 {
    public static void main(String[] args) {
        String msg = "Hello";
        boolean [] flag = new boolean[1];       // default value is set that is false

        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);
    }
}
