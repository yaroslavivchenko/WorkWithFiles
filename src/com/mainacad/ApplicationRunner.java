package com.mainacad;

import com.mainacad.service.FileService;

import java.util.logging.Logger;

public class ApplicationRunner {


    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());


    public static void main(String[] args) {

        String text = "Some new text\nI wanted to be written\n";

        FileService.writeTextToFile(text, "text.txt");
        String inputText = FileService.readTextFromFile("text.txt");
        
        LOGGER.info("\n" + inputText);
    }
}
