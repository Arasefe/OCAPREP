package _3.CloseCircuitOperators;

public class Test2 {
    public static void main(String [] args) {
        int a = 3;
        boolean res ;
        res = --a == 2 || ++a == 2 && --a == 2;
        System.out.println(a);
    }
}
