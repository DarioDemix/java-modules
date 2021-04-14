package org.demix.filewriter;

import org.demix.printer.Printer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import static java.lang.System.*;

public class FileWriter implements Printer {

    private final String outputFilePath;

    public FileWriter() {
        outputFilePath = Path.of("E:", "java-modules", "out", "yourMessage.txt").toString();
    }

    @Override
    public void printMessage(String message) {
        try(var fos = new FileOutputStream(outputFilePath)) {
            byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
            out.printf("File wrote under %s%n", outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getType() {
        return "file";
    }
}
