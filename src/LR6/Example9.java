package LR6;
import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        char[] array = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        System.out.println(Arrays.toString(array));
        Rev.revers(array);
        System.out.println(Arrays.toString(array));
        Rev.revers(array);
        System.out.println(Arrays.toString(array));
    }
}

class Rev {
    static void revers (char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
