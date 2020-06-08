package _27Exceptions.CheckedExceptions;

public class Exception5 {
    public static void main(String[] args) {
        Float f=null;
        try{
            f=Float.valueOf("12.3");            // compiles without issue
            String s=f.toString();
            int i=Integer.parseInt(s);          // Throws NumberFormatException (Float to Integer)
            System.out.println(""+i);
        }catch(Exception exception){
            System.out.println("trouble "+ f);
        }
    }
}
