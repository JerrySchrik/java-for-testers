package com.serenitydojo.exceptions;

import io.vavr.control.Try;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileLoader {
    public String readHelloWorld() throws IOException {
            return Files.readString(Paths.get("src/main/resources/hello.txt"));
        }

    public Boolean fileContainsText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        try {
           return Files.readString(Paths.get(path)).contains(expectedText);
        } catch (IOException error) {
            return false;
        }
    }

    public Boolean fileHasText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        return null;// (Files.readString(Paths.get(path)).contains(expectedText));
    }
}
