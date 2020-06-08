package _2.InstanceVariables;

public class InstanceVariable2 {
    int y=10;
    int x;                      //default value 0
    int reply=x+y;
    public int notValid(){
        int y=12;
        int x;
        System.out.println(reply);
        return reply;
    }

    public static void main(String[] args) {
        InstanceVariable2 lb=new InstanceVariable2();
        lb.notValid();
    }
}
