package _1.OverFlowUnderFlow.OverFlow;


public class Test2 {
    public static void main(String[] args) {
        int a=Integer.MAX_VALUE;
        System.out.println(a+1);        // OVERFLOW-2147483648

        int b=Integer.MIN_VALUE;
        System.out.println(b-1);        // UNDERFLOW 2147483647

        byte c=Byte.MAX_VALUE;
        System.out.println(c+1);        // OVERFLOW 128

        byte d=Byte.MIN_VALUE;
        System.out.println(d-1);        // UNDERFLOW -129

        short s=Short.MAX_VALUE;
        System.out.println(s+1);        // OVERFLOW 32768

        short k=Short.MIN_VALUE;
        System.out.println(k-1);        // UNDERFLOW -32769

        long l=Long.MAX_VALUE;
        System.out.println(l+1);        // OVERFLOW -9223372036854775808

        long m=Long.MIN_VALUE;
        System.out.println(m-1);          // UNDERFLOW 9223372036854775807
    }
}
