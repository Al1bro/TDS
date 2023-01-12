package LR7.Ex2;

public class Main {
    public static void main(String[] args) {
        superClass superClassObject = new superClass("суперкласс");
        String className = superClassObject.toString();
        System.out.println(className);

        subClass subClassObject1 = new subClass("с текстовым параметром");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subClass subClassObject2 = new subClass(7);
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);

        subClass subClassObject3 = new subClass("два параметра str и int", 1332);
        String subClassName3 = subClassObject3.toString();
        System.out.println(subClassName3);
    }
}
