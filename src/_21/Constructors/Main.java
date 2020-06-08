package _21.Constructors;

    public class Main {
        public Main() {
            this(7);
            System.out.println("public");
        }

        private Main(int val) {
            this("Sunday");
            System.out.println("private");
        }

        protected Main(String val) {
            System.out.println("protected");
        }

        public static void main(String[] args) {
            Main print = new Main();
        }
    }

