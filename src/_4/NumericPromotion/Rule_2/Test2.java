package _4.NumericPromotion.Rule_2;

public class Test2 {
    /**
     *
     * @param a is the first operand which is integral number
     * @param d is the second operand which is floating point number
     *          if an integral number is operated with floating point number the result must be floating point number
     */
    public static void numericPromotion(int a, double d) {

        double result=d/a;
        System.out.println(result);
    }

    public static void main(String[] args) {
        numericPromotion(12,125.50);
    }
}
