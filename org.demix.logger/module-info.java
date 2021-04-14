module org.demix.logger {
    requires java.logging;
    requires org.demix.printer;
    provides org.demix.printer.Printer with org.demix.logger.LoggerPrinter;
}