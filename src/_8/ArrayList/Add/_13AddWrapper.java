package _8.ArrayList.Add;

import java.util.ArrayList;
import java.util.List;

public class _13AddWrapper {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);                         //true
        list.add(new Boolean("tRue"));       //false
        list.add(new Boolean("abc"));        //false

        if(list.remove(1)) {
            list.remove(1);
        }

        System.out.println(list);
    }
}
