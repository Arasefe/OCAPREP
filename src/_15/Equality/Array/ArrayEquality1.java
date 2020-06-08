package _15.Equality.Array;

import java.util.Arrays;

public class ArrayEquality1 {
    public static void main(String[] args) {
        String [] array1= new String []{"12,13,14,15"};
        String [] array2= new String []{"12,13,14,15"};
        System.out.println(Arrays.equals(array1,array2));    // true
        System.out.println(array1.equals(array2));           // false

        int[] num1= {1,2,3,4,5};
        int[] num2= {1,2,3,4,5};
        System.out.println(Arrays.equals(num1,num2));       // true
        System.out.println(num1.equals(num2));              // fasle
    }
}
