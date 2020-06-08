package _2.LocalVariables;


public class Char {
    public static void main(String[] args) {
        char myChar='A';
        char myUnicode='\u0041';

        System.out.println(myChar);
        System.out.println(myUnicode);

        char myChar1='e';
        char myUnicode1='\u0065';
        System.out.println(myChar1);
        System.out.println(myUnicode1);

        if (myChar==myUnicode)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        char myChar2='l';
        char myUnicode2='\u006c';
        System.out.println(myChar2);
        System.out.println(myUnicode2);

        char myChar3=65;
        System.out.println(myChar3);            //A

        char myChar4=6556;
        System.out.println(myChar4);            //ᦜ
    }
}
