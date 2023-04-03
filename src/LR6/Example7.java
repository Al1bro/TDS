package LR6;
import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        char[] arrayChars = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(toInt.charInt(arrayChars)));
    }
}

class toInt {
    static int[] charInt (char[] arrayChars) {
        int[] toInt = new int[arrayChars.length];

        for(int i = 0; i < arrayChars.length; i++) {
            toInt[i] = arrayChars[i];
        }

        return toInt;
    }
}
