package _8.PrimitivesWrappers;

public class PrimitivesWrapper1 {
    public static void methodWrapper(){
        int myValue=12;
        Integer mySecondValue=Integer.valueOf("4");
        System.out.println("My Second Value from valueOf(String) is " +mySecondValue);
        mySecondValue=Integer.valueOf(new Integer(24));
        System.out.println("My Second Value from valueOf(new Integer(int)) is " +mySecondValue);
        mySecondValue=Integer.parseInt("47");
        System.out.println("My Second Value from parseInt(String) is " +mySecondValue);
        mySecondValue=20;
        System.out.println("My Second Value is " + mySecondValue);
        mySecondValue=null;
        System.out.println("My Second Value from null is " + mySecondValue);



    }

    public static void main(String[] args) {
        methodWrapper();
    }
}
