package _11.SwitchStatements;

public class Test4 {
    public static void main(String[] args) {
        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
        switch (fruit) {

            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
    }
}
