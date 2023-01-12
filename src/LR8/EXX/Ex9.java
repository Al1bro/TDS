package LR8.EXX;
import java.io.*;

public class Ex9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader( new InputStreamReader( new FileInputStream("E:\\1\\Text1.txt"),"UTF-8"));

            bw = new BufferedWriter( new OutputStreamWriter( new FileOutputStream("E:\\1\\Text2.txt"),"UTF-8"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Ошибка!!!!!!!!");

        }
        finally{
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.flush();
            }
            if (bw != null) {
                bw.close();
            }
        }
    }
}
