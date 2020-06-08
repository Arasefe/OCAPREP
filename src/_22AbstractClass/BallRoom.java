package _22AbstractClass;
abstract class House{
    protected abstract Object getSpace();       // abstract method
}
abstract class Room extends House{
    abstract Object getSpace(Object list);      //method overloading
}
public abstract class BallRoom extends House{
    protected abstract Object getSpace();

    public static void main(String[] args) {
        System.out.println("Let's start the party");
    }
}
