package _2.VariableScope;


public class VariableScope1 {
    public void eat(int pieceOfCheese){
        int bitesOfCheese=1;
        int result=pieceOfCheese-bitesOfCheese;
        System.out.println(result);
    }

    public static void main(String[] args) {
        VariableScope1 vs=new VariableScope1();
        vs.eat(12);
    }

}
