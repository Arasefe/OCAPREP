package _1.OverFlowUnderFlow.OverFlow;

public class Overflow {
    public static void main(String[] args) {
        int a=Integer.MAX_VALUE;
        System.out.println("Integer Max Value = " + a);
        System.out.println("Integer Overflow Value = " + (a+1));

        byte b=Byte.MAX_VALUE;
        System.out.println("Byte Max Value = " + b);
        System.out.println("Byte Overflow Value = " + (b+1));
    }
}
