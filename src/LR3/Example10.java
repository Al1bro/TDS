package LR3;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int Size = id.nextInt();
        System.out.println("Длина массива равен " + Size + "\n");
        int[] arr = new int[Size];
        Random rdm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rdm.nextInt(777);
            System.out.println("Элемент массива [" + i + "] = " + arr[i]);
        }
        for(int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("\nСортировка массива по убыванию\n");
        for (int i = 0; i < arr.length; i++){System.out.println("Элемент массива [" + i + "] после сортировки = " + arr[i]);}
    }
}