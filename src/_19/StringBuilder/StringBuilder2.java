package _19.StringBuilder;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("radical");
        sb.insert(sb.length(),"robots");
        System.out.println(sb);
    }
}
