package _27Exceptions.CheckedExceptions;

import _27Exceptions.Inhertitance.Sub;
import _27Exceptions.Inhertitance.Super;

import java.io.IOException;

public class Exception7 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (IOException e) {
            System.out.print("A");

        } finally {
            System.out.print("C");
        }
    }
}
