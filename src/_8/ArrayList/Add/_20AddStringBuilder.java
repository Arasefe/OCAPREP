package _8.ArrayList.Add;

import java.util.ArrayList;
import java.util.List;

public class _20AddStringBuilder {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        if (days.contains(new StringBuilder("Sunday"))) {
            days.add(new StringBuilder("Wednesday"));
        }
        System.out.println(days.size());

        Boolean[] arr = new Boolean[1];         // Null
        if (arr[0]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

