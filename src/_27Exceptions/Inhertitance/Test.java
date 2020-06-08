package _27Exceptions.Inhertitance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    /*
    Even though an instance of FileNotFoundException is thrown by method m1() at runtime,
    but method m1() declares to throw IOException.
    Reference variable s is of Super type and hence for compiler, call to s.m1();
    is to method m1() of Super, which throws IOException.
    And as IOException is checked exception hence calling code should handle it.
    As calling code doesn't handle IOException or its super type, so s.m1(); gives compilation error.
     */
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("M");
        } catch (IOException e) {
            System.out.println("x");
        } finally {
            System.out.print("N");
        }
    }
}
