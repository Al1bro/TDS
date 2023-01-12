package LR7.Ex3;

public class Main {
  public static void main(String[] args) {
    superClass superClassObject = new superClass(7);
    String className = superClassObject.toString();
    System.out.println(className);

    subClass1 subClassObject1 = new subClass1('L', 4);
    String subClassName1 = subClassObject1.toString();
    System.out.println(subClassName1);

    subClass2 subClassObject2 = new subClass2("P", 'F',22);
    String subClassName2 = subClassObject2.toString();
    System.out.println(subClassName2);
  }
}
