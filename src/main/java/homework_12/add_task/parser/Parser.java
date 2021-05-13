package homework_12.add_task.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import homework_12.add_task.entity.Currency;

import java.io.IOException;
import java.net.URL;

public class Parser {

    public static void parserJson(String url) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Currency[] currencys = objectMapper.readValue(new URL(url), Currency[].class);
        for (Currency currency : currencys) {
            if (currency.getNameCurrency().equals("Золото")) {
                System.out.println(currency);
            }
            if (currency.getNameCurrency().equals("Фунт стерлінгів")) {
                System.out.println(currency);
            }
            if (currency.getNameCurrency().equals("Форинт")) {
                System.out.println(currency);
            }

        }

/*
        String str = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(currencys);
        Files.write(Paths.get("D:\\JAVA\\java_professional\\src\\main\\resources\\currence.json"), str.getBytes(), StandardOpenOption.CREATE);
*/

    }
}
