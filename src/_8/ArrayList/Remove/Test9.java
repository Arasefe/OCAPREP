package _8.ArrayList.Remove;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
        public static void main(String[] args) {
            List<StringBuilder> dryFruits = new ArrayList<>();
            dryFruits.add(new StringBuilder("Walnut"));
            dryFruits.add(new StringBuilder("Apricot"));
            dryFruits.add(new StringBuilder("Almond"));
            dryFruits.add(new StringBuilder("Date"));

            for(int i = 0; i < dryFruits.size(); i++) {
                if(i == 0) {
                    dryFruits.remove(new StringBuilder("Almond"));
                }
            }
            System.out.println(dryFruits);
        }
    }

