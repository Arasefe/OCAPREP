package _7.MultiDimensionalArray.Iteration;

public class Test1 {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3"},
                {"4", "5"},
                {"6", "7"}
        };
        OUTER_LOOP:
        for (int i = 0; i < arr.length; i++) {
            INNER_LOOP:
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i]);
//                if(arr[i][j].equals("2")) {
//                    break;
//                }
            }
        }
    }
}
