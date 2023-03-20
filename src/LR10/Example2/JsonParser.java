package LR10.Example2;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {
        public static void main(String[] args) {
            try {
                JSONParser parser = new JSONParser();
                Object obj = parser
                        .parse(new FileReader("src/LR10/Example2/example-json.json"));
                JSONObject jsonObject = (JSONObject) obj;
                System.out.println("Корневой элемент: "+jsonObject.keySet().iterator().next());
                JSONArray jsonArray = (JSONArray) jsonObject.get("manga");

                for (Object o: jsonArray)
                {
                    JSONObject manga = (JSONObject) o;
                    System.out.println("\nТекущий элемент: manga");
                    System.out.println("Название книги: "+manga.get("title"));
                    System.out.println("Автор: "+manga.get("author"));
                    System.out.println("Год издания: "+manga.get("year"));
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
