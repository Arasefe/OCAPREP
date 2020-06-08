package _6.FlowControlStructure.ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop1 {
    public static void main(String[] args) {

    }
    public static void forEachMethod(){
        List<String> exams = Arrays.asList("OCA", "OCP");
        for (String e1 : exams)            //OCA OCP
            for (String e2 : exams)        //OCA OCP
                System.out.println(e1 + "" + e2);
        System.out.println();
    }
}
