package LR1;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int Birthday = in.nextInt();
        System.out.println("Год рождения : " +(2022-Birthday));
        in.close();
    }
}
