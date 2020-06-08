package _3.AbbreviatingOperators;

public class Test1 {
        public static void main(String [] args) {
            int a = 3;
            m(++a, a++);
            System.out.println(a);
        }

        private static void m(int i, int j) {
            i++;
            j--;
        }
    }

