package _16.Initialization;

public class RopeSwing {
   static private Roper rope1=new Roper();
   static private Roper rope2=new Roper();
    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        rope1.length=2;
        rope2. length=8;
        System.out.println(rope1.length);
    }

}
class Roper{
    public static int length=0;
}
