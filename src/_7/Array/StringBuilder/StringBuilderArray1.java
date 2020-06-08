package _7.Array.StringBuilder;

public class StringBuilderArray1 {
    public static void main(String[] args) {
        StringBuilder[] builders = {new StringBuilder("For"), new StringBuilder("Loop")};

        for (StringBuilder builder : builders) {
            System.out.println(builder);        // For
        }                                       // Loop
        for (StringBuilder builder : builders) {
            builder.append("1234");             // For1234
            System.out.println(builder);        // Loop1234
        }
    }
}
