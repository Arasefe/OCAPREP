package _7.Array.SortArray;

import java.util.Arrays;

public class SortArray3 {
    public static void main(String[] args) {
        sortArray(new double[4]);
    }
    public static void sortArray(double[]array){
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int a=Arrays.binarySearch(array,1.2);
        System.out.println(a);
    }
}
