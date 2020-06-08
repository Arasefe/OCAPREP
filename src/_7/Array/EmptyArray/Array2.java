package _7.Array.EmptyArray;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[]array=new int[3];                  // Empty int[]array in method. Sets default value of 0
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
