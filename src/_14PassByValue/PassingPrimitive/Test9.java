package _14PassByValue.PassingPrimitive;

public class Test9 {
    public static void main(String[] args) {

        int a=5;                        // A copy of var is created
        int b=7;                        // A copy of b is created
        byte c=100;                     // A copy of c is created
        System.out.println(a+","+b+","+c);

        foo(a, b,c);
        System.out.println(a+""+b+""+c);

    }
    public static void foo(int a, int b, byte c){
        a=b+c;
       // a=107
        System.out.println(a);
    }
}
