package _25.Polymorphism;

public abstract class Book {
    protected static String material="papyrus";
    public Book(){}
    public Book(String material){this.material=material;}

}
 class Encyclopedia extends Book{
    public static String material="cellulose";
    public Encyclopedia(){super();}
    public String getMaterial(){return super.material;}

     public static void main(String[] args) {
         System.out.println(new Encyclopedia().getMaterial());
     }

}
