package _14PassByValue.PassingPrimitive;

public class Test1 {
    public static void main(String[] args) {
        int number=4;                                   // Copy of int number is created
        System.out.println("Number = "+ number);        // Number = 4
        passIntToMethod(number);
        System.out.println("Number = "+ number);        // Number = 4
    }
    public static void passIntToMethod(int number){     // Copy of int number is passed to method
        System.out.println("In newNumber "+ number);    // 4 is printed
        number=10;                                      // Copy of int number is set to 10
        System.out.println("In newNumber "+ number);    // 10 is printed
    }

}
