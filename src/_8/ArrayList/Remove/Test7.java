package _8.ArrayList.Remove;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        removeIndex(new ArrayList<>(6));
    }
    public static void removeIndex(ArrayList<String>list){
        list.add("ARAS");
        list.add("TULPAR");
        list.add("BANU");
        list.add("ISMAIL");
        list.add("EFE");
        list.add("EGE");             //[ARAS TULPAR BANU ISMAIL EFE EGE]
        list.remove(3);        //[ARAS TULPAR BANU EFE EGE]
        list.remove(2);        //[ARAS TULPAR EFE EGE]
        System.out.println(list);
    }
}
