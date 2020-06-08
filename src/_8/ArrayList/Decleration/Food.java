package _8.ArrayList.Decleration;

import java.util.ArrayList;
import java.util.List;

public class Food {
    public static void main(String[] args) {
        int count=10;
        List<Character> list=new ArrayList<>();
        do{
            list.add('a');                      // a a a a
            for(Character x:list)
                count -=1;                      // 9 8 7 6 5 4 3 2 1 0
        }while(count>0);
        System.out.println(list.size());        // 4
    }
}
