package _8.ArrayList.Add;

import java.util.ArrayList;
import java.util.List;

public class _18AddBoolean {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(null);
        list.add(new Boolean("truE"));
        list.add(new Boolean("tRuE"));
        list.add(new Boolean("abs"));
        list.add(Boolean.FALSE);              // [true false null true true false false ]

        if (list.remove(3)) {           // boolean remove (Object object)-->returns whether a match was removed
            list.remove(3);             // E remove(int index)--> returns the element that actually removed
        }

        System.out.println(list);             // [true false null false false ]
    }
}




