package _8.ArrayList.ArrayToList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _32ArrayToList {
    public static void main(String[] args) {
        arrayToList();
    }
    public static void arrayToList(){
        List list= Arrays.asList("1","5","2","4","3","8");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);                   // [1, 2, 3, 4, 5, 8]
        list.set(1,"5");
        System.out.println(list);                   // [1, 5, 3, 4, 5, 8]
        Collections.sort(list);
        System.out.println(list);                   // [1, 3, 4, 5, 5, 8]
        list.add("8");                              // UnsupportedOperationException because fixed size List
    }
}
