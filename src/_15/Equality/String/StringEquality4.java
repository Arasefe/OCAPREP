package _15.Equality.String;

public class StringEquality4 {
    public static void main(String[] args) {
        String str1="Aras Efe";
        String str2="Aras";
        String str3=" Efe";
        String str4=str2+str3;                          // Run Time concatenation
        System.out.println(str1==str4);
        System.out.println(str1=="Aras"+" Efe");        // Compile time concatenation
    }
}
