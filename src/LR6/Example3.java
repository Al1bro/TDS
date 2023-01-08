package LR6;
import java.util.Scanner;

public class Example3 {
    int max = 0;
    int min = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int a[] = new int[size];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < size; i++) {a[i] = in.nextInt();}
        Nim(a);
    }

    static void Nim(int[] a){
        int min = a[0];
        int max = min;
        float sred = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {max = a[i];}
            if (a[i] < min) {min = a[i];}
        }
        for (int i = 0; i < a.length; i++){sred = sred + a[i];}
        System.out.println(min + "\n" + max + "\n" + sred / a.length);
    }
}
