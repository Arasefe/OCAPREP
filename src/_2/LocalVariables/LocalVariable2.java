package _2.LocalVariables;

public class LocalVariable2 {
    public int valid(){
        int y=10;
        int x;
        x=3;
        int reply=y+x;
        System.out.println(reply);
        return reply;
    }

    public static void main(String[] args) {
        LocalVariable2 lb=new LocalVariable2();
        lb.valid();
    }
}
