package _5.Casting;

public class Test2 {
    public static void main(String[] args) {
        long l = 100_00l;
        int i = 100;
        float f = 2.02f;
        double d = 10_0.35d;
        f = l;
        d = l;
        f = (float)d;
        d = f;
        f = i;
        i = (int)f;
        i = (int)d;
    }
}
