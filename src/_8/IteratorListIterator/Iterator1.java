package _8.IteratorListIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        iteratorMethod(new ArrayList<Integer>(6));
    }

    public static void iteratorMethod(ArrayList<Integer> list) {
        list.add(2);
        list.add(4);
        list.add(2, 3);
        list.add(8);
        list.add(5);
        System.out.println(list);
        /**
         * I want to iterate at the same time remove the element of the list.
         * We can do this only by iterator and ListIterator
         */
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {     //iterator.hasNext() iterates until it becomes false
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }
        System.out.println(list);

    }
}
