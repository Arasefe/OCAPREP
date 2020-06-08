package _27Exceptions.Error;

public class Test1 {
    public static void main(String[] args) {
        try{
            main(args);                     // Recursive loop
        }catch(Exception e){
            e.getStackTrace();
            System.out.println("CATCH-");
        }
        System.out.println("out");
    }
}
