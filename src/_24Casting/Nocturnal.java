package _24Casting;

public interface Nocturnal {
    default boolean isBlind() {                 //default interface method
        return true;
    }

    class Owl implements Nocturnal {
        public boolean isBlind() {              //method overriding
            return false;
        }

        public static void main(String[] args) {
            Nocturnal nocturnal = (Nocturnal) new Owl();
            System.out.println(nocturnal.isBlind());

        }
    }
}
