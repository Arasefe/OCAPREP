package _22AbstractClass;

public abstract class Turtle {
    protected int age=120;                                                              //variable
    public abstract void swim();                                                        //abstract method
    public abstract int getAge();                                                       //abstract method
    private int walk(int speed){                                                        //private method
        return speed;
    }
    protected static void relax(){                                                      //static method
        System.out.println("Turtle relax all day");
    }
}
 class AnatolianTurtle extends Turtle{
    protected int age=100;                                                              //variable hiding
    public void swim(){
        System.out.println("Anatolian Turtle is swimming");
    }
    public int getAge(){
        System.out.println("Anatolian Turtle is "+this.age + " years old");
        return age;
    }
    private int walk(int speed){                                                        //private method redeclaration
        System.out.println("Anatolian Turtle is walking " + speed + " miles per hour");
        return speed;
    }
    public static void relax(){                                                         //static method hiding
        System.out.println("Anatolian Turtle relax half of the day");
    }

    public static void main(String[] args) {
        Turtle turtle=new AnatolianTurtle();
        System.out.println(turtle.age);                 //120
        Turtle.relax();                                 //Turtle relax all day
        System.out.println(turtle.getAge());            //Anatolian Turtle is 100 years old
        turtle.swim();                                  //Anatolian Turtle is swimming

        AnatolianTurtle anatolianTurtle=new AnatolianTurtle();
        System.out.println(anatolianTurtle.age);        //100
        AnatolianTurtle.relax();                        //Anatolian Turtle relax half of the day
        anatolianTurtle.getAge();                       //Anatolian Turtle is 100 years old
        anatolianTurtle.swim();                         //Anatolian Turtle is swimming
        anatolianTurtle.walk(5);                 //Anatolian Turtle is walking 5 miles per hour
    }
}
