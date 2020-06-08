package _7.Array.ArrayEquality;

import java.util.Arrays;

public class Equality {
    public static void main(String[] args) {
        int [] number1={12,23,34};
        int [] number2=number1;                                 //{12,23,34}
        int [] number3=new int[]{12,23,34};

        System.out.println(number1==number2);                   // true
        System.out.println(number1==number3);                   // false
        System.out.println(Arrays.equals(number1, number2));    // true
        System.out.println(Arrays.equals(number1, number3));    // true
    }
}
