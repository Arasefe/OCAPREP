package _2.LocalVariables;

public class InstanceCounter {
    private int count;                                          //default value 0
    public InstanceCounter() {                                  //constructor
        count++;                                                //0++;
    }

    public static void main(String[] args) {                    //main method
        InstanceCounter c1 = new InstanceCounter();
        InstanceCounter c2 = new InstanceCounter();
        InstanceCounter c3 = new InstanceCounter();
        System.out.println(c1.count);                           //1
        System.out.println(c2.count);                           //1
        System.out.println(c3.count);                           //1

    }
}