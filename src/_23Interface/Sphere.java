package _23Interface;

public interface Sphere {
    default String getName(){
        return "Unknown";
    }
}
abstract class Planet {
    abstract String getName();
}
class Mars extends Planet implements Sphere {
    public Mars(){
        super();
    }
    public String getName(){
        return "Mars";
    }

    public static void main(String[] args) {
        System.out.println(((Planet)new Mars()).getName());
    }
}
