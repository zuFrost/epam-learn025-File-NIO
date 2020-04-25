package com.zufrost.learn;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
        String file = "sensitive_data.txt";
        List<String> lines = Files.readAllLines(Paths.get(file));



    }
}
