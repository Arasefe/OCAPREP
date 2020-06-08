package _7.MultiDimensionalArray.Examples;

import java.util.Arrays;

public class TwoD2 {
    public static void main(String[] args) {
        int[][] twoD = new int[][]{{12, 23}, {54, 2}, {87, 956}};
       for(int[]inner:twoD){
           for(int num:inner){
               System.out.println(num+"");
           }
           System.out.println(Arrays.toString(inner));
       }
    }
}
