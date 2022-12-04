package LR2;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = in.nextInt();
        int result = n % 3;
        if (result == 0) {System.out.println("Введенное число делится на 3");}
        else {System.out.println("Введенное число не делится на 3");}
    }
}
