package _7.Array.ArrayExamples;

import java.util.Arrays;

public class EchoFirst {
    public static void main(String[] args) {
        Arrays.sort(args);
        int result= Arrays.binarySearch(args,args[0]);
        System.out.println(result);
         result= Arrays.binarySearch(args,"2");
        System.out.println(result);
        result=Arrays.binarySearch(args,args[3]);
        System.out.println(result);
        result=Arrays.binarySearch(args,"1");
        System.out.println(result);
        result=Arrays.binarySearch(args,1);           //ClassCastException because int 1 can not be cast to String

    }
}
