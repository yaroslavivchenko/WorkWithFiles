package com.mainacad.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

    public static final String MAIN_DIR = System.getProperty("user.dir");
    public static final String SEP = System.getProperty("user.separator");
    public static final String FILES_DIR = MAIN_DIR + SEP + "files";

    // work with text
    public static void writeTextToFile(String text, String fileName){
        checkTargetDir();

        FileWriter fileWriter =null;
        try {
            FileWriter filewriter = new FileWriter(FILES_DIR + SEP + fileName);
            filewriter.write(text);
            filewriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void checkTargetDir() {
        File file = new File(FILES_DIR);
        if (!file.exists()) {
            file.mkdir();
        }
    }

    public static String writeTextFromFile(String fileName){
        String out = "";

        return out;    }

}
