package _21.Constructors;

public class Animal {
    private int age;
    private String name;
    public Animal(int age,String name){
        super();
        this.name=name;
    }
    public Animal(int age){
        super();
        this.age=age;
        this.name=null;

    }
}
class Gorilla extends Animal{
    public Gorilla(int age){
        super(age,"Gorilla");
    }
    public Gorilla(){
        super(5);
    }
}

