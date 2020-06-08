package _1.MainMethod;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] names) {
        System.out.println(names[0]);               // If no argument is given, ArrayIndexOutOfBoundsException is thrown
        System.out.println(names[1]);               // If there is no argument filled this slot, same exception
        System.out.println(Arrays.toString(names)); // [Aras, Tulpar]
    }
}
