package _28.DateTime.ManipulatingDatesAndTimes;

import java.time.LocalDateTime;
import java.time.Period;

public class Test7 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.of(2020,5,24,12,30);
        Period period= Period.of(0,7,5);
        localDateTime=localDateTime.plus(period);
        System.out.println(localDateTime);
    }
}
