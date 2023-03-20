package LR6;

public class Example2 {
    public static void main(String[] args) {
        ex2 nm = new ex();
        System.out.println(nm.a);
    }
}

class ex{
    static int a = 0;
    ex(){
        System.out.println(a);
        a++;
    }
}
