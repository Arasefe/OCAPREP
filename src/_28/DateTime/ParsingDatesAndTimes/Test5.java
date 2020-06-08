package _28.DateTime.ParsingDatesAndTimes;

import java.time.LocalDate;

public class Test5 {
    public static void main(String[] args) {
//        DateTimeFormatter dtf=DateTimeFormatter.ISO_LOCAL_DATE;
//        LocalDate date= LocalDate.parse("2020-04-30",dtf);
//        date=date.plusDays(2);
//        date=date.plusMonths(3);
//        System.out.println(date.getYear()+","+date.getMonth()+","+date.getDayOfMonth());
//
//
//        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ISO_LOCAL_TIME;
//        LocalTime localTime=LocalTime.parse("12:45",dateTimeFormatter);
//        localTime.plusHours(3);
//        System.out.println(localTime.getHour()+","+localTime.getMinute());


        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));

    }
}
