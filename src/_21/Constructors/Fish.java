package _21.Constructors;

public class Fish {
    protected int size;
    private int age;
    public Fish(int age) { 			    //one parameter constructor
        this.age = age; 				//implicit super() calling from java.lang.Object
    }
    public int getAge() {
        return age;
    } }
 class Shark extends Fish {
    private int numberOfFins = 8;
    public Shark(int age) { 			//one parameter constructor
        super(age);					    //calling Fish class one parameter constructor 
        this.size = 4;
    }
    public void displaySharkDetails() {
        System.out.print("Shark with age: "+getAge());
        System.out.print(" and "+size+" meters long");
        System.out.print(" with "+numberOfFins+" fins");
    }

     public static void main(String[] args) {
         new Shark(5).displaySharkDetails();
     }
}
