package _25.MethodOverriding;

    public class Test {             // String class is final so can not be extended
        @Override
        public String toString() {
            return "TEST";
        }

        public static void main(String[] args) {
            Test obj = new Test();
            System.out.println(obj);
        }
    }

