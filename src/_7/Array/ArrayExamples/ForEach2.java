package _7.Array.ArrayExamples;

import java.util.Arrays;

public class ForEach2 {
    public static void main(String[] args) {
        int [] arr = {3, 2,6,4, 1,4};
        for(int  i : arr) {
            System.out.print(arr[i]);               // prints ArrayIndexOutOfBoundsException
        }

        for(int i=0;i<arr.length;i++){              // 3, 2,6,4, 1,4
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));   //[3, 2,6,4, 1,4]
    }
}
