package _7.Array.EmptyArray;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        String []word=new String[3];            // Empty String[]array in method.  Sets default value of null
        for(int i=0;i<word.length;i++){
            System.out.print(word[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(word));
    }
}
