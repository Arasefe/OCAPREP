package _2.InstanceVariables;

public class InstanceVariable3 {
    byte b1;
    short s1=134;
    double d1=5f;
    double d2=5.0;
    float f1=5f;
    float f2=5.0f;
    Integer in=null;

    public static void main(String[] args) {
        InstanceVariable3 iv = new InstanceVariable3();
        System.out.println("The default value of byte b1 "+ iv.b1);
        System.out.println("The value of value short s1 "+ iv.s1);
        System.out.println("The value of double d1" +iv.d1);
        System.out.println("The value of float f1" +iv.f1);
        System.out.println("The default value of Integer" +iv.in);

    }
}
