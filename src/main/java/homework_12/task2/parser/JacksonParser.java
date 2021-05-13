package homework_12.task2.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import homework_12.task2.entity.CountryCity;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser {
    public static void jacksonParser(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        CountryCity city = null;
        try {
            city = objectMapper.readValue(new File(path), CountryCity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String cityStr = objectMapper.writeValueAsString(city);
        Files.write(Paths.get("D:\\JAVA\\java_professional\\src\\main\\resources\\JacksonCountryCity.json"), cityStr.getBytes(), StandardOpenOption.CREATE);
        System.out.println(city);
    }
}