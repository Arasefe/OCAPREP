package _14PassByValue.PassingString;

public class Test2 {
        public static void main(String[] args) {
            String str = "Good";            //Line 3
            change(str);                    //Line 4
            System.out.println(str);        //Line 5
        }

        private static void change(String s) {
            s=s.concat("_Morning");           //Line 9
            System.out.println(s);
        }
    }

