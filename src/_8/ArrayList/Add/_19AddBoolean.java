package _8.ArrayList.Add;
import java.util.ArrayList;
public class _19AddBoolean {
    public static void main(String[] args) {
        methodAgain(new ArrayList<>(2));
        arrayBoolean(new Boolean[]{null,null,null});
    }
    public static void methodAgain(ArrayList<Boolean>list) {
        Boolean[] arr = new Boolean[3];     // [null, null, null]
        list.add(arr[0]);                   // [null]
        list.add(arr[1]);                   // [null, null]
        list.add(new Boolean("true"));   // [null, null, true ]
        list.add(arr[2]);                   // [null, null, true, null ]
        list.add(true);                     // [null, null, true, null, true ]

        System.out.println(list);           // [null, null, true, null, true ]
        if (list.remove(0)) {         // returns E in index number 0 null thus NullPointerException
            list.remove(1);
        }else{
            list.add(true);
        }
        System.out.println(list);           // [null, null, null, true, true ]
    }
    public static void arrayBoolean(Boolean[]array){
        System.out.println(array);
    }
}

