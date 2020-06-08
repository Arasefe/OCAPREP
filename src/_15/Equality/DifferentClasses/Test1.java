package _15.Equality.DifferentClasses;

public class Test1 {
    /*
    Note: System.out.println(str==sb); Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder'

     */
    public static void main(String[] args) {
        String str1="java";
        StringBuilder sb1=new StringBuilder("java");
       // boolean a1=str1==sb1;
        boolean a2=str1.equals(sb1);
        boolean a3=sb1.equals(str1);

    }
}
