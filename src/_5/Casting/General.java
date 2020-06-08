package _5.Casting;

public class General {
    public static void casting() {
        char c='a';
        byte b=12;
        short s=23;
        int i=234;
        long l=4535L;
        float f=12.3f;
        double d=23.50;
        //boolean b1=true;

        i=c;            // char byte and short automatically converted to int
        i=b;
        i=s;
        c=(char)i;      // explicit cast only
        b=(byte)i;      // explicit cast only
        s=(short)i;     // explicit cast only
        l=i;            // int can be casted directly to long without explicit cast
        i=(int)l;       // explicit cast only
        d=f;
        f=(float)d;     // float can be assigned to double with only explicit cast
    }

    public static void main(String[] args) {
        casting();
    }
}
