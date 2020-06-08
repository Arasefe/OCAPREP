package _8.ArrayList.ListToArray;

import java.util.ArrayList;
import java.util.Arrays;

public class _28ListToArray {
    public static void main(String[] args) {
        listToArray(new ArrayList<String>());

    }
    public static void listToArray(ArrayList<String>list){
        list.add("Hawk");
        list.add("Robin");
        list.add(1,"Eagle");    //[Hawk, Eagle, Robin]
        System.out.println("The size of the list is " +list.size()+ ", and the content is "+list);
        Object[]objectArray=list.toArray();
        System.out.println("The length of the array is "+objectArray.length+ ", and the content is " +Arrays.toString(objectArray));
    }
}
