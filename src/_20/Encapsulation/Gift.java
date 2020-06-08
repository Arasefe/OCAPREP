package _20.Encapsulation;

public class Gift {
    private final String contents;
    public Gift (){
        this.contents="Gift";
    }
    protected String getContents(){
        return contents;
    }
    public void showPresent(){
        System.out.println("Your gift:" +contents);
    }

    public static void main(String[] args) {
        Gift gift=new Gift();
        gift.showPresent();

    }
}
