package LR10.Example2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DeleteManga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/LR10/Example2/example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject library =  (JSONObject) obj;
        JSONArray mangas = (JSONArray) library.get("manga");
        System.out.println("Введите название манги, которую хотите удалить: ");
        String title = in.nextLine();
        Iterator iterator = mangas.iterator();
        while (iterator.hasNext()) {
            JSONObject manga = (JSONObject) iterator.next();
            if (title.equals(manga.get("title"))) {
                iterator.remove();
            }
        }
        try(FileWriter file = new FileWriter("src/LR10/Example2/example-json.json"))
        {
            file.write(library.toJSONString());
            System.out.println("Манга "+title+" удалена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
