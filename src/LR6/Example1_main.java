package LR6;

public class Example1_main {
    public static void main(String[] args) {
        Example1_ChrStr cas = new Example1_ChrStr();
        cas.Simv1('u');
        cas.Val1();
        cas.Simv2("privet");
        cas.Val2();
        char[] chr = {'h', 'e', 'l', 'l', 'o'};
        cas.Simv3(chr);
        char[] ch = {'z'};
        cas.Simv3(ch);
        cas.Val3();
    }
}
