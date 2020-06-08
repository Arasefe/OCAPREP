package _1.Identifiers;

import java.util.Arrays;

public class JavadocCommentLine {
    public static void main(String[] args) {
        /**
         *
         * @param a first operand
         * @param b second operand
         * @return sum
         */
        for(int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }
        System.out.println(Arrays.toString(args));
        Arrays.sort(new int[2]);
        sum(3,7);


    }


    public static int sum(int a, int b){
        System.out.println(a+b);

        return a+b;
    }
}
