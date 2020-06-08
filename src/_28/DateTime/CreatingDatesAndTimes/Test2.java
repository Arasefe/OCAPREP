package _28.DateTime.CreatingDatesAndTimes;

import java.time.LocalDate;

public class Test2 {
        public static void main(String [] args) {
            LocalDate newYear = LocalDate.of(2018, 1, 1);
            LocalDate eventDate = LocalDate.of(2018, 1, 1);
            boolean flag1 = newYear.isAfter(eventDate);     // false
            boolean flag2 = newYear.isBefore(eventDate);    // false
            System.out.println(flag1 + ":" + flag2);        // false : false

            System.out.println(new Boolean("ture"));     // false
            System.out.println(new Boolean("truE"));     // true
        }
    }
