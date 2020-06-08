package _7.Array.ArrayExamples;

import java.util.Arrays;

public class Array9 {
    public static void main(String [] target){      // When arguments are given length changes accordingly

        System.out.println(target.length);          // 0
        for(String tar:target){
            System.out.print(tar+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(target));
    }
}
