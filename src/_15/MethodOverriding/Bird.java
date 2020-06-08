package _15.MethodOverriding;

public class Bird {
    protected void fly(){
        System.out.println("Bird is flying");
    }
    private void eat(){
        System.out.println("Bird is eating ");
    }
}
class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle is flying");
    }
    void eat(){
        System.out.println("Eagle is eating");
    }

    public static void main(String[] args) {
       Bird bird=new Eagle();
       bird.fly();
       Eagle eagle=new Eagle();
       eagle.eat();
    }
}
