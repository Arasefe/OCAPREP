package _8.ArrayList.ArrayToList;

import java.util.ArrayList;
import java.util.List;

public class _26AddString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));   // IndexOutOfBoundsException


        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove(new Integer(2));                                // trafficLight.remove(Object)

        System.out.println(trafficLight);                                         // IndexOutOfBoundsException


    }
}



