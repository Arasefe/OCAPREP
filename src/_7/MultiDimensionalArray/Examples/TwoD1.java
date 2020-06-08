package _7.MultiDimensionalArray.Examples;

import java.util.Arrays;

public class TwoD1 {
    public static void main(String[] args) {
        int [][]twoD=new int[][]{{12,23},{54,2},{87,956}};
        for(int i=0;i<twoD.length;i++){
            for(int j=0;j<twoD[i].length;j++){
                System.out.println(twoD[i][j]+"");
            }
           // System.out.println();
            System.out.println(Arrays.toString(twoD[i]));

        }
    }
}
