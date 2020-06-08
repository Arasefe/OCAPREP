package _15.Equality.StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class StringBuilder2 {
    /*
    StringBuilder class doesn't override equals(Object) method and hence
    days.contains(new StringBuilder("Sunday")) returns false.
    Code inside if-block is not executed and days.size() returns 3.
     */
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        if (days.contains(new StringBuilder("Sunday"))) {    // there is no equals()method in StringBuilder so it returns false
            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());
    }
}
