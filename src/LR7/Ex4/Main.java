package LR7.Ex4;

public class Main { 
  public static void main(String[] args) {
    superClass superClassObject = new superClass('B');
    String className = superClassObject.toString();
    System.out.println(className);

    subClass subClassObject1 = new subClass('K', "M4A4");
    String subClassName = subClassObject1.toString();
    System.out.println(subClassName);

    subClass2 subClassObject2 = new subClass2('Q', "Anime", 137);
    String subClassName2 = subClassObject2.toString();
    System.out.println(subClassName2);

    System.out.println("Конструктор копирования:\n");

    subClass2 subClassObject2_cop2 = new subClass2(subClassObject2);
    subClassObject2_cop2.chr = 'P';
    String subClassName21 = subClassObject2_cop2.toString();
    System.out.println(subClassName21);

    subClass2 subClassObject2_cop3 = new subClass2(subClassObject2);
    subClassObject2_cop3.str = "AK-47";
    String subClassName22 = subClassObject2_cop3.toString();
    System.out.println(subClassName22);

    subClass2 subClassObject2_cop1 = new subClass2(subClassObject2);
    subClassObject2_cop1.chisl = 21;
    String subClassName23 = subClassObject2_cop1.toString();
    System.out.println(subClassName23);

    subClass2 subClassObject2_cop4 = new subClass2(subClassObject2);
    subClassObject2_cop4.str = "FILM";
    subClassObject2_cop4.chisl = 789465;
    String subClassName24 = subClassObject2_cop4.toString();
    System.out.println(subClassName24);
  }
}
