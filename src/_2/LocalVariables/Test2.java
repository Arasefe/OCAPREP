package _2.LocalVariables;

public class Test2 {
        public static void main(String[] args) {
            final double price = 90000;
            String model;
            if(price > 100000) {
                model = "Tesla Model X";
            } else if(price <= 100000) {
                model = "Tesla Model S";
            }
            System.out.println(model);
        }
}
