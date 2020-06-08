package _7.Array.SortArray;

import java.util.Arrays;

public class SortArray1 {
    final public static void main(String[] args) {
        sortArray(new int[]{2,3,32,12,32,453,8});
    }
    public static int[] sortArray(int[]array){
        //int[]array={2,4,32,34,5,24,43,54};
        Arrays.sort(array);                             // sort the array
        System.out.println(Arrays.toString(array));     // [ 2,4,5,24,32,34,43,54]
        for(int arr:array){
            if(arr>=32){
                break;
            }
            System.out.print(arr+" ");

        }
        return array;
    }
}
