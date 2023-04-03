package LR6;

public class Example2 {
    public static void main(String[] args) {
        ex2 num = new ex2();

        System.out.println(num.a);
    }
}

class ex2{
    static int a = 0;
    ex2(){
        System.out.println(a);
        a++;
    }
}
