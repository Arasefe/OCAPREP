package _28.DateTime.FormattingDatesAndTimes;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test4 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.of(2015,5,20,12,35,44);
        Period p=Period.of(1,2,7);
        localDateTime=localDateTime.minus(p);
        DateTimeFormatter f=DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(localDateTime.format(f));                                    // 12:35 PM
        DateTimeFormatter dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(localDateTime.format(dtf));                                  // Mar 13, 2014
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(localDateTime.format(dateTimeFormatter));                    // 3/13/14, 12:35 PM
    }
}
