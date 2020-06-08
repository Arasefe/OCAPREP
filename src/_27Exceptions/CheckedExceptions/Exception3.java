package _27Exceptions.CheckedExceptions;

public class Exception3 {
    public static void main(String[] args) {
        try{
            aMethod();
            System.out.println("try");
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        System.out.println("out");
    }
    public static void aMethod() throws Exception{
        throw new Exception("OMG");
    }

}
