package _15.MethodOverloading;

public class Primitives {
        public static void play(Long l) { }
        public static void play(Long... l) { }
        public static void play(Object o){}
        public static void main(String[] args) {
            play(4); 						    // calls Object
            play(4L); 						    // calls the Long version
        }
    }


