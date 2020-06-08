package _7.MultiDimensionalArray.Iteration;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        String[][] matrix = new String[2][2];
        matrix[0][0] = "Aras";
        matrix[0][1] = "Tulpar";
        matrix[1][0] = "Ismail";
        matrix[1][1] = "Banu";
        for (String[] name : matrix) {
            for (int i = 0; i < name.length; i++) {
                System.out.println(name[i]+" ");
                //System.out.println(Arrays.toString(matrix));
            }
            System.out.println(Arrays.toString(name));
        }
    }
}
