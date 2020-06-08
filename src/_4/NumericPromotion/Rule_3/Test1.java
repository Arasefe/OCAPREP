package _4.NumericPromotion.Rule_3;

public class Test1 {
    public static void main(String[] args) {
        /*
        byte, short and char is automatically promoted to int
         */

        short x=12;
        short y=3;
        int result=x/y;
        System.out.println(result);
    }

}
