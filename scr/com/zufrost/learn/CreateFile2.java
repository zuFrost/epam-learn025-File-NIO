package com.zufrost.learn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class CreateFile2 {
    public static void main(String[] args) {
        /**
         * Метод создает файл на диске с расширением txt
         *
         * @param path путь до нового файла
         * @param name имя файла
         * @return был ли создан файл
         */
        /*@Override
        public boolean createFile (String path, String name) {}*/

        String path = "testDirCreateFile";
        String name = "newFile.txt";
        System.out.println(new CreateFile2().createFile(path, name));

    }

    public boolean createFile(String path, String name) {
        ClassLoader classLoader = getClass().getClassLoader();
        // get URL for resource folder. ClassLoader help
        URL resource = classLoader.getResource(path);
        //folder in resource folder
        File file = new File(resource.getPath());
        try {
            FileWriter fileWriter = new FileWriter(file.getPath() + "/" + name); //folder + file name
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
