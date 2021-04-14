import org.demix.printer.Printer;

module org.demix.factory {
    requires org.demix.printer;
    exports org.demix.factory to org.demix.demo;
    uses Printer;
}