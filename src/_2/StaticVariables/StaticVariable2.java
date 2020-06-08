package _2.StaticVariables;

import java.util.Arrays;

public class StaticVariable2 {
    private static int myInt;
    static String myString;
    private static int[]arr=new int[5];
    static Object object=new Object();
    static Object object2=null;

    public static void main(String[] args) {

        System.out.println("My int = " + myInt);                // 0

        System.out.println("My String = " + myString);          // Null

        System.out.println("My Array = "+ arr);                 // [I@e9e54c2

        System.out.println("My Array = "+ Arrays.toString(arr));// [0, 0, 0, 0, 0]

        System.out.println("My object =" +object);              // java.lang.Object@65ab7765

        System.out.println("My nullObject ="+object2);          // null
    }
}
