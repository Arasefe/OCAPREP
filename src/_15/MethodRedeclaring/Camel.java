package _15.MethodRedeclaring;

public class Camel {
    private String getNumberOfHumps(){      //private method
        return "Undefined";
    }

}
class BactrianCamel extends Camel{
    private int getNumberOfHumps(){         //private method declaration with modified method signature
        return 2;
    }

    public static void main(String[] args) {
        BactrianCamel camel=new BactrianCamel();
        System.out.println(camel.getNumberOfHumps());
    }
}
