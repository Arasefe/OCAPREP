package _7.MultiDimensionalArray.Iteration;

public class Array1 {
    public static void main(String[] args) {

        int[][] myComplexArray = new int[][]{
                {5,2,1,3},
                {3,9,8,9},
                {5,7,12,7}
        };
        for(int[] mySimpleArray : myComplexArray) {
            for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+",");
            }
            System.out.println();
        }

    }
}
