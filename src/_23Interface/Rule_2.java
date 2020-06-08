package _23Interface;

public abstract interface Rule_2 {
    public abstract void walk();                            //abstract method
}
abstract interface HogHunters{
     abstract int walk(int length);                   //Overloaded method Rule#2 Both implements
}
class Hunter implements Rule_2, HogHunters{
    public void walk(){
        System.out.println("Hunter is walking");
    }
    public int walk(int length){
        System.out.println("Hunter is walking" +length);
        return length;
    }

    public static void main(String[] args) {
        Hunter hunter=new Hunter();
        hunter.walk();                                      //Hunter is walking
        hunter.walk(24);                             //Hunter is walking 24
    }
}
