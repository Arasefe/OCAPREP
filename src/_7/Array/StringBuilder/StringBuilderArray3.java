package _7.Array.StringBuilder;

import java.util.Arrays;

public class StringBuilderArray3 {
    public static void main(String[] args) {
        stringBuilderMethod(new StringBuilder[]{new StringBuilder("Banu"), new StringBuilder("Ismail")});
    }
    public static void stringBuilderMethod(StringBuilder[]array){       //StringBuilder[]array={"Banu","Ismail"}
        for(StringBuilder arr:array){
            arr.append(" YILDIRIM");
            System.out.println(arr);
        }
        System.out.println(Arrays.toString(array));
    }
}
