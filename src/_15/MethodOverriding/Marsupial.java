package _15.MethodOverriding;

public class Marsupial {
    public boolean isBiped(){                                       //instance method
        return false;
    }
    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on two legs "+ isBiped());
    }
}
class Kangaroo extends Marsupial{
    public boolean isBiped(){                                       //instance method overriding
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("Kangaroo hops on two legs "+ isBiped());
    }

    public static void main(String[] args) {
        Marsupial marsupial=new Kangaroo();
        marsupial.getMarsupialDescription();

        Kangaroo kangaroo=new Kangaroo();
        kangaroo.getKangarooDescription();
        kangaroo.getMarsupialDescription();
    }
}
