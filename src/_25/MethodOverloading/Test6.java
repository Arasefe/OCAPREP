package _25.MethodOverloading;

public class Test6 {
        public static void main(String[] args) {
            m(1);
        }

        private static void m(Object obj) {
            System.out.println("Object version");
        }

        private static void m(Number obj) {
            System.out.println("Number version");
        }

        private static void m(Double obj) {
            System.out.println("Double version");
        }
    }

