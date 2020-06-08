package _7.Array.EmptyArray;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        char[]arr=new char[3];                  // Empty char[]array in method.  Sets default value of " "
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
