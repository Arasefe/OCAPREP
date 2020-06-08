package _15.Equality.String;

public class StringEquality5 {
    public static void main(String[] args) {
        String str1="Aras Efe";
        final String str2="Aras";
        final String str3=" Efe";
        final String str4=str2+str3;                            // Compile Time concatenation
        System.out.println(str1==str4);                         //
        System.out.println(str1=="Aras"+" Efe");                // Compile time concatenation

        System.out.println(str1.equals(str4));                  // true
    }

}
