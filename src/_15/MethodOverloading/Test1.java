package _15.MethodOverloading;

public class Test1 {
    public static void main(String[] args) {
        extractInt(2.7);                            // 2
        extractInt(2);                              // 2
        extractInt("null");                         // null
        extractInt(new Integer(12));
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());             // 2
    }

    private static void extractInt(Integer obj) {
        System.out.println(obj.intValue());             // 2
    }
    private static void extractInt(Object obj) {
        System.out.println(obj);                        // obj
    }
}

