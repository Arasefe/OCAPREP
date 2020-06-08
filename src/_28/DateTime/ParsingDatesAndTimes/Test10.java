package _28.DateTime.ParsingDatesAndTimes;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test10 {
        public static void main(String [] args) {
            LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
            Period period = Period.parse("p-30000y");
            System.out.println(date.plus(period));
        }
    }
