package _1.RandomClass;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        randomMethod();

    }

    public static void randomMethod() {
        Random r = new Random();
        boolean flag = false;
        while (!false) {
            int random = r.nextInt(7);

            if (random == 6) {
                System.out.println("dubarra");
                break;
            } else {
                System.out.println("take your chance one more time");
            }
        }
    }
}
