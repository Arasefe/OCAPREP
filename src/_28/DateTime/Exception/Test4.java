package _28.DateTime.Exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test4 {
    /*
    LocalDate object doesn't contain time part but ISO_DATE_TIME looks for time portion
    and throws exception at runtime.
     */
    public static void main(String[] args) {
        System.out.println(LocalDate.parse("1987-09-01")
                .format(DateTimeFormatter.ISO_DATE_TIME));
    }

}
