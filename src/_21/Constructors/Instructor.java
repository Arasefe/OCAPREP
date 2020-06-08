package _21.Constructors;

public class Instructor {
    private long id;
    private String name;
    private String title;
    private String department;
    private Book[] books;

    public Instructor(long id,String name, String title,String department, Book[]books){
        this(id,name,title,department);
        this.books=books;
    }
    public Instructor(long id,String name, String title,String department) {
        this(id,name,title);
        this.books = books;

    }
    public Instructor(long id,String name, String title) {
        this(id, name);
        this.books = books;
    }
    public Instructor(long id,String name) {
        this.id=id;
        this.name = name;
    }


}
