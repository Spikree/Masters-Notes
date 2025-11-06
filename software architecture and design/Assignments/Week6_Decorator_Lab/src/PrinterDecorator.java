public abstract class PrinterDecorator implements Printer {
    // TODO: Declare a protected Printer field to wrap
    protected Printer printer;

    // TODO: Create a constructor that accepts a Printer and assigns it to the field
    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print(String input) {
        // TODO: Delegate to the wrapped printer
        return printer.print(input);
    }
}
