package _1.Identifiers;

import java.util.ArrayList;
import java.util.List;

public class CommentLine {
    public static void main(String[] args) {
        int okidentifier = 12;
        String $OK2Identifier;
        byte _alsoOK1d3ntifi3r;
        short __SStillOkbutKnotsonice$ = 23;
        int _______;
        byte ____123___;


        String a="Ali";
        String b="Ali"+"";
        System.out.println(a==b);
        Double []arr=new Double[2];
        System.out.println(arr[0]+arr[1]);

        //double num[]=new int[2]; DOES NOT COMPILE

        StringBuilder sb= new StringBuilder("Java");
        String s1=sb.toString();
        String s2=sb.toString();
        System.out.println(s1==s2);

        int i=100;
        System.out.println(-i++);

        List<String>list=new ArrayList<>(3);
        //list.addAll(1,"Java");
        System.out.println(100);
    }
}
