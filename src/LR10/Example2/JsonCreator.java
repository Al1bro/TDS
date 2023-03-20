package LR10.Example2;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray manga = new JSONArray();

        JSONObject manga1 = new JSONObject();
        manga1.put("title","Синяя тюрьма: Блю Ло");
        manga1.put("author","KANESHIRO Muneyuki");
        manga1.put("year",2018);

        JSONObject manga2 = new JSONObject();
        manga2.put("title","Пожиратель книг");
        manga2.put("author","Crew Eastwood");
        manga2.put("year", 2021);

        manga.add(manga1);
        manga.add(manga2);

        library.put("manga",manga);

        try (FileWriter file = new FileWriter("src/LR10/Example2/example-json.json"))
        {
            file.write(library.toJSONString());
            System.out.println("Json файл создан.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
