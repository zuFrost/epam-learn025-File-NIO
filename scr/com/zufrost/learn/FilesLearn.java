package com.zufrost.learn;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.stream.Stream;

public class FilesLearn {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/tmp/bitrixBackup/20200326_125703_16009008.enc.gz.1");
        Path path2 = Paths.get("c:/tmp/bitrixBackup/20200326_125703_16009008.enc.gz.1");
        Path path3 = Paths.get("c:\\tmp\\bitrixBackup");
        Path path4 = Paths.get("/home/tmp/bitrixBackup");
        Path path7 = Paths.get(URI.create("file:///Users/joe/FileTest.java"));

        //Проверить существование пути Path  можно с помощью методов: Files.exists  notExists
//        System.out.println(Files.exists(path1));
//        System.out.println(Files.exists(path2));
//        System.out.println(Files.notExists(path2));

        //Проверка доступа к файлу осуществляется с помощью методов: isReadable isWritable isExecutable
//        System.out.println(Files.isReadable(path2));
//        System.out.println(Files.isWritable(path2));
//        System.out.println(Files.isExecutable(path2));

        //Один и тот же файл isSameFile(Path path,
        //                                 Path path2)
        //                          throws IOException
//         path1 = Paths.get("/tmp/bitrixBackup/20200326_125703_16009008.enc.gz.1");
//         path2 = Paths.get("c:/tmp/bitrixBackup/20200326_125703_16009008.enc.gz.1");
//        System.out.println(Files.isSameFile(path1, path2));

        //Удаление файла или каталога Метод delete(Path)  удаляет файл или бросает исключение, если удалить файл не удалось. Можно удалять каталог, но только если он пустой.
//        path1 = Paths.get("C:\\tmp\\hitachi_bootable\\3_FT217b2\\Hitachichi.lvclk");
//        path2 = Paths.get("c:/tmp/bitrixBackup/20200326_125703_16009008.enc.gz.1");
//        Files.delete(path1);
//        Files.deleteIfExists(path1);

        //Копирование файла или каталога
//        Можно копировать файл или каталог с помощью метода copy(Path, Path, CopyOption...) ,
//        но имейте в виду, что файлы внутри каталога не копируются этим методом.
//        Метод принимает константы CopyOption:
//         path1 = Paths.get("/tmp/bitrixBackup/20200326_125703_16009008.enc.gz.1");
//         path1 = Paths.get("/tmp/bitrixBackup/");
        path2 = Paths.get("C:\\tmp\\hitachi_bootable\\3_FT217b2\\bitrixBackup");
//        System.out.println(Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES));
//        System.out.println(Files.size(path1));
//        System.out.println(Files.getLastModifiedTime(path1));
//        System.out.println(Files.getOwner(path1));
        path1 = Paths.get("/tmp/bitrixBackup");

//        try (Stream<Path> files = Files.list(Paths.get("/tmp/bitrixBackup"))) {

        /*try (Stream<Path> files = Files.list(path1)) {
            long count = files.count();
            System.out.println(count);
        }
        Stream<Path> files2 = Files.list(path1);
        System.out.println(files2);*/

        class FileScan {
            private int count;

            public int scan(String path) {
                File filePath = new File(path);
                File[] filesArray = filePath.listFiles();
                for (int i = 0; i < filesArray.length; i++) {
                    if (!filesArray[i].isDirectory()) {
                        count++;
                    } else if (filesArray[i].isDirectory()) {
                        scan(filesArray[i].getPath());
                    }
                }
             return count;
            }
        }

        FileScan fileScan = new FileScan();
        System.out.print("результат равен ");
        System.out.println(fileScan.scan("c:/tmp/bitrixBackup"));
        System.out.println("результат равен ");





    }
}
