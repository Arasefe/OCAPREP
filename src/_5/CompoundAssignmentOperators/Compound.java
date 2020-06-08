package _5.CompoundAssignmentOperators;

public class Compound {
    public static void main(String[] args) {
        int x=2,z=3;
        x=x*z;
        System.out.println(x);
        x*=z;           // Compound assignment operator
        System.out.println(x);

        long y=10;
        int i=5;
        y=y*i;          // Simple assignment operator
        y*=i;
        //i=i*y;         DOES NOT COMPILE because it needs casting to long however it works if used compound assignment
        i*=y;


    }
}
