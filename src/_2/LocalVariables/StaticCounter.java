package _2.LocalVariables;

public class StaticCounter {
    private static int count; 			                    //default value 0
    public StaticCounter() { count++; } 		            //constructor
    public static void main(String[] args) {                //main method
        StaticCounter c1 = new StaticCounter();             //increments to 1
        StaticCounter c2 = new StaticCounter();             //increments to 2
        StaticCounter c3 = new StaticCounter();             //increments to 3
        System.out.println(StaticCounter.count);            //3
    }
    }
