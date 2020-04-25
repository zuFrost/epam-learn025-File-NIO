package com.zufrost.learn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.lang.*;

public class ConvertToCustomFormat {
    public static void main(String[] args) {
        /**
         * Метод конвертирует дату в строку с заданным форматом
         *
         * @param localDate исходная дата
         * @param formatter формат даты
         * @return полученная строка
         */
    /*@Override
    public String convertToCustomFormat(LocalDate localDate, DateTimeFormatter formatter) {
        return null;
    }*/
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM yyyy dd"); //DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println( localDate.format(formatter));

    }


}
