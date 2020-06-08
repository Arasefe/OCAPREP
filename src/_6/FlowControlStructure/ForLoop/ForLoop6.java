package _6.FlowControlStructure.ForLoop;

public class ForLoop6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i = i++) {
            i = i++;
            count++;
            System.out.println(count + " Hello world");
        }
    }
}
