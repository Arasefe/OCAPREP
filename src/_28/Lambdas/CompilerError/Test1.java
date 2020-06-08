package _28.Lambdas.CompilerError;

import java.util.function.Predicate;

public class Test1 {
    /*
    Predicate pr1 = s -> s.length() < 4;
    Predicate is considered of Object type so variable "s" is of Object type
    and Object class doesn't have length() method.
     */
        public static void main(String[] args) {
            String [] arr = {"*", "**", "***", "****", "*****"};
           // Predicate pr1 = s -> s.length() < 4;
           // print(arr, pr1);
        }

        private static void print(String [] arr, Predicate<String> predicate) {
            for(String str : arr) {
                if(predicate.test(str)) {
                    System.out.println(str);
                }
            }
        }
    }
