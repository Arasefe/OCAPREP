package _8.ArrayList.Remove;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100);         // remove method is overloaded: remove(int) and remove(Object).
                                        // char can be easily assigned to int so compiler tags remove(int) method.
        System.out.println(list);
    }
}

