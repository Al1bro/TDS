package LR7.Ex3;

public class subClass2 extends subClass1 {
    public String str;

    subClass2(String strEx, char chrEx, int intEx){
        super(chrEx, intEx);
        this.str = strEx;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Число: " + this.getChisl2() + "\n" +
                "Символ: " + this.getChr() + "\n" +
                "Текст: " + this.str + "\n";
        return ClassNameAndFieldValue ;
    }
}
