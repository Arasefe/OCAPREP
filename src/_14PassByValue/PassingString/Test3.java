package _14PassByValue.PassingString;

import java.awt.*;

public class Test3 {
        private int height;
        private int width;

        public Test3(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }
    }
     class Tester {
        public static void main(String[] args) {
            int i = 100;        // private
            int j = 200;        // private
            Rectangle rect = new Rectangle(i, j);
            System.out.println(rect.getHeight() + ", " + rect.getWidth());
        }
    }
