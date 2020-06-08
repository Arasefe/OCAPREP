package _28.DateTime.FormattingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 22 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date); 	// 2015-01-02
        System.out.println(time); 	// 11:22

    }
}
