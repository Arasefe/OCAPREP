package _8.ArrayList.Remove;


import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List s1=new ArrayList<String>();

        System.out.println(s1.add("a"));
        System.out.println( s1.add("b"));
        System.out.println( s1.add("c"));
        System.out.println(s1.add("a"));
        System.out.println(s1.remove("d"));
        System.out.println(s1.remove("f"));
        System.out.println(s1);

        if(s1.remove("a")){
            if(s1.remove("a")){
                s1.remove("b");
            }else{
                s1.remove("c");
            }
        }
        System.out.println(s1);
    }
}
