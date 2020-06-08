package _8.ArrayList.Equality;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Byte> list = new ArrayList<Byte>();            //

        System.out.println(list.get(0) == list.get(1));     // false
        System.out.println(list.get(2) == list.get(3));     // false
    }
}

