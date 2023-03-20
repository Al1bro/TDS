package LR6;
import java.util.Arrays;

public class Example6_main {
    public static void main(String[] args) {
        int[] array = {7, 5, 7, 5, 5, 777, 5, 78, 5, 45, 65};
        System.out.println(Arrays.toString(Example6_array.arrRt(array, 5)));
        System.out.println(Arrays.toString(Example6_array.arrRt(array, 20)));
    }
}
