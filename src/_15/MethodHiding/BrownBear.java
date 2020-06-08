package _15.MethodHiding;

public class BrownBear {
    public static void sneeze(){
        System.out.println("Bear is sneezing");             //static method
    }
    protected void hibernate(){                             //regular method
        System.out.println("Bear is hibernating");
    }
}
class Pandax extends BrownBear{
    public static void sneeze(){                            //static method hiding
        System.out.println("Panda is sneezing");
    }
    public void hibernate(){                                //method overriding
        System.out.println("Panda is hibernating");
    }

    public static void main(String[] args) {
        BrownBear brownBear=new Pandax();
        brownBear.hibernate();                              //Panda is hibernating
        BrownBear.sneeze();                                 //Bear is sneezing
        Pandax.sneeze();                                    //Panda is sneezing
    }
}
