package _2.LocalVariables;

public class Boolean1 {
    public static void main(String[] args) {
        boolean b;
        boolean isCustomerOverEighteen=true;
        if(isCustomerOverEighteen==true){
            System.out.println("Welcome to The Public");
        }
        else{
            System.out.println("You are under 18 and not allowed to enter the club");
        }
       // System.out.println(b); Variable 'b' might not have been initialized because it is local variable
    }
}
