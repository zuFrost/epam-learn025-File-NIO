package com.zufrost.learn;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneOffset;

public class GetSecondsInYear {
    public static void main(String[] args) { //TODO
        /**
         * Метод считает число секунд в заданном году
         *
         * @return число секунд
         */
        int year = 2020;
        Year yearFrom = Year.of(year);
        System.out.println("считаем количество секунд в промежутке между " + yearFrom + " годом и " + yearFrom.plusYears(1) + " годом");
        LocalDateTime startTime = LocalDateTime.of(year, 1, 1, 0, 0, 0);
        LocalDateTime finishTime = startTime.plusYears(1);
//        LocalDateTime finishTime = LocalDateTime.of(year, 12, 31, 23, 59, 59);
        long secondsFromEpochToStart = finishTime.toEpochSecond(ZoneOffset.of("Z")) - startTime.toEpochSecond(ZoneOffset.of("Z"));
        System.out.println(secondsFromEpochToStart);


    }
}
