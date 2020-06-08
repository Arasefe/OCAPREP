package _4.NumericPromotion.Rule_2;

public class Test1 {
    /*
    If one of the values is integral, and the other one is floating-point,
    Java will automatically promote the integral value to the floating-point value’s data type.
     */
    public static void main(String[] args) {
        int x=4;
        float f=12.5f;
        float result=x*f;
        System.out.println(result);
    }
}
