package _4.NumericPromotion;

public class PrimitiveCharAndBoolean {
        public static void main(String[] args) {
            char ch = 'a';

            // char ch1 = 'ab';
            char ch1 = '1';                         // UNICODE
            char uniChar = '\u03A9';                // upper case greek omega character
            char romanNumber = '\u216C';            // roman 50 number

            System.out.println("ch1= " + ch1);
            System.out.println("uniChar= " + uniChar);
            System.out.println("romanNumber= " + romanNumber);

            boolean myBoolean = true;
            boolean myFalseBoolean = false;

            System.out.println("myBoolean= " + myBoolean);
            System.out.println("myFalseBoolean= " + myFalseBoolean);
            System.out.println("myBoolean= " + myBoolean +" "+ myFalseBoolean+ " is myFalseBoolean ");

            boolean true1 = false;
        }
    }

