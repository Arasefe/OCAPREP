package _19.StringBuilder;

public class StringBuilder3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("radical ");

        StringBuilder sb1=new StringBuilder("radical").append("robots");
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("radical ").delete(1,100).append("obots").insert(1, "adical r");
        System.out.println(sb2);
        StringBuilder sb3=new StringBuilder("radical ").insert(7, "robots");
        System.out.println(sb3);
        StringBuilder sb4=new StringBuilder("radical ").insert(sb.length(), "robots");
        System.out.println(sb4);

    }
}
