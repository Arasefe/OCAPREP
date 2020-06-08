package _22AbstractClass;

import jdk.swing.interop.SwingInterOpUtils;

public abstract class Monkey {
    int tailLength=1;
    private void socialize(){
        System.out.println("Monkey is socializing");
    }
    public abstract void eat();
    public abstract int sleep();
    public abstract double rest();
    public static void care(){
        System.out.println("Monkey cares for each other");
    }
}
class Mandrill extends Monkey{
    int tailLength=2;
    private int socialize(){
        System.out.println("Mandrill is socializing all day");
        return 1;
    }
    public void eat(){
        System.out.println("Mandrill eats 3 meals a day");
    }
    public int sleep(){
        System.out.println("Mandrill sleeps 8 hours a day");
        return 8;
    }
    public double rest(){
        System.out.println("Mandrill rests just 2 hours a day");
        return 2;
    }
    public static void care(){
        System.out.println("Mandrill care only itself");
    }

    public static void main(String[] args) {
        Monkey monkey=new Mandrill();
        System.out.println(monkey.tailLength);              //1
        System.out.println(monkey.rest());                  //Mandrill rests just 2 hours a day
        System.out.println(monkey.sleep());                 //Mandrill sleeps 8 hours a day
        monkey.eat();                                       //Mandrill eats 3 meals a day
        Monkey.care();                                      //Monkey cares for each other

        Mandrill mandrill=new Mandrill();
        System.out.println(mandrill.tailLength);            //2
        System.out.println(mandrill.rest());                //Mandrill rests just 2 hours a day
        System.out.println(mandrill.sleep());               //Mandrill sleeps 8 hours a day
        System.out.println(mandrill.socialize());           //Mandrill is socializing all day
        mandrill.eat();                                     //Mandrill eats 3 meals a day
        Mandrill.care();                                    //Mandrill care only itself
    }
}
