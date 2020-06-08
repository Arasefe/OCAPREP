package _27Exceptions.Error;

public class Test {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            try {
                for(;;) {                           // java.lang.OutOfMemoryError: Java heap space
                    sb.append("OCA");
                }
            } catch(Exception e) {
                System.out.println("Exception!!!");
            }
            System.out.println("Main ends!!!");
        }
    }

