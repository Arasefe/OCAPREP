package _1.MainMethod;

public class Guest {
     public static void main(String[] args) {
        Message.main(args);
    }
}

class Message {
    static void main(String[] args) {
        System.out.println("Welcome! " + args[1]);
    }
}
