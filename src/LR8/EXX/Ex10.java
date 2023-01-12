package LR8.EXX;
import java.io.*;

public class Ex10 {
 public static void main (String[] args) throws IOException {
     BufferedReader br = null;
     PrintWriter out = null;
     try{
         br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\1\\Text1.txt"),"UTF-8"));
         out = new PrintWriter("E:\\1\\Text2.txt","UTF-8");
         int lineCount = 0;
         String s; 
         while ((s = br.readLine()) != null)
         {
             lineCount++;
             out.println(lineCount + ": " + s);
         }
     }
     catch (IOException e)
     {
         System.out.println("Ошибка!!!!!!!!!");
     }
     finally {
     br.close();
     out.flush();
     out.close();
     }

     }
 }
