package com.zufrost.learn;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllBytes;

public class FileReader {
    public static void main(String[] args) throws IOException {
        /**
         * Метод считывает тело файла .txt из папки src/main/resources
         *
         * @param fileName имя файла
         * @return контент
         */
        /*@Override
        public String readFileFromResources(String fileName) {
            return null;
        }*/

        String fileName = "readme.txt";
        String catalogName = "/tmp/";
//        String catalogName = "/resources/";
        String targetString = null;

        //проверка на наличие файла
//        File file = new File(catalogName + "/" + fileName);
        File file = new File(catalogName + fileName);
        System.out.println(file.exists());

        BufferedReader reader = new BufferedReader( new java.io.FileReader(catalogName + fileName));
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while ((targetString = reader.readLine()) != null) {
            stringBuilder.append(targetString);
            stringBuilder.append(ls);
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        System.out.println(stringBuilder.toString());

        // read using Files
        String targetString2 = null;
        String targetString3 = new  String (readAllBytes(Paths.get(catalogName + fileName)));

        System.out.println(targetString3);

    }
}
