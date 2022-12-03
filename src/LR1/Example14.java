package LR1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        System.out.println((n-1)+","+n+","+(n+1)+","+(((n-1)+n+(n+1))*((n-1)+n+(n+1))));
        in.close();
    }
}
