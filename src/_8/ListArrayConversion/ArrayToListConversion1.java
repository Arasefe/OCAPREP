package _8.ListArrayConversion;

import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion1 {

        public static void main(String[] args) {


            String[] petsArray = {"dog", "cat", "parrot"};

            List<String> petsList = Arrays.asList(petsArray);                       // returns fixed size list
            System.out.println("List size: " +petsList.size());                     // returns List size()
            System.out.println("Array length:" +petsArray.length);                  // returns Array length

            petsList.set(0, "bird");
            System.out.println("List Elements"+petsList);                           // returns List elements
            System.out.println("Array elements"+Arrays.toString(petsArray));        // returns Arrays Elements

            petsArray[0] = "husky";                                                 // set the first element of Array to "husky"
            System.out.println("List Elements" +petsList);                          // returns List elements
            System.out.println("Array Elements "+Arrays.toString(petsArray));       // returns Arrays Elements

            // Exception in thread "main" java.lang.UnsupportedOperationException
            petsList.add("newDog");                                                 // As this List is fixed size and can not be added or removed
            petsList.remove(1);                                               // As this List is fixed size and can not be added or removed


        }
    }

