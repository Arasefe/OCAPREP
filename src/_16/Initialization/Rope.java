package _16.Initialization;

public class Rope {
    public static void swing(){
        System.out.println("swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public  void play(){
        swing();
        climb();
    }

    public static void main(String[] args) {
        Rope rope=new Rope();
        rope.play();
        Rope rope2=null;
        rope2.play();
    }
}
