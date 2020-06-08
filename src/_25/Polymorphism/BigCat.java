package _25.Polymorphism;

public class BigCat {
    public String getName(){
        return "BigCat";
    }
    public int eat(){
        return 1;
    }
}
class Lion extends BigCat{
    public String getName(){
        return "Lion";
    }
    public int eat(){
        return 2;
    }
}
class Tiger extends BigCat{
    public String getName(){
        return "Tiger";
    }
    public int eat(){
        return 3;
    }
}
class CatTrainer extends BigCat{
    public static void feed(BigCat bigCat){
        System.out.println("Feeding :"+ bigCat.getName());
    }

    public static void main(String[] args) {
        CatTrainer.feed(new BigCat());
        CatTrainer.feed(new Tiger());
        CatTrainer.feed(new Lion());
        feed(new BigCat());
        feed(new Tiger());
        feed(new Lion());
        System.out.println(new BigCat().eat());
        System.out.println(new Tiger().eat());
        System.out.println(new Lion().eat());

    }
}
