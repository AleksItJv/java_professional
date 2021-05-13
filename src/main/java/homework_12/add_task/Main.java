package homework_12.add_task;

import homework_12.add_task.parser.Parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser.parserJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");

    }

}
/*Создайте классы Currency, Parser, Main
Подключиться к NBU API(https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json)
и вывести в консоль значения золота, фунта стерлингов и форинта.*/