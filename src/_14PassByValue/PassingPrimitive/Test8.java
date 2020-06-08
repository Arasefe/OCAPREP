package _14PassByValue.PassingPrimitive;

public class Test8 {
        public int update(int a, int offset){
         a = a + offset;
         return a;                                              // 210
        }
        public static void main(String[] args) {
            Test8 u = new Test8();
            int a = 99;
            a = u.update(a, 111);                         // A copy of a and offset are created and passed to update();
            System.out.println(a);
        }
}
