package _12String;

public class InternMethod {
    public static void main(String[] args) {
        /*
        It returns a copy of the String in the memory

         */
        String a="Hello";
        String b=new String("Hello World");
        String c=a.intern();        //return a copy of String "Hello" from Pool
        String d=b.intern();        //return a copy of String "Hello World" from Heap

        System.out.println(c);
        System.out.println(d);
    }
}
