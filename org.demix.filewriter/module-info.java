import org.demix.filewriter.FileWriter;
import org.demix.printer.Printer;

module org.demix.filewriter {
    requires org.demix.printer;
    provides Printer with FileWriter;
}