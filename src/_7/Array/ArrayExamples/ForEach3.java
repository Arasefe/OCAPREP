package _7.Array.ArrayExamples;

public class ForEach3 {
    public static void main(String[] args) {
        forMethod();
    }

    public static void forMethod() {
        String[] animals = {"Parrot", "Lizard", "Lion", "Cat", "Tiger", "Giraffe"};

        for (String animal : animals) {
            if (animal.equals("Cat")) {
                //continue;
                break;
            }
            System.out.print(animal + " ");
        }
    }
}
