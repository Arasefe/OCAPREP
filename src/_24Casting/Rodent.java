package _24Casting;

public class Rodent {
    public void antagonize(){
        System.out.println("The rodent antagonize environment");
    }
}
class Capybara extends Rodent{
    public void antagonize(){
        System.out.println("The capybara antagonize environment so bad");
    }

    public static void main(String[] args) {
        Rodent rodent=new Capybara();        //subclass to superclass does not need explicit cast
        Capybara capybara=(Capybara) rodent; //Throws ClassCastException
        capybara.antagonize();
    }
}

