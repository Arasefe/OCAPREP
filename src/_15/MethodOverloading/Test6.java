package _15.MethodOverloading;

public class Test6 {
        public static void main(String[] args) {
            m1(null);               // null is treated as String
        }

        static void m1(CharSequence s) {
            System.out.println("CharSequence");
        }

//        static void m1(String s) {
//            System.out.println("String");
//        }

        static void m1(Object s) {
            System.out.println("Object");
        }

        static void m1(int i){
            System.out.println("int");
        }

//        static void m1(Integer I){
//            System.out.println("Integer");
//        }
        static void m1(){

        }
    }

