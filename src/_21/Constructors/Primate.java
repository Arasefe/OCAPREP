package _21.Constructors;


public class Primate {
    public Primate(){
        System.out.println("Primate");
    }
}
class Ape extends Primate{
    public Ape(){
        super();
        System.out.println("Ape");
    }
}
 class Chimpanzee extends Ape{
    public Chimpanzee(){
        super();
        System.out.println("Chimpanzee");
    }
    public static void main(String[] args) {
       // Be wary of the Object and print method in main method
        new Chimpanzee();
        System.out.println("ch");
    }
}
