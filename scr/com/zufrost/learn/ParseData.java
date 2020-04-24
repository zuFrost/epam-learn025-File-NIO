package com.zufrost.learn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseData {
    public static void main(String[] args) {
        /**
         * Метод парсит дату в строку
         *
         * @param localDate дата
         * @return строка с форматом день-месяц-год(01-01-1970)
         */
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(localDate.format(formatter));

    }
}
