package _8.IteratorListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator3 {
    /*
    If you want to remove the items from ArrayList, while using Iterator or ListIterator,
    then use Iterator.remove() or ListIterator.remove() method and NOT List.remove(...) method.
    Using List.remove(...) method while iterating the list (using the Iterator/ListIterator or for-each)
    may throw java.util.ConcurrentModificationException.
     */
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> iterator = dryFruits.iterator();
        while (iterator.hasNext()) {
            String dryFruit = iterator.next();
            if (dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);         // must be Iterator.remove() or ListIterator.remove()
            }
        }

        System.out.println(dryFruits);
    }
}
