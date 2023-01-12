package LR7.Ex4;

public class Main {
    public static void main(String[] args) {
        superClass superClassObject = new superClass("Russian");
        String className = superClassObject.toString();
        System.out.println(className);

        subClass1 subClassObject1 = new subClass1("German", 81);
        String subClassName1 = subClassObject1.toString();
        System.out.println(subClassName1);

        subClass2 subClassObject2 = new subClass2("Japan", 'J');
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
