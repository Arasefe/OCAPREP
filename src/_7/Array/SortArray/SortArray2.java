package _7.Array.SortArray;

import java.util.Arrays;

public class SortArray2 {
    public static void main(String[] args) {
        sortArray(new String[]{"3","7","79","37","46","540"});
    }
    public static String[] sortArray(String[]array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,"7"));                     // 4
        System.out.println(Arrays.binarySearch(array,"3"));                     // 0
        System.out.println(Arrays.binarySearch(array,"549"));                   //-5
        return array;
    }

}
