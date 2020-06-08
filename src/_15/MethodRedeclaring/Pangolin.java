package _15.MethodRedeclaring;

public class Pangolin {
    int tailLength=1;
     void walk(){
        System.out.println("Pangolin is walking");
    }
    static void run(){
        System.out.println("Pangolin is running");
    }

}
class Manidae extends Pangolin{
    int tailLength=2;
     void walk(){
        System.out.println("Manidae is walking");
    }
    public static void run(){
        System.out.println("Manidae is running");
    }

    public static void main(String[] args) {
        Pangolin pangolin=new Pangolin();
        System.out.println(pangolin.tailLength);
        pangolin.walk();
        Pangolin.run();

        Manidae manidae=new Manidae();
        System.out.println(manidae.tailLength);
        manidae.walk();
        Manidae.run();
    }
}
