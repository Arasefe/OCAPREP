package _8.ArrayList.Remove;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Hawk");
        list.add("Robin");
        list.add("Blue Jay");
        list.add("Cardinal");
        System.out.println(list.add("Peacock"));
        System.out.println(list);

        System.out.println(list.remove("Howk"));
        System.out.println(list.remove("Cardinal"));
        System.out.println(list);
    }

}
