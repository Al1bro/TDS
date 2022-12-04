package LR2;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = in.nextInt();
        if (n % 5  == 2 ) {System.out.println("1) Введенное число делится на 5 с остатком 2");}
        else {System.out.println("1) Введенное число не удовлетворяет критериям (N % 5 = 2)");}
        if (n % 7  == 1 ) {System.out.println("2) Введенное число делится на 7 с остатком 1");}
        else {System.out.println("2) Введенное число не удовлетворяет критериям (N % 7 = 1)");}
    }
}
