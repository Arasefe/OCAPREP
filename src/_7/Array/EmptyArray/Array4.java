package _7.Array.EmptyArray;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        boolean[]array=new boolean[3];              // Empty boolean[]array in method.  Sets default value of false
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
