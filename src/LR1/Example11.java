package LR1;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше Имя: ");
        String Name = in.nextLine();
        System.out.println("Введите ваш год рождения: ");
        int Birthday = in.nextInt();
        System.out.println("Имя : " +Name);
        System.out.println("Возраст : " +(2022-Birthday));
        in.close();
    }
}
