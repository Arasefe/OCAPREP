package _15.MethodHiding;

public class Bear {
    public static void eat(){
        System.out.println("Bear is eating");
    }
}
class Panda extends Bear{
    public static void eat(){
        System.out.println("Panda is eating");
    }

    public static void main(String[] args) {

        Panda.eat();                            //static method is called with class name
        Bear.eat();
    }
}
