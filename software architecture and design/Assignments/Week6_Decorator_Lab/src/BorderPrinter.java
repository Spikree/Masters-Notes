public class BorderPrinter extends PrinterDecorator {
    // TODO: Create a constructor that passes the wrapped printer to the base class
    public BorderPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public String print(String input) {
        // TODO: Add a border around the result of super.print(input)
        return "*** " + super.print(input) + " ***";
    }
}
