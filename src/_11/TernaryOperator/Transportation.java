package _11.TernaryOperator;

public class Transportation {
    public static String travel(int distance){
        return distance<1000?"train":"10";      //the right side of the operation must be same date type when assigning

    }

    public static void main(String[] args) {
        System.out.println(travel(500));
    }
}
