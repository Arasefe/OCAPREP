package _21.Constructors;

public class Changer {
    private int myValue=0;
    public void showOne(int myValue){
        myValue=myValue;
    }
    public void showTwo(int myValue){
        this.myValue=myValue;
    }

    public static void main(String[] args) {
        Changer c=new Changer();
        c.showOne(100);
        System.out.println(c.myValue);
        c.showTwo(200);
        System.out.println(c.myValue);
    }
}
