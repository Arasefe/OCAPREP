package _1.ImportStatements;
import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static _1.ImportStatements.Config.*;


public class Test2 {
    public static void main(String[] args) {
        int min=min(3,7);                       // Math.min(3,7);
        out.println("min= "+min);
        out.println(PI);                        // Math.PI

        printConfig();
    }
}
