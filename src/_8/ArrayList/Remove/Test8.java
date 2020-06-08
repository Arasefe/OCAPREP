package _8.ArrayList.Remove;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        addElement(new ArrayList<Integer>(6));
    }
    public static void addElement(ArrayList<Integer>list){
        list.add(12);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(3,7);      //[12 9 3 7 2]
        list.add(4);                      //[12 9 3 7 2 4]
        System.out.println(list);
    }
}
