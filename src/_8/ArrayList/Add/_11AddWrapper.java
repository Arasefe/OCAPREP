package _8.ArrayList.Add;

import java.util.ArrayList;

public class _11AddWrapper {
    public static void main(String[] args) {
        addWrapper(new ArrayList<>(2));
    }
    public static void addWrapper(ArrayList<Integer>list){
        list.add(12);
        list.add(3);
        list.add(67);
        list.add(56);
        list.add(1,21);     //[12,21,3,67,12,56]
        list.add(4,12);
        System.out.println(list);


    }
}
