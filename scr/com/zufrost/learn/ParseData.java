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
        /*@Override
        public String parseDate(LocalDate localDate) {
            return null;
        }*/
        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate.toString());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateString = localDate.format(formatter);
        System.out.println(dateString);

    }
}
