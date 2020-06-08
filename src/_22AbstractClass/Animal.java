package _22AbstractClass;

public abstract class Animal {
    public abstract String getName();

}
class Bird extends Animal{
    int wingSpan=1;
    public String getName(){                        //method
        System.out.println("Bird");
        return "Bird";
    }
    public void getBirdDetails(){
        System.out.println("["+getName()+ " has "+ wingSpan+ "m long wing]");
    }

}
class Flamingo extends Bird{
    int wingSpan=2;
    public String getName(){                        //method overriding
        System.out.println("Flamingo");
        return "Flamingo";
    }
    public void getFlamingoDetails(){
        System.out.println("["+getName()+ "has "+ wingSpan+ "m long wing]");
    }

    public static void main(String[] args) {
        Bird bird=new Flamingo();
        bird.getName();                             //Flamingo
        System.out.println(bird.wingSpan);          //1
        bird.getBirdDetails();                      //Flamingo has 1 m long wing
    }
}
