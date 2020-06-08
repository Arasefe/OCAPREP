package _11.TernaryOperator;

public class Baby {
    public static String play(int toy, int age){
        final String game;
        if (toy<2)
            game=age>1?"1":"10";
        else
            game=age>3?"Ball":"Swim";
        return game;
    }

    public static void main(String[] args) {
        System.out.println(play(5,2));
    }
}
