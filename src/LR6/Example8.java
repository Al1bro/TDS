package lab6;

public class Example8 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(Math.round(SR.getSr(array)));
    }
}

class SR {
    static double getSr(int[] array) {
        double sum = 0;
        for (int a : array) {
            sum += a;
        }
        return sum / array.length;
    }
}
