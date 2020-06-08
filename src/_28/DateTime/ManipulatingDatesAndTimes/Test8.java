package _28.DateTime.ManipulatingDatesAndTimes;

import java.time.Period;

public class Test8 {
        public static void main(String [] args) {
            Period period = Period.of(10, 3, 0);
            System.out.println(period);

            Period p=Period.of(0,0,0);
            System.out.println(p);
        }
}
