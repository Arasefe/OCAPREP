package _8.ArrayList.Exception;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        for(String dryFruit : dryFruits) {          // You can not iterate the loop and remove with for Loop.
            if(dryFruit.startsWith("A")) {          // ConcurrentModificationException
                dryFruits.remove(dryFruit);
            }
        }

        System.out.println(dryFruits);
    }
}
