package _8.ArrayList.Add;

import java.util.ArrayList;
import java.util.List;

public class _9AddToSpecificIndex {
    public static void main(String[] args) {
        addToIndex();

    }
    public static void addToIndex(){
        List<String> list = new ArrayList<>(4);
        list.add("OCA");
        list.add("OCP");
        list.add(0, "Array");
        list.add(2, "List");

        System.out.println(list);
    }
}
