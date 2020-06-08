package _23Interface;

interface Herbivore {
    public abstract void eatPlants();            //Abstract method
}
interface Omnivore{
    public abstract void eatPlants();           //Same abstract method Multiple inheritance Rule#1
    public abstract int eatMeat();
}
class Bear implements Herbivore, Omnivore{
    public void eatPlants(){
        System.out.println("Bear is eating plants");

    }
    public int eatMeat(){
        System.out.println("Bear is eating meat");
        return 2;
    }

    public static void main(String[] args) {
        Bear bear=new Bear();
        bear.eatMeat();                         //Bear is eating meat
        bear.eatPlants();                       //Bear is eating plants
    }
}
