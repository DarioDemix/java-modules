package org.demix.demo;

import org.demix.factory.PrinterFactory;
import org.demix.printer.Printer;
import static java.lang.System.*;

import java.util.Scanner;

public class Demo {

    private static final Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        PrinterFactory pf = new PrinterFactory();

        out.println("Write the type of printer you wanna use:");
        var printerType = scanner.nextLine();

        Printer p = pf.getPrinter(printerType);

        out.println("What do you want to print?");
        var message = scanner.nextLine();
        p.printMessage(message);

    }
}
