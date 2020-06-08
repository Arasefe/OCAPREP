package _23Interface;

public abstract interface Rule_3 {
    public abstract void sleep();               //abstract method

}
abstract interface Runner{
    public abstract int sleep();                //abstract method with the same signature but different return type
}
//class Human implements Rule_3,Runner {        //code does not compile
//}
