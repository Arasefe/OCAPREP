package _8.ArrayList.Decleration;

import java.util.ArrayList;
import java.util.List;

public class Bunny {
    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("Long Ear");
        bunnies.add("Floppy");
        bunnies.add("Lappy");
        bunnies.add("Shaggy");
        bunnies.add("Johny");
        bunnies.add("Greasy");

        System.out.println(bunnies);                    // print ArrayList elements
        System.out.println(bunnies.size());             // ArrayList number of elements

        OUTER_LOOP:
        for (String bunny : bunnies) {
            INNER_LOOP:
            for (int i = 0; i < bunny.length(); i++) {
                if (bunny.charAt(0) == 'L') {
                    continue OUTER_LOOP;
                }
            }
            System.out.println(bunny);
        }
    }
}