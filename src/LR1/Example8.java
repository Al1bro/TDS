package LR1;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String week = in.nextLine();
        System.out.println("Введите название месяца: ");
        String Month = in.nextLine();
        System.out.println("Введите дату (номер дня в месяце)");
        int day = in.nextInt();
        System.out.println(week+","+day+","+Month);
        in.close();
    }
}
