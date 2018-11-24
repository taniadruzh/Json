import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import java.io.*;

/**
 * Created by java on 24.11.2018.
 */
public class Main {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("country", "Germany");

        JSONObject capital = new JSONObject();
        capital.put("name", "Berlin");
        capital.put("population", 34000348);
        obj.put("capital", capital);

        obj.put("domen", "de");
        obj.put("population", 560500345);

        JSONArray list = new JSONArray();
        list.put("Hannover");
        list.put("Hamberg");
        list.put("Frankfurt");

        obj.put("cities", list);

        try (FileWriter file = new FileWriter("D:\\Misha\\secureProject\\conangRepa\\superStore\\Json\\src\\main\\resources\\d.json", true)) {

            file.write(obj.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);


        try (InputStream fis = new FileInputStream("D:\\Misha\\secureProject\\conangRepa\\superStore\\Json\\src\\main\\resources\\d.json");){
            JsonReader jsonReader = Json.createReader(fis);
            JsonObject jsonObject = jsonReader.readObject();
            JsonValue str = jsonObject.get("country");
            System.out.println();
            System.out.println(str.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
    }
