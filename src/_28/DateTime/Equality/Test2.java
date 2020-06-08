package _28.DateTime.Equality;

import java.time.LocalDate;

public class Test2 {
        public static void main(String [] args) {
            LocalDate date1 = LocalDate.parse("1980-03-16");
            LocalDate date2 = LocalDate.parse("1980-03-16");
            System.out.println(date1.equals(date2) + " : " + date1.isEqual(date2));
            System.out.println((date1==date2)+" : "+(date2==date1));
        }
    }

