package _8.ArrayList.Add;

import java.util.ArrayList;

public class _8AddToSpecificIndex {
    public static void main(String[] args) {
        addToSpecificIndex(new ArrayList<Boolean>());
    }
    public static void addToSpecificIndex(ArrayList<Boolean> list){
        list.add(true);
        list.add(true);
        list.add(false);
        list.add(Boolean.FALSE);
        list.add(3,false);      //[true true false false false]
        list.add(false);                      //[true true false false false false]
        System.out.println(list);
    }
}
