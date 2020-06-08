package _28.DateTime.FormattingDatesAndTimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test3 {
    public static void main(String [] args) {
        LocalDate localDate=LocalDate.parse("1987-09-01");
        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE_TIME));       //UnsupportedTemporalTypeException
        //System.out.println(localDate.format(DateTimeFormatter.ISO_TIME));          //UnsupportedTemporalTypeException
        LocalDate localDate1=LocalDate.parse("1977-01-01");
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        //System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));//UnsupportedTemporalTypeException
        //System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_TIME));     //UnsupportedTemporalTypeException
    }
}
