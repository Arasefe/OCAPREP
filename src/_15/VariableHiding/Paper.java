package _15.VariableHiding;

public class Paper {
    public int size=21;
}
class BookLet extends Paper{
    public int size=17;

    public static void main(String[] args) {
        Paper paper=new Paper();                    //21
        System.out.println(paper.size);
        BookLet bookLet=new BookLet();
        System.out.println(bookLet.size);           //17
    }
}
