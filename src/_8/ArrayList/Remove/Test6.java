package _8.ArrayList.Remove;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("X");
        list1.add("Y");
        list1.add("X");
        list1.add("Y");
        list1.add("Z");
        list1.remove(3);        //[X Y X Z]
        list1.remove(2);        //[X Y Z]
        System.out.println(list1);
    }
}
