package LR5;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        /*Scanner id = new Scanner(System.in);
        System.out.println("Введите перовое число");
        int int1 = id.nextInt();
        System.out.println("Введите второе число");
        int int2 = id.nextInt();

        Example myexample = new Example(int1, int2);
        myexample.PrintInt();

        Example myexample1= new Example(int1);

        myexample1.PrintInt();
        myexample.SetInt(int1, int2);
        myexample.PrintInt();

        myexample.SetInt(int1);
        myexample.PrintInt();*/

        Example myexample = new Example(2, 5);
        myexample.PrintInt();

        Example myexample1= new Example(1);

        myexample1.PrintInt();
        myexample.SetInt(3, 15);
        myexample.PrintInt();

        myexample.SetInt(-9);
        myexample.PrintInt();
    }

    static class Example {
        private static int min;
        private static int max;

        static void SetInt(int num1, int num2) {
            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(Math.min(num1, min),num2);
            max = Math.max(Math.max(num1, max),num2);
        }

        static void SetInt(int num) {
            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        static void PrintInt() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }

        Example(int num1, int num2) {
            System.out.println("Конструктор Example_6() c 2-я аргументами");
            min = Math.min(num1,num2);
            max = Math.max(num1,num2);
        }

        Example(int num) {
            System.out.println("Конструктор Example_6() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
}
