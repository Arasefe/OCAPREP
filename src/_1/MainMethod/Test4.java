package _1.MainMethod;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        short [] arr = new short[]{50, 50};
        arr[0]=1;
        arr[1]=2;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);                    //[S@38af3868
    }
}
