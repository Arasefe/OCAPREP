package _14PassByValue.PassingString;

public class Test5 {
    public static void main(String[] args) {
        String name="Jerry";
        System.out.println("Name = "+ name);
        newName(name);
        System.out.println("Name = "+ name);
    }
    public static void newName(String name){
        System.out.println("In newName name = "+ name);
        name="Tommy";
        System.out.println("In newName name = "+ name);
    }
}
