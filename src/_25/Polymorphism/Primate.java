package _25.Polymorphism;

public class Primate {
    public boolean hasHair(){
        return true;
    }
}
abstract interface HasTail{
    public boolean isTailStriped();
    }
    class Lemur extends Primate implements HasTail{
        public int age=10;
    public boolean isTailStriped(){
        return false;
    }
        public static void main(String[] args) {
            Lemur lemur=new Lemur();
            System.out.println(lemur.age);                  //10

            HasTail hasTail=lemur;
            System.out.println(hasTail.isTailStriped());    //false

            Primate primate=lemur;
            System.out.println(primate.hasHair());          //true
        }
    }

