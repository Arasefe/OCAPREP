package _15.Equality.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(3);
        List<String> list2 = new ArrayList<>(3);
        System.out.println(list1 == list2);                         // false
        System.out.println(list1.equals(list2));                    // true

        List<Integer> list3 = new ArrayList<>(3);
        List<Integer> list4 = new ArrayList<>(3);
        list3.add(12);
        list3.add(18);
        list3.add(234);
        list3.set(2,24);

        list4.add(12);
        list4.add(18);
        list4.add(24);
        System.out.println(list3==list4);                           // false
        System.out.println(list3.equals(list4));                    // true

    }
}
