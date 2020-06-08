package _11.SwitchStatements;

public class Test5 {
    public static void main(String[] args) {
        byte x=12;
        switch (x){
            case 'b':
                System.out.println("Byte in switch");
            default:
            case -2:
                System.out.println("Byte ");
            case 12:
                System.out.println("Got you");
        }

    }
}
