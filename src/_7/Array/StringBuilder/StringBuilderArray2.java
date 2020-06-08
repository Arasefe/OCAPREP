package _7.Array.StringBuilder;

import java.util.Arrays;

public class StringBuilderArray2 {
    public static void main(String[] args) {
        stringBuilderMethod(new StringBuilder[]{new StringBuilder("Aras"),new StringBuilder("Tulpar")});

    }
    public static void stringBuilderMethod(StringBuilder[]array){
        for(StringBuilder arr:array){
            arr.append(" YILDIRIM");
            System.out.println(arr);
        }
        System.out.println(Arrays.toString(array));
    }
}
