package homework_12.task3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import homework_12.task2.entity.CountryCity;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {

    public static void parseJson(String path) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        JsonReader jreader = new JsonReader(new FileReader(path));
        CountryCity sity = gson.fromJson(jreader, CountryCity.class);
        System.out.println(sity);

        String str = gson.toJson(sity);
        Files.write(Paths.get("D:\\JAVA\\java_professional\\src\\main\\resources\\GsonCountryCity.json"), str.getBytes(), StandardOpenOption.CREATE);
    }
}
