package _27Exceptions.UncheckedExceptions;

public class Test1 {

    public static void main(String[] args) {

        String[] array = new String[5];
        array[0] = "John";

        try {
            String element = firstToUppercase(array);
            System.out.println("element= " + element);
        } catch (NullPointerException npe) {
            System.out.println("Error message= " + npe.getMessage());
        } finally {
            System.out.println("finally block");
        }
    }


    public static String firstToUppercase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].toLowerCase();
        }
        return "false";
    }
}
