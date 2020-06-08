package _8.ArrayList.Equality;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String [] args) {
        List<Long> list = new ArrayList<Long>();

        list.add(7L);
        list.add(7L);
        list.add(new Long(7));
        list.add(new Long(7));

        System.out.println(list.get(0) == list.get(1));
        System.out.println(list.get(2) == list.get(3));
    }
}
