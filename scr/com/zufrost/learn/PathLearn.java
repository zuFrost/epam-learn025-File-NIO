package com.zufrost.learn;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathLearn {
    public static void main(String[] args) {
        Path path1 = Paths.get("c/tmp/bitrixBackup");
        Path path2 = Paths.get("c:/tmp/bitrixBackup");
        Path path3 = Paths.get("c:\\tmp\\bitrixBackup");
        Path path4 = Paths.get("/home/tmp/bitrixBackup");
        Path path7= Paths.get(URI.create("file:///Users/joe/FileTest.java"));
        Path path5 = Paths.get("/tmp/foo");
//        Path path6 = Paths.get(args[0]);

        Path path8 = java.nio.file.FileSystems.getDefault().getPath("users/sally");

        //Получить конкретный элемент пути можно с помощью метода getName() :Получить конкретный элемент пути можно с помощью метода getName() :
//        System.out.println(path1.getName(0) + "/" +  path1.getName(1) + "/" +  path1.getName(2));
//        System.out.println(path6.getName(0));
//        System.out.println(path7.getName(0));
//        System.out.println(path8.getName(0));

        //Узнать количество элементов в пути можно с помощью метода getNameCount():
//        System.out.println(path1.getNameCount());
//        System.out.println(path2.getNameCount());
//        System.out.println(path3.getNameCount());
//        System.out.println(path4.getNameCount());

        //Можно получить путь родительской директории с помощью метода getParent() :
//        System.out.println(path1.getParent());
//        System.out.println(path2.getParent());
//        System.out.println(path3.getParent());
//        System.out.println(path4.getParent());
//        System.out.println(path7.getParent());

//        Можно получить корень пути с помощью метода getRoot() :
//        System.out.println(path1.getRoot());
//        System.out.println(path2.getRoot());
//        System.out.println(path3.getRoot());
//        System.out.println(path4.getRoot());
//        System.out.println(path7.getRoot());

        //С помощью метода toString()  можно получить путь в виде строки:
//        System.out.println(path1.toString());
//        System.out.println(path2.toString());
//        System.out.println(path3);
//        System.out.println(path4.toString());
//        System.out.println(path7.toString());

        Path pathWithPoint = Paths.get("/home/sandy/../jho/foo");
        System.out.println(pathWithPoint);
        System.out.println(pathWithPoint.normalize());
        System.out.println(pathWithPoint.normalize().toAbsolutePath());

    }
}
