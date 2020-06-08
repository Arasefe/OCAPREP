package _8.ArrayList.Remove;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("X");
        list1.add("Y");
        list1.add("X");
        list1.add("Y");
        list1.add("Z");
        list1.remove("Y");
        list1.remove(new String("Z"));
        System.out.println(list1);
    }
}
