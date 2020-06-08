package _14PassByValue.PassingStringBuilder;

public class Test3 {
    public static void speak(StringBuilder s){
        s.append("Webby");
        System.out.println(s);
    }
    public static void  talk(StringBuilder s){
        System.out.println(s);
    }
    public static void chat(StringBuilder s){
        s.append("123");
        System.out.println(s);
    }

    public static void main(String[] args) {            //CALLER
        StringBuilder name=new StringBuilder("Charming");
        speak(name);                                    // A copy of StringBuilder name is created and passed to speak(StringBuilder s)
        talk(name);
        chat(name);
        System.out.println(name);

    }
}
