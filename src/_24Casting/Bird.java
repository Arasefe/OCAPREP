package _24Casting;

interface CanFly {
    public abstract void fly();
}
public class Bird implements CanFly{
    public void fly(){
        System.out.println("Bir can fly");
    }
    Bird bird=new Bird();
    CanFly canFly=bird;             //subclass to superclass does not need explicit cast

}


