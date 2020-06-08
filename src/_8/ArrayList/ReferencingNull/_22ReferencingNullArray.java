package _8.ArrayList.ReferencingNull;

public class _22ReferencingNullArray {
    public static void main(String[] args) {
        arrayMethod();
    }
    public static void arrayMethod(){
            String[] arr = {"abc", "TrUe", "false", null, "FALSE"};
            for (String s : arr) {
                System.out.print(Boolean.valueOf(s) ? "T" : "F");           // FTFFF
            }

    }
}
