package _3.UnderstandingNull;

public class UnderstandingNull {
    static Object myObject = new Object();
    static Object myOtherObject;                    // sets to default value of null
    static String myString;                         // sets to default value of null

    public static void main(String[] args) {
        Object myLocalObject = new Object();        // myLocalObject is instantiated
        Object anotherLocalObject;                  // anotherLocalObject does not get initialized with null
        String name = "Java";                       //
        String anotherName = null;                  // anotherName is initialized with value null

        System.out.println("myObject= " + myObject);
        System.out.println("myOtherObject= " + myOtherObject);
        System.out.println("myStringObject= "+ myString);

        System.out.println("myLocalObject= " + myLocalObject);
        //System.out.println("anotherLocalObject= " + anotherLocalObject); //DOES NOT COMPILE
        System.out.println("name= " + name);
        System.out.println("anotherName= " + anotherName);

        myString = "JAVA";
        System.out.println("myString= " + myString);
        myString.toLowerCase();

        System.out.println("myString= " + myString);
    }
}
