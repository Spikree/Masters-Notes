public class UpperCasePrinter extends PrinterDecorator {
    // TODO: Create a constructor that passes the wrapped printer to the base class
    public UpperCasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public String print(String input) {
        // TODO: Convert the result of super.print(input) to uppercase
        return super.print(input).toUpperCase();
    }
}
