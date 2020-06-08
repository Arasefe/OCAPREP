package _14PassByValue.MainMethod;

public class Test1 {
    public static void addName(String[]names){      // Aras Tulpar

        names[names.length]="Ege";                  // Aras Tulpar Ege
        System.out.println(names);                  // Aras Tulpar Ege

    }

    public static void main(String[] args) {

        addName(new String[]{"Aras","Tulpar"});      // COPY OF String[]{"Aras","Tulpar"}

    }
}
