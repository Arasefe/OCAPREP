package _28.DateTime.ParsingDatesAndTimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String [] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate localDate = LocalDate.parse("03-16-2006",dtf);
        localDate=localDate.plusWeeks(2);

        System.out.println(localDate.withDayOfYear(29));
    }
}
