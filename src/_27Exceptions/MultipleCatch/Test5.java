package _27Exceptions.MultipleCatch;

public class Test5 {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (NullPointerException ex) {
            System.out.println("ONE");
//        } catch (FileNotFoundException ex) {
//            System.out.println("TWO");
//        }
            System.out.println("THREE");
        }
    }
}