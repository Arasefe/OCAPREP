package _28.DateTime.Equality;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2020, 9, 6);
//        System.out.println(date);
//
//
//        LocalTime time = LocalTime.of(23, 60);
//        System.out.println(time);

        LocalDate date1 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_DATE);
        LocalDate date2 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date3 = LocalDate.of(1947, 8, 15);

        System.out.println(date1.equals(date2) + " : " + date2.equals(date3));
    }

}
