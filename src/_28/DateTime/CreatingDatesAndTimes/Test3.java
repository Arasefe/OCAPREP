package _28.DateTime.CreatingDatesAndTimes;


import java.time.LocalDate;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.of(2020, Month.APRIL,32);  //Invalid value for DayOfMonth
        System.out.println(localDate);
    }
}
