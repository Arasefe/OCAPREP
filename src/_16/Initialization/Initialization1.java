package _16.Initialization;

public class Initialization1 {
    static{                                     // 1st  2
        add(2);
    }
    static void add(int number){
        System.out.println(number+"");
    }
    Initialization1(){                          // 6th 5
        add(5);
    }
    static{                                     // 2nd 4
        add(4);
    }

    {
        add(6);                                 // 4th 6
    }
    static{
        new Initialization1();                  // 3rd but as it contains Constructor, instance initializer first then again
    }                                           // the instance initializer and constructor again (from this Constructor)

    {
        add(8);                                 // 5th 8
    }

    public static void main(String[] args) {
        new Initialization1();                  // Creates Constructor and Instance Initializer are activated
    }
}
