package _28.DateTime.ManipulatingDatesAndTimes;

import java.time.LocalDate;
import java.time.Period;

public class Test2 {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.of(2020,5,24);
        localDate=localDate.plusWeeks(28);
        System.out.println(localDate);

        Period period= Period.of(0,7,0);
        LocalDate localDate1=LocalDate.of(2020,05,24);
        localDate1=localDate1.plus(period);
        System.out.println(localDate1);
    }
}
