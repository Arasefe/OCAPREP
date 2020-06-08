package _27Exceptions.NestedExceptions;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println(calculate());
    }
    public static String calculate(){
        String result = "";
        String str = null;

        try {
            try {
                result += "start";                  // result=start
                str.length();
                result += "end";
            } catch (NullPointerException e) {
                result += "npe";                    // result =startnpe
                throw new RuntimeException();
            } finally {
                result += "finally";                // result = startnpefinally
                throw new Exception();
            }
        } catch (Exception e) {
            result += "finished";                   // result= startnpefinallyfinished
        }

        return result;
    }
}
