package _28.DateTime.ParsingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test1 {
        public static void main(String [] args) {
            LocalDate date = LocalDate.parse("2018-01-01");
            // If you do not define a Formatter it uses a default "DateTimeFormatter f=DateTimeFormatter.ofPattern("MM dd yyyy)" Formatter;
            System.out.println(date);

            LocalDate date1=LocalDate.parse("1977-01-01");
            System.out.println(date1);

            LocalDate date2=LocalDate.parse("1999-08-30");
            System.out.println(date2);

            LocalTime time=LocalTime.parse("12:35");
            System.out.println(time);

            LocalDateTime ldt=LocalDateTime.parse("2018-01-30T12:24");
            System.out.println(ldt);
        }
    }

