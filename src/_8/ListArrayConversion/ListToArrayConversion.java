package _8.ListArrayConversion;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayConversion {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object[] namesArray = names.toArray();                                  //List to Object
        System.out.println("Object length "+namesArray.length);                 //

        String[] stringArray = names.toArray(new String[0]);                    // Convert Array to fixed sized String

        String[] anotherStringArray = names.toArray(new String[names.size()]);  // Convert Array to  sized String as Array
        System.out.println(anotherStringArray.length);
    }

}

