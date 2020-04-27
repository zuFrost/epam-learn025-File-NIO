package com.zufrost.learn;

import java.io.File;

public class CountFilesInDirectory {
    public static void main(String[] args) {
        /**
         * Метод рекурсивно подсчитывает количество файлов в директории
         *
         * @param path путь до директори
         * @return файлов, в том числе скрытых
         */
        /*@Override
        public long countFilesInDirectory(String path) {}*/

        String path = "testDirCountFiles";

        class FileCounter {
            private long fileCount = 0;
            public long scanCount(File file) {
//                System.out.println("файл " + file + " существует " + file.exists());
                if (!file.exists()) {
//                    System.out.println("файл " + file + " not exist");
                    return 0;
                }

                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
//                    System.out.println(files[i]);
                    if (files[i].isDirectory()) {
//                        System.out.println(files[i].getPath());
//                        this.scanCount(files[i].getPath());
                        this.scanCount(new File(files[i].getPath()));
                    } else {
                        fileCount++;
                    }
                }
                return fileCount;
            }
        }


        ClassLoader classLoader = CountDirsInDirectory.class.getClassLoader();
        File file = new File(classLoader.getResource(path).getPath());
//        System.out.println("путь " + file.getPath());

        if (path != null ) {
            System.out.println(new FileCounter().scanCount(file));
        } else {
//            return 0;
        }


    }
}
