package _3.AbbreviatingOperators;
public class Challenge {
    public static void main(String[] args) {
        double myDoubleValue=20.00;
        double myDoubleValue2=80.00;
        double result=(myDoubleValue+myDoubleValue2)*100.00;    //200
        double myRemainder=result%40;                           //0
        boolean myBooleanValue;
        myBooleanValue=(myRemainder==0)?true:false;
        System.out.println(myBooleanValue);
        if (myBooleanValue==false){
            System.out.println("Got some remainder");
        }
    }
}
