package _1.OverFlowUnderFlow;

public class Study1 {
    public static void main(String[] args) {
//        System.out.println(0x1FF);      // Base 16-->
//        System.out.println(026);        // Base 8 --> 22
//        System.out.println(0b11);       // Base 2 --> 3

        int firstHex=0X1FB;
        System.out.println(firstHex);
        System.out.println("firstHex ="+Integer.toHexString(firstHex));
        int firstOcta=043;
        System.out.println("firstOcta =" +Integer.toOctalString(firstOcta));
        int firstBin=0b11011;
        System.out.println("firstBin ="+ Integer.toBinaryString(firstBin));
    }
}
