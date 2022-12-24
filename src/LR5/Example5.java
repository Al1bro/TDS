package LR5;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите число");
        int int1 = id.nextInt();
        Example myexample = new Example(int1);
        System.out.println("Число = " + myexample.PrintInt());
    }

    static class Example {
        private int int1;

        public void Set(int n) {
            System.out.println("Метод Set() c аргументом");
            int1 = n;
            if (n >= 100) {
                int1 = 100;
            }
            if (n <= 0) {
                int1 = 0;
            }
        }

        public void Set() {
            System.out.println("Метод Set() без аргумента");
            int1 = 0;
        }

        public int PrintInt() {
            return int1;
        }

        Example(int int1) {
            System.out.println("Example() конструктор");
            this.Set(int1);
        }
    }
}
