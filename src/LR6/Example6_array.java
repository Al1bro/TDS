package LR6;

public class Example6_array {
    static int[] arrRt (int[] array, int value) {
        int a;
        int[] arr;
        if(value > arr.length) {
            arr = new int[array.length];
            a = array.length;
        } else {
            arr = new int[value];
            a = value;
        }
        System.arraycopy(array, 0, arr, 0, a);

        return arr;
    }
}
