package _14PassByValue.PassingStringBuilder;

public class Test2 {

    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("Aras");
        StringBuilder s2=new StringBuilder("Tulpar");

        System.out.println("Aras=" +s1);
        System.out.println("Tulpar="+s2);

        StringBuilder s3=work(s1,s2);               // A copy of s1 and s2 are created and passed to work();

        System.out.println("Aras=" +s1);
        System.out.println("Tulpar="+s2);
        System.out.println("s3="+s3);
    }
    public static StringBuilder work(StringBuilder x,StringBuilder y ){
        x.append("Efe");                            // ArasEfe
        y.append("Ege");                            // TulparEge
        return x.append(y);                         // ArasEfe
    }
}
