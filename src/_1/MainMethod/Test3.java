package _1.MainMethod;

public class Test3 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("args-size= " + args.length);            // 0
        System.out.println("args-size= " + args.length);            // 1 2 3 4 5 when given
        for (int i = 0; i < args.length; i++) {
            System.out.println("[args["+i+"]=" +i);
        }
        addMethod(5,8);
    }

    /**
     * calculates sum of two integers
     * @param a First Operand
     * @param b Second Operand
     * @return int Sum of these two operands
     */
    public static int addMethod(int a, int b){
        int result =a+b;
        return result;
    }
}
