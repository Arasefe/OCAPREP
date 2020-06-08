package _15.MethodOverloading;

public class Plane {
        public void fly(int i) {
            System.out.print("int ");
        }
        public void fly(long l) {
            System.out.print("long ");
        }
        public static void main(String[] args) {
            Plane p = new Plane();
            p.fly(123); 						    //int 123 exact match
            p.fly(123L); 						//long 123 exact match
        }
}


