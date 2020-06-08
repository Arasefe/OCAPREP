package _7.MultiDimensionalArray.Iteration;

public class Test4 {
    public static void main(String[] args) {
        int [][] myArray=new int[][]{
                {-1, 1, 3},
                {5, 6, 7},
                {9, 11, 12},
        };

        OUTER_LOOP:for(int[]array:myArray){
            INNER_LOOP:for(int i=0;i<array.length;i++){
                if(array[i]%2==0){
                    //break OUTER_LOOP;
                    //break INNER_LOOP;
                    //continue OUTER_LOOP;
                    continue INNER_LOOP;
                }
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }
}
