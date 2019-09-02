package com.epam.vladislav_sharachev.java.lesson5.taskNew;

import java.io.File;
import java.util.*;

public class Searcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userURI;

        userURI = scanner.nextLine();
        File dir = new File(userURI);
        Map<String, Long> hashMap = new HashMap<>();

        addFilesToList(dir, hashMap);

/*        System.out.println(hashMap.size());
        System.out.println(hashMap);*/
    }

    private static void addFilesToList(File dir, Map<String, Long> files) {
        for (File file : Objects.requireNonNull(dir.listFiles()))
        {
            if (file.isDirectory()) {
                addFilesToList(file, files);
            } else {
                files.put(file.getAbsolutePath(), file.length());
            }
        }
    }
}