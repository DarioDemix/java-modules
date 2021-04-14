package org.demix.logger;

import org.demix.printer.Printer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerPrinter implements Printer {

    Logger logger;

    public LoggerPrinter() {
        logger = Logger.getLogger(LoggerPrinter.class.getName());
    }

    @Override
    public void printMessage(String message) {
        logger.log(Level.INFO, message);
    }

    @Override
    public String getType() {
        return "logger";
    }
}
