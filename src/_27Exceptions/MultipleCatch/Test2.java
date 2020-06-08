package _27Exceptions.MultipleCatch;

import _27Exceptions.Inhertitance.Sub;
import _27Exceptions.Inhertitance.Super;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();                             // FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.print("X");              // X
        } catch (IOException e) {
            System.out.print("Y");
        } finally {
            System.out.print("Z");              // Z
        }
    }
}

