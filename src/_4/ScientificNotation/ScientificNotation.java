package _4.ScientificNotation;

public class ScientificNotation {
    public static void main(String[] args) {
            float myNumber = 25.4F;

//        double before = 10_.25;               // does not compile
//        double after = 10._25;                // does not compile
//        double first = _10.25;                // does not compile
//        double last = 10.25_;                 // does not compile

            double myDouble = 2.54;
            double myDouble2 = 2.54F;
            double anotherDouble = 2.45D;       // d can be used for double it is optional

            double scientific = 5.000125E03;    // scientific notation
            double scientific2 = 5.000125E3;    // scientific notation
            double myDouble3 = 5000.125;        // double variable initialization

            System.out.println("scientific= " + scientific);
            System.out.println("scientific2= " + scientific2);
            System.out.println("myDouble3= " + myDouble3);

            double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number

            System.out.println("hexPi= " + hexPi);
        }
    }

