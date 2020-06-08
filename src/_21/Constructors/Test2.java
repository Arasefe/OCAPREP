package _21.Constructors;

public class Test2 {
        public static void change(Message m) {
            m = new Message();
            m.msg = "Happy Holidays!";
        }

        public static void main(String[] args) {
            Message obj = new Message();
            obj.print();
            change(obj);
            obj.print();
        }
}
