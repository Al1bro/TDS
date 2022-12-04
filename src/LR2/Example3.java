package LR2;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();
        if (x > 10) {System.out.println("1) Введенное число > 10");}
        else {System.out.println("1) Введенное число не удовлетворяет критериям (N > 10)");}
        if (x % 4 == 0 ) {System.out.println("2) Введенное число делится на 4");}
        else {System.out.println("2) Введенное число не удовлетворяет критериям (N / 4 = 0)");}
    }
}
