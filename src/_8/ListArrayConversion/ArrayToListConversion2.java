package _8.ListArrayConversion;

import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);                                       // returns List Elements
        //list.add("four");                                             // Exception in thread "main" java.lang.UnsupportedOperationException
    }
}
