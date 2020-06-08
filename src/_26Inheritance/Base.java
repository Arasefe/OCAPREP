package _26Inheritance;

public class Base {
    void methodA(){
        System.out.println("base - Method A");
    }
}
class Sub extends Base{
    public void methodA(){
        System.out.println("sub- Method A");
    }
    public static void methodB(){
        System.out.println("sub - method B");
    }

    public static void main(String[] args) {
        Base b=new Sub();
        b.methodA();
        methodB();
    }
}
