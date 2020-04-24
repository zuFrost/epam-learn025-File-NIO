package com.zufrost.learn;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseStringToData {
    public static void main(String[] args) {
        String stringData = "1970-01-01 00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(stringData, formatter);
        System.out.println(dateTime);
    }
}
