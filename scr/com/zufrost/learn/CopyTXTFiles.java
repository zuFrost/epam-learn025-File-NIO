package com.zufrost.learn;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyTXTFiles {
    public static void main(String[] args) {
        /**
         * Метод копирует все файлы с расширением .txt
         *
         * @param from путь откуда
         * @param to   путь куда
         */
        /*@Override
        public void copyTXTFiles(String from, String to) {
            return;
        }*/
        String from = "resources/testDirCountFiles/dir1/dir11";
        String to = "resources/testDirCountFiles/dir4";


        try {
            Files.copy(new File(from).toPath(), new File(to).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
