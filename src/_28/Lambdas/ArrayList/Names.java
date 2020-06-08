package _28.Lambdas.ArrayList;

import java.util.ArrayList;

public class Names {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>(6);
        names.add("Aras");
        names.add(1,"Tulpar");
        names.add("Efe");
        names.add(3,"Ege");
        names.add("Banu");
        names.add(5, "Ismail");

        System.out.println("Names before Lambda "+names);
        names.removeIf(s->s.charAt(0)=='E');
        System.out.println("Names after Lambda "+names);
        names.removeIf((String e)->e.charAt(2)=='m');
        System.out.println("Names after 2 Lambda "+ names);
        names.removeIf((String s)->{return s.charAt(2)=='n';});
        System.out.println("Names after 3 Lambda "+names);
    }
}
