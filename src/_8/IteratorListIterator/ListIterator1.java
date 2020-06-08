package _8.IteratorListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterator1<S> {
    public static void main(String[] args) {
        listIterator();
    }
    public static void listIterator(){
        List<String>list=new ArrayList<>(6);
        list.addAll(Arrays.asList("Aras","Tulpar","Efe","Ege"));
    }
}
