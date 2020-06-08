package _8.ArrayList.Add;

import java.util.ArrayList;

public class _15AddString {
    public static void main(String[] args) {
       addInteger(new ArrayList<>(5));
        addObject(new ArrayList<>(6));
    }
    public static void addObject(ArrayList<String>list){

        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");
        if (list.remove("ONE")) {                // Returns boolean as well as remove the Object
            list.remove("THREE");
        }
        System.out.println(list);                   // [TWO THREE]
    }
    public static void addInteger(ArrayList<Integer>list2){

        list2.add(110);                             // Wrapper
        list2.add(new Integer(110));          // Wrapper
        list2.add(110);                             // Wrapper

        list2.removeIf(i -> i == 110);              // Lambda
        System.out.println(list2);
    }
}

