package _23Interface;

public interface Hop {
    static int getJumpHeight(){
        return 8;
    }
    interface Jumper{
        static int getJumpHeight(){
            return 12;
        }

    }
    class BasketballPlayer implements Hop,Jumper{
        public static void main(String[] args) {
            System.out.println(Hop.getJumpHeight());            //8
            System.out.println(Jumper.getJumpHeight());         //12
        }
    }
}
