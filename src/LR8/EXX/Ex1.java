package LR8.EXX;
import java.io.File;

public class Ex1 {
    public static void main(String[] args) {
        try {
            File f1=new File("Text1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Создан!!!!");
                System.out.println("Полный путь1: "+ f1.getAbsolutePath());
            }
            File f2=new File("C:\\Text2.txt");
            f2.createNewFile();
            System.out.println( "Полный путь 2: "+ f2.getAbsolutePath());
            File f3=new File("C:\\Папка1\\Папка2\\Папка3");
            f3.mkdirs();
            System.out.println("Полный путь 3: "+ f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка!!! "+e);
        }
    }
}
