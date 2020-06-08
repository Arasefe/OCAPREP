package _28.DateTime.ParsingDatesAndTimes;

import java.time.LocalDate;

public class Test11 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2006,9,12);
        System.out.println(localDate.withDayOfYear(29));
    }
}
