package _15.VariableHiding;

public class Elephant {
    protected int teethLength=12;
    public void getElephantDetails(){
        System.out.println("[Teeth size is:" + teethLength+ "long]");
    }
}
class SumatranElephant extends Elephant{
    protected int teethLength=14;
    public void getSumatranElephantDetails(){
        System.out.println("[Size is :"+teethLength + "and Parent Teeth size is: "+super.teethLength+"long]");
    }

    public static void main(String[] args) {
        Elephant elephant=new Elephant();
        System.out.println(elephant.teethLength);           //12
        elephant.getElephantDetails();                      //[Teeth size is 12 long]
        SumatranElephant sumatranElephant=new SumatranElephant();
        System.out.println(sumatranElephant.teethLength);   //14
        sumatranElephant.getSumatranElephantDetails();      //[Size is 14 and Parent Teeth size is 12 long]
    }

}
