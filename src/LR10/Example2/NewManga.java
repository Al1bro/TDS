package LR10.Example2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NewManga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название манги: ");
        String title = in.nextLine();
        System.out.println("Введите автора: ");
        String author = in.nextLine();
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/LR10/Example2/example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject library =  (JSONObject) obj;
        JSONArray manga = (JSONArray) library.get("manga");
        JSONObject newManga = new JSONObject();
        newManga.put("title", title);
        newManga.put("author", author);
        newManga.put("year", 2023);
        manga.add(newManga);

        library.put("manga",manga);
        try(FileWriter file = new FileWriter("src/LR10/Example2/example-json.json"))
        {
            file.write(library.toJSONString());
            System.out.println("Новая манга добавлена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
