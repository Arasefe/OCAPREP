package _15.MethodHiding;

public abstract class Bird {
    private void fly(){
        System.out.println("Bird is flying");
    }
}
class Pelican extends Bird{
    protected void fly(){
        System.out.println("Pelican is flying");
    }

    public static void main(String[] args) {
        Pelican pelican=new Pelican();
        pelican.fly();
    }
}
