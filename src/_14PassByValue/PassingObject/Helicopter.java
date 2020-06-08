package _14PassByValue.PassingObject;

public class Helicopter {
    public int adjustPropellers(int length,String[]type){
        length++;
        type[0]="LONG";                             // null="LONG"
        return length;                              //
    }
    public static void main(String[]climb){
        final Helicopter h=new Helicopter();
        int length=5;                               // Copy of length
        String[]type=new String[1];                 // Copy of String[] type
        length=h.adjustPropellers(length,type);     // 6
        System.out.println(length+", "+type[0]);    // 6 null
    }
}
