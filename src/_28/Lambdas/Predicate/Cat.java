package _28.Lambdas.Predicate;

import java.util.function.Predicate;

public class Cat {
    int age;
    public static void main(String[] args) {
        Cat c=new Cat();
        c.age=1;
        check(c,cat->c.age<2);

    }
    private static void check(Cat cat, Predicate<Cat> p){
        String result=p.test(cat)?"match":"unmatch";
        System.out.println(result);
    }
}
