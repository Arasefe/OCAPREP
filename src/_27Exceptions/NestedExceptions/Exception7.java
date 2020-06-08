package _27Exceptions.NestedExceptions;

public class Exception7 {
    public static void main(String[] args) {
        System.out.println(methodCalculate());
    }

    public static String methodCalculate() {
        String result = "";
        String str = "";

        try {
            try {
                result += "1";                  // 1
                str.length();                   // 0
                result += "2";                  // 12
            } catch (NullPointerException e) {
                result += "3";
                throw new RuntimeException();
            } finally {
                result += "finally";            // 12finally
                throw new Exception();
            }
        } catch (Exception e) {
            result += "DONE";                   // 12finallyDONE
        }

        return result;
    }
}
