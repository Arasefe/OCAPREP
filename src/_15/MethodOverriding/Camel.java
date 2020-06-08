package _15.MethodOverriding;

public class Camel {
    protected String getNumberOfHumps(){                //method
        return"Undefined";

    }
}
class BactrianCamel extends Camel{
   public String getNumberOfHumps(){                    //method overriding
        return "2";
    }
    public void getNumberOfHumps(int humps){            //method overloading
        System.out.println("Bactrian Camel has "+ humps + " hums");
    }

    public static void main(String[] args) {
        Camel camel=new Camel();
        System.out.println(camel.getNumberOfHumps());   //undefined
        BactrianCamel bc=new BactrianCamel();
        System.out.println(bc.getNumberOfHumps());      //"2"
        bc.getNumberOfHumps(5);                         // Bactrian Camel has 5 hums
        Camel c=new BactrianCamel();
        System.out.println(c.getNumberOfHumps());       //"2"
    }
}

