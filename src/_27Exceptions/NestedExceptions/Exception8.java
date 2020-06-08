package _27Exceptions.NestedExceptions;

public class Exception8 {
    public static void main(String[] args) {
        System.out.println(calculateMethod());
    }
    public static int calculateMethod(){
        int result=0;
        String[] str = new String[4];
        str[0]=null;

        try {
            try {
                result +=1;                         // result=1
                str[0].length();                    // nullPointerException
                result += 2;
            } catch (NullPointerException e) {
                result += 3;                        // result=4
                throw new RuntimeException();
            } finally {
                result += 4;                        // result=8
                throw new Exception();
            }
        } catch (Exception e) {
            result += 5;                            // result=13
        }
        return result;
    }
}
