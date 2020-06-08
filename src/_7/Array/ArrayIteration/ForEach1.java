package _7.Array.ArrayIteration;

import java.util.Arrays;

public class ForEach1 {
    public static void main(String[] args) {
       forMethod();
       forEachMethod();
    }
    public static void forMethod(){
        int [] arr = {3, 2, 1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    public static void forEachMethod(){
        int[] arr={3, 2, 1};
        for(int  i : arr) {
            System.out.print(i+",");                // prints 3 2 1
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
