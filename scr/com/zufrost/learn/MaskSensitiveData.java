package com.zufrost.learn;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskSensitiveData {
    public static void main(String[] args) throws IOException {
        /**
         * Метод должен читать файл sensitive_data.txt (из директории resources) и маскировать в нем конфиденциальную информацию.
         * Номер счета должен содержать только первые 4 и последние 4 цифры (1234 **** **** 5678). Метод должен содержать регулярное
         * выражение для поиска счета.
         *
         * @return обработанный текст
         */
        /*@Override
        public String maskSensitiveData() {
            return null;
        }*/

//        File file = new  File("sensitive_data.txt"); //todo

        File file = new File("resources/testDirCountFiles/sensitive_data.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = reader.readLine();
        System.out.println(line);
        Pattern pattern  = Pattern.compile("(?<=\\d{4}\\s)((\\d{4}\\s\\d{4}))(?=\\s\\d{4})");
        Matcher matcher = pattern.matcher(line);
        String result = matcher.replaceAll("**** ****"); // строка с результатом (замена всего найденного на "/")
        System.out.println(result);



    }
}
