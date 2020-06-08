package _8.ArrayList.ArrayToList;

import java.util.Arrays;
import java.util.List;

public class _31ArrayToList {
    public static void main(String[] args) {
        arrayToList(new String[]{"Fist","Style","Confuse","Array"});
    }
    public static void arrayToList(String[]array){
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        List<String>list=Arrays.asList(array);
        System.out.println(list);
        System.out.println(list.size());

        list.set(2,"My");
        System.out.println(Arrays.toString(array));
        System.out.println(list);
    }
}
