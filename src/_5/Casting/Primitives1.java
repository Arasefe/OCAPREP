package _5.Casting;

public class Primitives1 {
    public static void main(String[] args) {
        /*
        Numeric Promotion Rule#3 byte, short, char automatically promoted to int thus java gives compiler error
         */
        short x=30;
        short y=3;
        short z=(short)(x/y);
    }
}
