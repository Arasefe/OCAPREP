package _28.DateTime.FormattingDatesAndTimes;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime d=LocalDateTime.of(2017,5,10,11,22,33);
        Period p= Period.ofDays(1).ofYears(2);
        d=d.minus(p);
        DateTimeFormatter f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));            //  5/10/2015, 11:22

    }
}
