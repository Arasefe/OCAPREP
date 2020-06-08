package _14PassByValue.PassingString;

public class Test4 {
    public static void main(String[] args) {
        int number=1;                                           // Copy of number is created and passed
        System.out.println("Number = "+number);
        number(number);
        System.out.println("Number in number method= "+number); // 1
        number=number(number);                                  // 2
        String letters="abc";
        letters=letters(letters);                               // abcd
        System.out.println(number+letters);                     // 2abcd
    }
    public static int number(int number){                       // 1
        number++;                                               // 1++
        return number;                                          // 2
    }
    public static String letters(String letters){               // abc
        letters+="d";                                           // abcd
        return letters;                                         // abcd
    }
}
