package com.zufrost.learn;

import java.time.Year;

public class GetNextLeapYear {
    public static void main(String[] args) {
        /**
         * Метод получает следующий високосный год
         *
         * @return високосный год
         */
        /*@Override
        public long getNextLeapYear() {
            return 0;
        }*/

        Year year = Year.now();
        do {
            year = year.plusYears(1);
            System.out.println("работаем с " + year + " годом");
            if (year.isLeap()) {
                System.out.println(year.toString());
                break;
            }
        } while (true);
    }
}
