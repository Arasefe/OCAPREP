package _8.ListArrayConversion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArrayConversion2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,4,-1,5);
        Collections.sort(list);
        Integer array[]=list.toArray(new Integer[4]);

        System.out.println(array[0]);
        System.out.println(array[3]);
    }
}
