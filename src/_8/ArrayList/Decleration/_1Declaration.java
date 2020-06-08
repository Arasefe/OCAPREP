package _8.ArrayList.Decleration;

import java.util.ArrayList;
import java.util.List;

public class _1Declaration {
    public static void main(String[] args) {
        ArrayList list1= new ArrayList();                   // pre jAVA5
        ArrayList list2= new ArrayList(10);     // pre jAVA5
        ArrayList list3= new ArrayList(list2);              // pre jAVA5

        ArrayList<Object> list4=new ArrayList<>();
        ArrayList<Double> list5=new ArrayList<Double>();
        ArrayList<String> list6=new ArrayList<String>();

        List list7=new ArrayList<>();
        List<String> list8 = new ArrayList<>();
        List<Byte> list9 = new ArrayList<Byte>();
        List<Character> list10 = new ArrayList();
    }
}
