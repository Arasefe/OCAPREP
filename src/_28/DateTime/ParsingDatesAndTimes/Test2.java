package _28.DateTime.ParsingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test2 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2000-01-01");         //"2000-1-01" DOES NOT COMPILE
        Period p = Period.ofYears(-3000);
        System.out.println(date.plus(p));

        LocalDate date1=LocalDate.parse("1999-08-30");
        Period p1=Period.of(17,6,6);
        date1=date1.plus(p1);
        System.out.println(date1);

        LocalDate date2=LocalDate.of(1977,1,1);
        Period p2=Period.of(8,6,56);
        date2=date2.plus(p2);
        System.out.println(date2);

        LocalDateTime ldt=LocalDateTime.parse("1999-08-30T14:30");
        Period p3=Period.ofYears(12);
        ldt=ldt.plus(p3);
        System.out.println(ldt);
    }
}
