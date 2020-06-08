package _1.OverFlowUnderFlow;

public class Primitives {
    public static void main(String[] args) {
        byte byteNumber=10;
        byte minByteNumber=Byte.MIN_VALUE;
        System.out.println("Byte Minimum Value = " + minByteNumber);
        System.out.println("Byte Underflow Value = " + (minByteNumber-1));
        byte maxByteNumber=Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = "+ maxByteNumber);
        System.out.println("Byte Overflow Value = " + (maxByteNumber+1));
        short shortNumber=23;
        short minShortNumber=Short.MIN_VALUE;
        System.out.println("Short Minimum Value ="+ minShortNumber);
        System.out.println("Short Underflow Value= " + (minShortNumber-1));
        short maxShortNumber=Short.MAX_VALUE;
        System.out.println("Short Maximum Value ="+ maxShortNumber);
        System.out.println("Short Overflow Value ="+ (maxShortNumber+1));
        System.out.println("_____________________________________________");
        int intNumber=45;
        int minIntNumber=Integer.MIN_VALUE;
        System.out.println("Integer Minimum Value = "+minIntNumber);
        System.out.println("Integer Underflow Value = " + (minIntNumber-1));
        int maxIntNumber=Integer.MAX_VALUE;
        System.out.println("Integer Maximum Value = "+ maxIntNumber);
        System.out.println("Integer OverFlow Value = "+ (maxIntNumber+1));
        long longNumber=67L;
        long minLongNumber=Long.MIN_VALUE;
        System.out.println("Long Minimum Value =" + minLongNumber);
        System.out.println("Long Underflow Value = " + (minLongNumber-1));
        long maxLongNumber=Long.MAX_VALUE;
        System.out.println("Long Maximum Value =" + maxLongNumber);
        System.out.println("Long Overflow Value = " +(maxLongNumber+1));
        float floatNumber=345.6f;
        float minFloatNumber=Float.MIN_VALUE;
        System.out.println("Float Minimum Value =" + minFloatNumber);
        System.out.println("Float Underflow Value = "+ (minFloatNumber-1));
        float maxFloatNumber=Float.MAX_VALUE;
        System.out.println("Float Maximum Value =" + maxFloatNumber);
        System.out.println("Float Overflow Value = "+ (maxFloatNumber+1));
        double doubleNumber=670.5;
        double minDoubleNumber=Double.MIN_VALUE;
        System.out.println("Double Minimum Value =" + minDoubleNumber);
        System.out.println("Double Underflow Value = " + (minDoubleNumber-1));
        double maxDoubleNumber=Double.MAX_VALUE;
        System.out.println("Double Maximum Value =" + maxDoubleNumber);
        System.out.println("Double Overflow Value = " + (maxDoubleNumber+1));
        char charNumber=34;
        char minCharNumber= Character.MIN_VALUE;
        System.out.println(minCharNumber);
        char maxCharNumber=Character.MAX_VALUE;
        System.out.println(maxCharNumber);
    }
}
