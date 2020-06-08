package _27Exceptions.MultipleCatch;

public class Test1 {
    public String name;
    public void run(){
        System.out.println("1");                                // 1
        try{
            System.out.println("2");                            // 2
            name.toLowerCase();                                 // nullPointerException
            System.out.println("3");
        }catch(NullPointerException e){
            System.out.println("4");                            // 4
            throw new RuntimeException("Oh my God");            // throw new RunTime Exception("Oh my God")
        }catch(Exception exception){
            System.out.println("Oh my God Exception is handled");
        }
        System.out.println("5");
    }

    public static void main(String[] args) {
        Test1 mce=new Test1();
        mce.run();
        System.out.println("6");
    }
}
