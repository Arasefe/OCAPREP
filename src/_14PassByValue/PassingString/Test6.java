package _14PassByValue.PassingString;

public class Test6 {
    public static void main(String[] args) {        //CALLER
        String name="Webby";                        // A copy of String name is made passed ("Webby");
        speak(name);                                // Sparky
        talk(name);                                 // Webby
        chat(name);                                 // Shaggy
        System.out.println(name);                   // Webby
    }
    public static void speak(String name){          //Assignments made in the method do not affect the caller
        name="Sparky";
        System.out.println(name);                   // Sparky
    }
    public static void talk(String name){

        System.out.println(name);                   //Webby
    }
    public static void chat(String name){
        name="Shaggy";
        System.out.println(name);                   //Shaggy

    }
}
