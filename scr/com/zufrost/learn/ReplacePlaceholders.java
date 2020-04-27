package com.zufrost.learn;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacePlaceholders {
    public static void main(String[] args) {
        /**
         * Метод должен считыввать файл sensitive_data.txt (из директории resources) и заменять плейсхолдер ${payment_amount} и ${balance} на заданные числа. Метод должен
         * содержать регулярное выражение для поиска плейсхолдеров
         *
         * @return обработанный текст
         */
        /*@Override
        public String replacePlaceholders(double paymentAmount, double balance) {
            return null;
        }*/
//        File file = new File("resources/testDirCountFiles/sensitive_data.txt");

        double paymentAmount = 123D;
        double balance = 3_001D;

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("resources/testDirCountFiles/sensitive_data.txt"))));
            String line = reader.readLine();
            System.out.println(line);
            Pattern pattern  = Pattern.compile("(\\$\\{payment_amount\\})");
            Matcher matcher = pattern.matcher(line);
            String result = matcher.replaceAll(String.valueOf(paymentAmount));

            pattern  = Pattern.compile("(\\$\\{balance\\})");
            matcher = pattern.matcher(result);
            result = matcher.replaceAll(String.valueOf(balance));

            System.out.println(result);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
