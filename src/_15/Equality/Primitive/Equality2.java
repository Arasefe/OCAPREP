package _15.Equality.Primitive;

public class Equality2 {
    public static void main(String[] args) {
        boolean y = false;
        boolean x = (y = true);             // Runtime
        System.out.println(x); 		        // Outputs true
        System.out.println(y); 		        // Outputs true

        int a=5;
        int b=6;
        byte c=3;
        System.out.println(a<b);            // Outputs true
        System.out.println(a<c);            // Outputs false

        System.out.println(a<b||a<c);       // Outputs true Short circuit operator
        System.out.println(a<b||++a<c);     // Outputs true Short circuit operator
        System.out.println(a);              // 5
        }
    }
