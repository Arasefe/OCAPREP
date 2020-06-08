package _8.ArrayList.Add;

import java.util.ArrayList;

public class _17AddBoolean {
    public static void main(String[] args) {
        addBoolean(new ArrayList<>(2));
    }
    public static void addBoolean(ArrayList<Boolean>list){
        list.add(new Boolean("tRuE"));           // true
        list.add(new Boolean("fAlSe"));          // false
        list.add(new Boolean("abc"));            // false
        list.add(null);                             // null
        list.add(new Boolean(null));             // false as it is considered String
        for(Boolean a:list){
            System.out.println(a);
        }
    }
}
