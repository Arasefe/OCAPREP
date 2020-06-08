package _8.ArrayList.Add;

import java.util.ArrayList;
import java.util.List;

public class _14AddString {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");
        if (fruits.remove("grape")) {           // returns boolean
            fruits.remove("papaya");
        }
        System.out.println(fruits);                 // [apple orange mango banana grape]

    }

}
