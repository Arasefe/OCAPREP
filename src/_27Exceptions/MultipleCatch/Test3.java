package _27Exceptions.MultipleCatch;

public class Test3 {
    private static String s;                                    // null
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        } catch(NullPointerException | ClassCastException ex) { // || (Short Circuit Operators are not used in here)
            System.out.println("DONE");
        } catch (RuntimeException rex){
            System.out.println("Runtime Exception");
        } finally {
            System.out.println("FINALLY");
        }
        System.out.println("GOT THROUGH THE CODE");
    }
}
