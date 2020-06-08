package _7.MultiDimensionalArray.Iteration;

public class Test3 {
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2, 4},
                {4, 5, 6},
                {7, 9, 12}
        };

        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }
}
