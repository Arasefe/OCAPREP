package _7.Array.ArrayExamples;

public class StopMethod {
    private static int count;                           // default value 0
    public static void main(String[] args) {
        stopMethod();
    }

    public static void stopMethod(){
        String[] stops = new String[]{"Washington", "Monroe", "Jackson", "La Salle"};
        while (count < stops.length) {                  //iterates until count=4;
            if (stops[count++].length() < 8) {          //"Monroe".length < 8
                break;
            }
        }
        System.out.println(count);
    }
}

