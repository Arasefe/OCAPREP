package _7.Array.Exception;

public class Test4 {
        static Boolean[] arr = new Boolean[1];          // null
        public static void main(String[] args) {
            if(arr[0]) {                                // NullPointerException
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
