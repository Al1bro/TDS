package LR5;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите перовое число");
        int int1 = id.nextInt();
        System.out.println("Введите второе число");
        int int2 = id.nextInt();
        Example myexample1 = new Example();
        Example myexample2 = new Example(int1);
        Example myexample3 = new Example(int1,int2);
    }
    static class Example {
        private int num1;
        private int num2;

        Example(){
            System.out.println("Koнcтpyктор без передачи аргумента\n");
        }
        Example(int num1){
            System.out.println("Koнcтpyктор с передачей одного аргумента");
            this.num1 = num1;
            System.out.println("n1^n1 = " + exponentOwnPow (num1) + "\n");
        }
        public int exponentOwnPow (int num1) {
            this.num1 = num1;
            int result = 1;
            for (int i = 1; i <= num1; i++) {
                result = num1*result;
            }
            return result;
        }
        Example(int num1, int num2){
            System.out.println("Koнcтpyктор с передачей двух аргументов");
            this.num1 = num1;
            this.num2 = num2;
            System.out.println("n1^n2 = " + exponentPow (num1, num2) + "\n");
        }
        public int exponentPow(int n1, int n2){
            n1 = num1;
            n2 = num2;
            int result = 1;
            for (int i = 1; i <= num2; i++) {
                result = num1 * result;
            }
            return result;
        }
    }
}
