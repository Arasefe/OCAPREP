package _14PassByValue.PassingPrimitive;

public class Test5 {

    public static void main(String[] args) {
        Integer val1=new Integer(5);
        int val2=9;
        testInts(val1++,++val2);                            // Copy of val1++ and ++val2 (5, 10) are created and passed
        System.out.println(val1+ " "+ val2);                // 6 10
    }
    public static void testInts(Integer obj, int var){
        obj=var++;                                          // obj = 10++;
        obj++;                                              // 11
        System.out.println(obj+" "+var);                    // 11 11
    }
}
