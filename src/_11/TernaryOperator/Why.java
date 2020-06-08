package _11.TernaryOperator;

public class Why {
    public static void main(String[] args) {
        int x=10,y=5;
        boolean w=true,z=false;
        x=w?y++:y--;    //x=5,y=6
        w=!z;
        System.out.println((x+y)+""+(w?5:10));
    }
}
