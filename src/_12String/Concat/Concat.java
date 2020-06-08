package _12String.Concat;

public class Concat {
    public static void main(String[] args) {

        System.out.println(5+6+"7"+8+9);
        System.out.println(1+2+3+4+5+"Hello World");

        StringBuilder sb=new StringBuilder("omg ");
        sb.ensureCapacity(5);
        sb.setLength(12);

        String a="Hello";
        a.length();
        a.intern();
        System.out.println(a);

        int total=0;
        StringBuilder s=new StringBuilder("abcdefg");
        total+=s.substring(1,2).length();
        total+=s.substring(6,6).length();
        total+=s.substring(6,5).length();
        System.out.println(total);


    }
}
