package _15.Equality.StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        String s1="Java";
        StringBuilder sb=new StringBuilder("Java");
        //if(s1==sb) System.out.println("1"); DOES NOT COMPILE
        if(s1.equals(sb)) System.out.println("2");
    }
}
