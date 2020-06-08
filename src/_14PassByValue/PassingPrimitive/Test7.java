package _14PassByValue.PassingPrimitive;

public class Test7 {

    public static void main(String[] args) {
        int i1 = 1;
        change(i1);                             // PassingPrimitives6.change(i1) is redundant but ok
        System.out.println(i1);                 // 1
    }
    public static void change(int num) {
        num++;                                  // 1++
        System.out.println(num);                // 2
    }

}
