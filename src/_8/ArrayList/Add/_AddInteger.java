package _8.ArrayList.Add;

import java.util.ArrayList;

public class _AddInteger {
    public static void main(String[] args) {
        addInteger(new ArrayList<>(6));
    }
    public static void addInteger(ArrayList<Integer>list){
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));        //boolean remove (Object object)-->returns whether a match was removed
                                                    //E remove(int index)--> returns the element that actually removed
        list.remove(new Integer(200));
        System.out.println(list);                   // [100, 200]
    }
}
