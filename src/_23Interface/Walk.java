package _23Interface;

public abstract interface Walk {
    public default int getSpeed(){                  //default method
        return 5;
    }
    interface Run{
        public default int getSpeed(){              //default method
            return 10;
        }
    }
    class Cat implements Walk, Run{
        public int getSpeed(){
            System.out.println("Cat is moving");
            return 12;
        }

        public static void main(String[] args) {
            Cat cat=new Cat();
            cat.getSpeed();
        }
    }
}
