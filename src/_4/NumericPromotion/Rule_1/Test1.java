package _4.NumericPromotion.Rule_1;

public class Test1 {

    public static void main(String[] args) {
        /**
         *
         * @param     int x=12;
         *            long y=34;
         *            result will automatically be promoted to long
         *
         */
        int x=12;
        long y=34;
        long result=y+x;
        System.out.println(result);

        System.out.println("args="+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("args ["+i+ "] = " +args[i]);
        }

    }
}
