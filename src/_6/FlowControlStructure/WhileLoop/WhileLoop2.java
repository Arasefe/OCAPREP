package _6.FlowControlStructure.WhileLoop;

public class WhileLoop2 {
    public static void main(String[] args) {
        final boolean flag = false;
        while(!flag) {                              // while(flag) --> unreachable statement
            System.out.println("Good Morning!");
        }
    }
}
