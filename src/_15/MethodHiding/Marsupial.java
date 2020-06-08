package _15.MethodHiding;

public class Marsupial {
    public static boolean isBiped(){                                    //static method
        return false;
    }
    public void getMarsupialDescription(){
        System.out.println("MARSUPIAL WALKS ON TWO LEGS: "+ isBiped());
    }
}
class Kangaroo extends Marsupial{
    public static boolean isBiped(){                                    //static method hiding
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("Kangaroo hops on two legs :"+isBiped());
    }

    public static void main(String[] args) {
        Kangaroo kangaroo=new Kangaroo();
        kangaroo.getKangarooDescription();                              //Kangaroo hops on two legs :true
        kangaroo.getMarsupialDescription();                             //MARSUPIAL WALKS ON TWO LEGS:false
        Marsupial.isBiped();                                            //false
        Kangaroo.isBiped();                                             //true
    }
}
