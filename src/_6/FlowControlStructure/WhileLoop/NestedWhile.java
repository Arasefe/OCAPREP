package _6.FlowControlStructure.WhileLoop;

public class NestedWhile {
    public static void main(String[] args) {
        int x=8;
        while(x>0){
            do{
                x-=1;
            }while(x>4);
            x--;
            System.out.println(x);
        }

    }
}
