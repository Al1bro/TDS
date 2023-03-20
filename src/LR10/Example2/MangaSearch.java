package LR10.Example2;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Scanner;

public class MangaSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/LR10/Example2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "+jsonObject.keySet().iterator().next());
            System.out.println("Введите автора: ");
            String author = in.nextLine();
            JSONArray jsonArray = (JSONArray) jsonObject.get("manga");
            for (Object o: jsonArray)
            {
                JSONObject manga = (JSONObject) o;
                jsonArray.stream().filter(manga1 -> manga1 instanceof JSONObject)
                        .map(manga1 -> (JSONObject) manga)
                        .filter(manga1 -> author.equals(manga.get("author")))
                        .forEach(manga1->{
                            System.out.println("\nТекущий элемент: manga");
                            System.out.println("Название книги: " + manga.get("title"));
                            System.out.println("Автор: " + manga.get("author"));
                            System.out.println("Год издания: " + manga.get("year"));
                        });
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
