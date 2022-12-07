package LR3;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели");
        int n = id.nextInt();
        switch(n)
        {
            case 1:
                System.out.println(n + " День недели - понедельник");
                break;
            case 2:
                System.out.println(n + " День недели - вторник");
                break;
            case 3:
                System.out.println(n + " День недели - среда");
                break;
            case 4:
                System.out.println(n + " День недели - четверг");
                break;
            case 5:
                System.out.println(n + " День недели - пятница");
                break;
            case 6:
                System.out.println(n + " День недели - суббота");
                break;
            case 7:
                System.out.println(n + " День недели - воскресенье");
                break;
            default:
                System.out.println(n + " - некорректное значение");
                break;
        }
    }
}
