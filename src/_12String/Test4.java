package _12String;

public class Test4 {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;               // "James"+"Gosling"
        String name2 = fName + "Gosling";           //  fName+"Gosling"
        String name3 = "James" + "Gosling";         // "James"+"Gosling"
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
    }
}
