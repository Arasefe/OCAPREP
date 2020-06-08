package _15.VariableHiding;

public class Rodent {
    protected int tailLength=4;                             //variable
    public void getRodentDetails(){
        System.out.println("[parentTail="+tailLength+"]");
    }
}
class Mouse extends Rodent{
    protected int tailLength=8;                             //variable hiding
    public void getMouseDetails(){
        System.out.println("[tail="+tailLength+", parentTail="+super.tailLength+"]");
    }

    public static void main(String[] args) {
        Mouse mouse=new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();

    }
}
