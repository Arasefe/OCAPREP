package _16.Initialization;

public class Order {
    static String result="";
    {result+="c";}
    static{
        result+="u";
    }
    {result+="r";}
}
class OrderDriver{
    public static void main(String[] args) {
        System.out.println(Order.result+"");    //u
        System.out.println(Order.result+"");    //u
        new Order();                            //ucr
        new Order();                            //cr
        System.out.println(Order.result+"");
    }
}