package LR6;

public class Example1_ChrStr1 {
    chr a = '0';
    Str b = "0";

    void Simv1 (char a) {
        this.a = a;
    }
    void Simv2(String b) {
        this.b = b;
    }
    void Simv3(char[] chr) {
        if(chr.length > 1) {
            this.b = new String(chr);
        } else {
            this.a = chr[0];
        }
    }
    void Val1 () {
        System.out.println("Символ = " + a);
    }
    void Val2 () {
        System.out.println("Строка = " + b);
    }
    void Val3 () {
        System.out.println("Символьный массив из одного символа = " + a + "\nСтрока из символьного массива = " + b);
    }
}
