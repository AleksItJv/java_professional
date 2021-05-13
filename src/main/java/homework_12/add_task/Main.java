package homework_12.add_task;

import homework_12.add_task.parser.Parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser.parserJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");

    }

}