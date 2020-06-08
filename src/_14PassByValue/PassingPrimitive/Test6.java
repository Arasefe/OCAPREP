package _14PassByValue.PassingPrimitive;

public class Test6 {

    public static void main(String[] args) {
        int value=9;
        square(value);                          // A copy of value is created and passed

    }
    public static long square(int x){
        long y=x*(long)x;
        x=-1;
        System.out.println(y);
        return y;
    }
}
