package _14PassByValue.PassingPrimitive;

public class Test2 {
    public static void main(String[] args) {
        int original1 = 1;				            // Copy of original1
        int original2 = 2;				            // Copy of original2

        swap(original1, original2);                 // Copy of original1 and original2 are passed
        System.out.println("Original1 = " +original1);
        System.out.println("Original2 = " +original2);
    }
    public static void swap(int a, int b) { 		//method parameters of swap
        int temp = a;
        a = b;
        b = temp;

    }

}
