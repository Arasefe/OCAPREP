package _21.Constructors;

class Car {
    public int getRatio = 8;

    public String accelerate() {
        return "Accelerate: Car";
    }

    public static class SportsCar extends Car {
        public int gearRatio = 9;

        public String accelerate() {
            return "Accelerate: SportsCar";
        }

        public static void main(String[] args) {
            Car c = new SportsCar();
            System.out.println(c.getRatio + " " + c.accelerate());
        }
    }
}
