package _14PassByValue.PassingObject;

class Person {
    public String name;                                 //Main
    public int height;                                  //
}

public class PassByValueToObject {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "Main";
        p.height=180;

        anotherMethod(p);
        System.out.println(p.name);                     //Main
        System.out.println(p.height);                   //180

        someMethod(p);
        System.out.println(p.name);                     //someMethod
        System.out.println(p.height);                   //180
    }

    static void someMethod(Person p) {
        p.name = "someMethod";
        System.out.println(p.name);                     //someMethod
        System.out.println(p.height);                   //180
    }

    static void anotherMethod(Person p) {
        p = new Person();
        p.name = "anotherMethod";
        System.out.println(p.name);                     //anotherMethod
        System.out.println(p.height);                   //0

    }
}