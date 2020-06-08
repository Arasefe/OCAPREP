package _8.ArrayList.ReferencingNull;

import java.util.ArrayList;

public class _23ReferencingNullArrayList {
    public static void main(String[] args) {
        arrayList(new ArrayList<>(3));
    }
    public static void arrayList(ArrayList<String>list) {
//        list.add(null);
//        list.add(null);
//        list.add(null);
//        list.add("null");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.remove(0) + ":" + list.remove(null));
//        }
        System.out.println(list.size());
        list.add("Tulpar");
        System.out.println(list.size());
        list.set(1,"Aras");
        System.out.println(list);
    }
}

