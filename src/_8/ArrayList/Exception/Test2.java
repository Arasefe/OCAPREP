package _8.ArrayList.Exception;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>(4);
            list.add(0, "Array");
            list.add(2, "List");            // IndexOutOfBoundsException

            System.out.println(list);
        }
    }

