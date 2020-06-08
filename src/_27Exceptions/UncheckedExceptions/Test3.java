package _27Exceptions.UncheckedExceptions;

public class Test3 {
    public static void main(String[] args) {
        int x=10,y=20;
        int dx, dy;
        try{
            dx=x%5;
            dy=y/dx;

        }catch (ArithmeticException ae){
            System.out.println("caught AE");
            dx=2;
            dy=y/dx;
        }
        x=x/dx;
        y=y/dy;
        System.out.println(dx+""+dy);
        System.out.println(x+""+y);
    }
}
