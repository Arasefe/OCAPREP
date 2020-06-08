package _12String;

public class Test1 {
        public static void main(String[] args) {
            String str1 = " ";
            boolean b1 = str1.isEmpty();        //false
            System.out.println(b1);
            str1.trim();                        //" " trims the beginning and end
            b1 = str1.isEmpty();
            System.out.println(b1);             // false
        }
    }
