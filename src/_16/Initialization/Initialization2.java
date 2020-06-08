package _16.Initialization;

public class Initialization2 {
    static{
        method(2);                          // 1st 2
    }
    {
        method(3);                          // 4th 3
    }
    Initialization2(){                          // 6th  1st Constructor
        System.out.println("1st Constructor");
    }
    public static void method(int number){
        System.out.println(number+"");
    }
    static{
        method(4);                          // 2nd 4
    }
    static{
        new Initialization2();                 // 3rd  wait then after all 3 5 1st Constructor
    }
    {
        method(5);                          // 5th 5
    }

    public static void main(String[] args) {        // 2 4 3 5 1st Constructor 3 5 1st Constructor
            new Initialization2();
    }
}
