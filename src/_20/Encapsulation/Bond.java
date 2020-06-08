package _20.Encapsulation;

public class Bond {
    private  int price=5;
    public boolean sell(){
        if (price<10){
            price++;
            return true;
        }else if(price>=10){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        new Bond().sell();
        new Bond().sell();
        new Bond().sell();
        new Bond().sell();

        System.out.println(new Bond().price);
        System.out.println(new Bond().price);
        System.out.println(new Bond().price);
        System.out.println(new Bond().price);



    }
}
