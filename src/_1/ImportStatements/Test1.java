package _1.ImportStatements;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random r=new Random();
        int random=r.nextInt(7);
        switch(random){
            case 0:
                System.out.println("SIFIR");
                break;
            case 1:
                System.out.println("YEK");
                break;
            case 2:
                System.out.println("DU");
                break;
            case 3:
                System.out.println("SE");
                break;
            case 4:
                System.out.println("CAHAR");
                break;
            case 5:
                System.out.println("PENC");
                break;
            case 6:
                System.out.println("SES");
            default:
                break;
        }
    }
}
