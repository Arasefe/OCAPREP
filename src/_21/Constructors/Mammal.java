package _21.Constructors;

public class Mammal {
    public Mammal(int age){
        System.out.println("Mammal");
    }

}
class Platypus extends Mammal{
    public Platypus(){
        super(5);
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
     Platypus platypus=new Platypus();
    }
}
