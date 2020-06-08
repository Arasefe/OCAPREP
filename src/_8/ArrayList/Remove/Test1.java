package _8.ArrayList.Remove;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(100);
            list.add(200);
            list.add(100);
            list.add(200);
            //list.remove(100);              removes the element at index#100
            //list.remove(new Integer(100));
            System.out.println(list);


        }
    }

