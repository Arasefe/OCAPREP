package _15.Equality.String;

public class StringEquality1 {
    public static void main(String[] args) {
        String str1="one";                              //one
        String str2="two";                              //two
        System.out.println(str1.equals(str2));          //false

        String str3= new String("Aras Efe");
        String str4= new String("Aras Efe");
        System.out.println(str3.equals(str4));          // true


        String str5="Aras";                             // Tulpar
        String str6="Tulpar";                           //
        System.out.println(str5.equals(str5=str6));     // Compares str5 ("Aras") with str5("Tulpar");
    }
}
