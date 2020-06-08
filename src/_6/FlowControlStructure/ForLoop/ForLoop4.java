package _6.FlowControlStructure.ForLoop;

public class ForLoop4 {
    public static void main(String[] args) {
        int i,j;
        for(i=0,j=0;j<i;++j,i++){
            System.out.println(i + " " +j);
        }
        System.out.println(i + " " + j);
    }
}
