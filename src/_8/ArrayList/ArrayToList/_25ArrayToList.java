package _8.ArrayList.ArrayToList;

import java.util.Arrays;
import java.util.List;

public class _25ArrayToList {
    public static void main(String[] args) {

    }
    public static void arrayToList(){
        List<String> drinks = Arrays.asList("can", "cup");
        for (int i = drinks.size(); i > 0; i++) {
            System.out.println(drinks.get(i - 1) + ",");
        }
    }
}
