package _15.Equality.String;

public class StringEquality3 {
        public static void main(String[] args) {
            String javaworld = "JavaWorld";
            String java = "Java";
            String world = "World";
            java += world;                              // Run time concatenation
            System.out.println(java == "JavaWorld");    // false
            System.out.println(java == javaworld);      // false

        }
}
