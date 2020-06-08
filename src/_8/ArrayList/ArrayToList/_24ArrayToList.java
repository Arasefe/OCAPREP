package _8.ArrayList.ArrayToList;

import java.util.Arrays;
import java.util.List;

public class _24ArrayToList {
    public static void main(String[] args) {
        convert();

    }
    public static String convert(){
        String[] array=new String[]{"OCA", "OCP","ISTQB","AWS"};
        System.out.println(Arrays.toString(array));         // [OCA OCP ISTQB AWS]
        System.out.println(array.length);                   // 4

        List list= Arrays.asList(array);
        System.out.println(list.size());
        list.set(1,"OSA");
        System.out.println(Arrays.toString(array));         //Array
        System.out.println(list);                           //ArrayList
        return"";
    }
}
