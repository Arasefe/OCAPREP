package _28.DateTime.ManipulatingDatesAndTimes;


import java.time.LocalDate;

public class Test3 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1980-03-16");     // COMPILES
        System.out.println(date.minusYears(-5));            // MINUS(-) ADDS
        System.out.println(date);
        date=date.minusYears(5);
        System.out.println(date);
    }
}
