package _15.Equality.StringBuilder;

public class StringBuilder3 {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Java");
            String s1 = sb.toString();                      // new String("Java")
            String s2 = sb.toString();                      // new String("Java")

            System.out.println(s1 == s2);                   // false
            System.out.println(s1.equals(s2));              // true
        }
    }
