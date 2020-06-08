package _17.WrapperClass;

class Main {
    public static void main(String args[]) {
        Wrapper1.MyClass course = new Wrapper1.MyClass();
        char c = 10;
        course.print(c);
        course.print("Object");
    }
}

class Wrapper1 {
    static class MyClass {
        void print(long duration) {
            System.out.println("long");
        }

        void print(int duration) {
            System.out.println("int");
        }

        void print(String s) {
            System.out.println("String");
        }

        void print(Object o) {
            System.out.println("Object");
        }
    }
}


