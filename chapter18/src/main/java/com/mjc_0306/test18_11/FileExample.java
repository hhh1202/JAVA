package com.mjc_0306.test18_11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/Temp/images");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");

        if(dir.exists() == false) {dir.mkdir();}
        if(file1.exists() == false) {file1.createNewFile();}
        if(file2.exists() == false) {file2.createNewFile();}
        if(file3.exists() == false) {file3.createNewFile();}

        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }

        System.out.println();
        try {
            String data = "" +
                    "id: winter\n" +
                    "email: winter@mycompany.com\n" +
                    "tel: 010-123-1234";

            Path path = Paths.get("C:/Temp/user.txt");

            Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));

            System.out.println("파일 유형: " + Files.probeContentType(path));
            System.out.println("파일 크기: " + Files.size(path) + "bytes");

            String content = Files.readString(path, Charset.forName("UTF-8"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
