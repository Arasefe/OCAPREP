package _14PassByValue.PassingPrimitive;

    public class Test3 {
        public static void main(String args[]) {
            int s = 10;
            passByValueMethod(s);                       //11
            System.out.println(s);                      //10

            anotherPassByValueMethod(s);                //20
            System.out.println(s);                      //10
        }

        static void passByValueMethod(int val) {
            ++val;
            System.out.println(val);                    //11
        }

        static void anotherPassByValueMethod(int val) {
            val = 20;
            System.out.println(val);                    //20
        }
    }

