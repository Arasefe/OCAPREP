package _5.Casting;

public class Test3 {
        public static void main(String[] args) {
            long l = 100_00l;
            int i = 100;
            float f = 2.02f;
            double d = 10_0.35d;
            f = l;
            d = l;
            //f = d; Requires explicit cast
            d = f;
            f = i;
            //i = f; Requires explicit cast
            i = (int)d;
        }
    }
