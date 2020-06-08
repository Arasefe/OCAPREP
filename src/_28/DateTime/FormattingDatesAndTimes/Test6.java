package _28.DateTime.FormattingDatesAndTimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(LocalDate.parse("1987-09-01").format(
                DateTimeFormatter.ISO_DATE_TIME));
    }
}
