package _15.Equality.Object;

import java.time.LocalDate;
import java.time.LocalTime;

public class ObjectEquality1 {
    public static void main(String[] args) {
        System.out.println(LocalTime.now()==LocalTime.now());                           // false
        System.out.println(LocalDate.now().equals(LocalDate.now()));                    // true
    }
}
