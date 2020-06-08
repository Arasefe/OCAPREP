package _15.Equality.String;

public class StringEquality6 {
    public static void main(String[] args) {

        System.out.println("bart"=="bart");             // true
        String str="bart";
        System.out.println("bart".equals("bart"));      // true
        System.out.println("bart".equals(str));         // true
        String str2="A";
        String str4=str2+str;
        String str3="Abart";
        System.out.println(str3==str4);                  // false
        System.out.println(str3.equals(str4));           // false
    }
}
