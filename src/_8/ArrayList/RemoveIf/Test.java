package _8.ArrayList.RemoveIf;

import java.util.ArrayList;
import java.util.List;

public class Test {
        public static void main(String[] args) {
            Integer i = 10;
            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(new Integer(i));
            list.add(i);

            list.removeIf(a -> a == 10);

            System.out.println(list);
        }
}
