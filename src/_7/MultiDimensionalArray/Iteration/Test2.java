package _7.MultiDimensionalArray.Iteration;

public class Test2 {
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        System.out.println(myArray);                            // [[I@38af3868
//        System.out.println(Arrays.toString(myArray));           // [[I@77459877, [I@5b2133b1, [I@72ea2f77]

        OUTER_LOOP:for (int[] rowArray : myArray) {
            INNER_LOOP:for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
//                    break INNER_LOOP;                            // 1 7
//                    break OUTER_LOOP;                            // 1
                    continue INNER_LOOP;                           //
//                    continue OUTER_LOOP;                         // 1 7
                }
                System.out.print(rowArray[i] + " ");
            }

            System.out.println();
        }
    }
}
