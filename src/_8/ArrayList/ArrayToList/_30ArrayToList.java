package _8.ArrayList.ArrayToList;

import java.util.Arrays;
import java.util.List;

public class _30ArrayToList {
    public static void main(String[] args) {
        arrayToList(new String[]{"Aras","Efe","Tulpar","Ege"});
    }
    public static void arrayToList(String[]array){

       List list= Arrays.asList(array);
        System.out.println(list);
        System.out.println(Arrays.toString(array));
        list.set(1,"Kannnn");
        System.out.println(list);
        System.out.println(Arrays.toString(array));

    }
}
