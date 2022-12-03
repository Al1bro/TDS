package LR1;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int n1 = in.nextInt();
        System.out.println("Введите второе число число: ");
        int n2 = in.nextInt();
        System.out.println(n1+"+"+n2+"="+(n1+n2));
        in.close();
    }
}
