package com.zufrost.learn;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        /**
         * Метод создает файл на диске с расширением txt
         *
         * @param path путь до нового файла
         * @param name имя файла
         * @return был ли создан файл
         */
        /*@Override
        public boolean createFile(String path, String name) {
            return false;
        }*/

        String path = "testDirCreateFile";
        String fileName = "newFile.txt";
        // получаем разделитель пути в текущей операционной системе
        String fileSeparator = System.getProperty("file.separator");

        String relativePath = "tmp" + fileSeparator + "file.txt";


        File filePath = new File(path);
        filePath.mkdir();
        File file = new File(filePath + "\\" + fileName);
        try {
            file.createNewFile();
            if (file.exists()){
                System.out.println(true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
