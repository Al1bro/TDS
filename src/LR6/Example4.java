package LR6;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для нахождения двойного факториала: ");
        int a = in.nextInt();
        Factor1(a);
        System.out.println("Через рекурсию:\nn!! = " + Factor2(a));
    }

    static void Factor1(int a){
        int c = 1;
        int b = a % 2;
        if (b == 0) {
            for (int i = 1; i <= a; i++) {if (i % 2 == 0) {c = c * i;}}
        }else{for (int i = 1; i <= a; i++) {if (i % 2 == 1) {c = c * i;}}}
        System.out.println("Без рекурсии:\nn!! = " + c);
    }

    public static int Factor2(int a){
        if (a <= 1){return 1;
        }else {return a * Factorial2(a - 2);}
    }
}
