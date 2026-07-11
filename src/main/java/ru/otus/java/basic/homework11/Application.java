package ru.otus.java.basic.homework11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(getFileList(""));
        System.out.println("Введите название файла");
        String fileName = scanner.nextLine();
        System.out.println("Текст из файла: ");
        System.out.println(readFileByBlock(fileName));
        System.out.println("Введите текст:");
        String info = scanner.nextLine();
        System.out.println(writeFileByBlock(fileName, info) ? "Значение записано в файл" : "Значение не записано на файл");
        System.out.println("Содержимое файла");
        System.out.println(readFileByBlock(fileName));


    }

    public static String getFileList(String pathname) {
        File dir = new File(pathname);
        File[] files = dir.listFiles();
        String fileList = null;
        if (files != null) {
            for (File file : files) {
                fileList += file.getName() + " " + (file.isFile() ? "файл" : "дир");
                fileList += "\n";
            }
        }
        return fileList;
    }

    public static String readFileByBlock(String pathname) {
        String fileContent = null;
        try (FileInputStream in = new FileInputStream(pathname)) {
            byte[] buf = new byte[128];
            int n = in.read(buf);
            while (n > 0) {
                fileContent = new String(buf, 0, n);
                n = in.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    public static boolean writeFileByBlock(String pathname, String info) {
        try (FileOutputStream out = new FileOutputStream(pathname)) {

            byte[] buffer = info.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
