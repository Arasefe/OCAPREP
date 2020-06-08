package _15.VariableHiding;

public class Animal {
    public int length=2;                                //variable length

}
class JellyFish extends Animal{
    public int length=5;                                //variable length

    public static void main(String[] args) {
        JellyFish jellyFish=new JellyFish();
        Animal animal=new JellyFish();
        System.out.println(jellyFish.length);           //5
        System.out.println(animal.length);              //2
    }
}
