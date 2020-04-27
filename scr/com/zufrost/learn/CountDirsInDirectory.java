package com.zufrost.learn;

import java.io.File;

public class CountDirsInDirectory {


    public static void main(String[] args) {
        /**
         * Метод рекурсивно подсчитывает количество папок в директории, считая корень
         *
         * @param path путь до директории
         * @return число папок
         */
        /*@Override
        public long countDirsInDirectory(String path) {
            return 0;
        }*/

        String path = "testDirCountFiles";

        class DirCounter {
            private long dirCount = 1;
            public long scanCount(File file) {
//                System.out.println("файл " + file + " существует " + file.exists());
                if (!file.exists()) {
//                    System.out.println("файл " + file + " not exist");
                    return 0;
                }

                File[] dirs = file.listFiles();
                for (int i = 0; i < dirs.length; i++) {
//                    System.out.println(dirs[i]);
                    if (dirs[i].isDirectory()) {
                        dirCount++;
//                        System.out.println(dirs[i].getPath());
//                        this.scanCount(dirs[i].getPath());
                        this.scanCount(new File(dirs[i].getPath()));
                    }
                }
                return dirCount;
            }
        }


        ClassLoader classLoader = CountDirsInDirectory.class.getClassLoader();
        File file = new File(classLoader.getResource(path).getPath());
//        System.out.println("путь " + file.getPath());

        if (path != null ) {
            System.out.println(new DirCounter().scanCount(file));
        } else {
//            return 0;
        }



    }
}
