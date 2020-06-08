package _28.Lambdas.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Bunny {
    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("Long ear");
        bunnies.add("Floppy");
        bunnies.add("Hoppy");
        bunnies.add("Shaggy");
        bunnies.add("Jonny");
        bunnies.add("Greasy");

        System.out.println("bunnies before Lambda "+bunnies);
        bunnies.removeIf(s -> s.charAt(0)=='H');
        System.out.println("bunnies after Lambda "+bunnies);
        bunnies.removeIf((String s) -> s.startsWith("S"));
        System.out.println("bunnies after second Lambda"+bunnies);
    }
}
