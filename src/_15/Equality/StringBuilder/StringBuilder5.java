package _15.Equality.StringBuilder;

public class StringBuilder5 {
    public static void main(String[] args) {
        /**
         * There  is no equals() method in StringBuilder so
         * it checks if both references are pointing to the same object
         */
        System.out.println(new StringBuilder("Aras")==new StringBuilder("Aras"));               // false
        System.out.println(new StringBuilder("Aras").equals(new StringBuilder("Aras")));        // false
    }
}
