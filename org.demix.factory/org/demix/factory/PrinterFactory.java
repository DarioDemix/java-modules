package org.demix.factory;

import org.demix.printer.Printer;

import java.util.ServiceLoader;

public class PrinterFactory {
    public Printer getPrinter(String printerType) {
        ServiceLoader<Printer> serviceLoader = ServiceLoader.load(Printer.class);

        for (var printer: serviceLoader) {
            if (printer.getType().equalsIgnoreCase(printerType)) {
                return printer;
            }
        }
        throw new IllegalArgumentException("Printer not fount with type " + printerType);
    }
}
