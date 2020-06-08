package _28.DateTime.ParsingDatesAndTimes;

import java.time.LocalDate;

public class Test8 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2000-06-25");
        while(date.getDayOfMonth() >= 20) {
            System.out.println(date);
            date.plusDays(-1);
        }
    }
}
