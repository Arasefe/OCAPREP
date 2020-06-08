package _8.ArrayList.Add;

import java.util.ArrayList;
import java.util.List;

public class _10AddWrapper {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1);
        autoBoxing(new ArrayList<Integer>(1));

    }
    public static void autoBoxing(ArrayList<Integer>list){
        list.add(Integer.parseInt("5"));                 // list.add(5); Autoboxing
        list.add(Integer.valueOf("6"));                     // list.add(6);
        list.add(7);                                        // list.add(7); Autoboxing
        list.add(null);                                     // list.add(null) It is possible
        for (int a : list) {                                // NullPointerException because of null
            System.out.println(a);
        }
    }
}
