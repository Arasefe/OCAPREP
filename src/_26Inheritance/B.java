package _26Inheritance;

public class B extends A {
    public void print() {
        A obj = new A();
        System.out.println(obj.i1);             //Line 8
        System.out.println(i2);                 //Line 9 System.out.println(obj.i2); causes compilation error
        System.out.println(this.i2);            //Line 10
        System.out.println(super.i2);           //Line 11
    }

    public static void main(String [] args) {
        new B().print();
    }
}
