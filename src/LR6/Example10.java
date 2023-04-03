package LR6;
import java.util.Arrays;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int sz = in.nextInt();
        int a[] = new int[sz];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < sz; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Минимум и Максимум:\n" + Arrays.toString(MinMax.arm(a)));
    }
}

class MinMax {
    static int[] arm (int ...array) {
        int[] a = new int[2];
        Arrays.sort(array);
        a[0] = array[0];
        a[1] = array[array.length - 1];
        return a;
    }
}
