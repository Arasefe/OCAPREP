package _25.Polymorphism;

public class Horse extends Animal {
    public Horse(){
        super(3);
        System.out.println("Horse");
    }

    public static void main(String[] args) {
        new Animal(5);
    }
}
