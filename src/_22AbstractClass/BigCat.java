package _22AbstractClass;

 abstract class BigCat {
    public abstract String getName();
}
abstract class Tiger extends BigCat{
    public abstract void roar();
}
class Lion extends Tiger{
    public String getName(){
        return "Lion";

    }
    public void roar(){
        System.out.println(getName()+" is roaring");
    }

    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.getName();                             //Lion
        lion.roar();                                //Lion is roaring
    }
}
