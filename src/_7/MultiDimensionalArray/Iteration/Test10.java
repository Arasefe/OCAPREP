package _7.MultiDimensionalArray.Iteration;

public class Test10 {
        public static void main(String[] args) {
            String [][] arr = {
                    {"1", "2", "3"},
                    {"4", "5"},
                    {"6", "7"}
            };
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                    if(arr[i][j].equals("2")) {
                        break;
                    }
                }
            }
        }
    }

