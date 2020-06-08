package _8.ArrayList.Add;

import java.util.ArrayList;
import java.util.List;

public class _16AddString {
    public static void main(String[] args) {
        newMethod(new ArrayList<>(5));

    }

    public static List<String> newMethod(ArrayList<String> days) {

        days.add("SUNDAY");
        days.add("SUNDAY");
        days.add("MONDAY");
        System.out.println(days.size());
        days.clear();
        System.out.println(days.size());
        return days;
    }

}

