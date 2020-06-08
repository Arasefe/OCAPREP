package _28.DateTime.ManipulatingDatesAndTimes;

import java.time.LocalDate;

public class Test1 {
    public static void main(String[] args) {
        LocalDate x= LocalDate.of(2016,12,25);
        x=x.plusDays(-1);

        System.out.println(x.getDayOfMonth());
    }
}
