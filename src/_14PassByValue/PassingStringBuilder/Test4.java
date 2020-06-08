package _14PassByValue.PassingStringBuilder;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder();
        name.append("12");
        speak(name);
        System.out.println(name);           //12Webby
    }
    public static void speak(StringBuilder s){
        s.append("Webby");
    }
}
