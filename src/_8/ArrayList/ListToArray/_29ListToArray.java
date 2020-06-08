package _8.ArrayList.ListToArray;

import java.util.ArrayList;
import java.util.Arrays;

public class _29ListToArray {
    public static void main(String[] args) {
        listToStringArray(new ArrayList<>(6));
    }
    public static void listToStringArray(ArrayList<String>list){
        list.add("Aras");
        list.add("Tulpar");
        list.add(2,"Ege");
        list.add(1,"Efe");
        System.out.println(list);                       // [Aras, Efe, Tulpar, Ege]
        System.out.println(list.size());                // 4
        String[]strArray=list.toArray(new String[0]);   // List to Array

        System.out.println(Arrays.toString(strArray));  // [Aras, Efe, Tulpar, Ege]
        System.out.println(strArray.length);            // 4
        strArray[0]="KANIM";
        System.out.println(Arrays.toString(strArray));  // [KANIM, Efe, Tulpar, Ege]
        System.out.println(list);                       // [KANIM, Efe, Tulpar, Ege]

    }
}
