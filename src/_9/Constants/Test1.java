package _9.Constants;

public class Test1 {
        public static void main(String[] args) {
            final boolean flag;             // First declaration
            flag = false;                   // Then initialization makes no constant
            while(flag) {
                System.out.println("Good Morning!");
            }
        }
    }
