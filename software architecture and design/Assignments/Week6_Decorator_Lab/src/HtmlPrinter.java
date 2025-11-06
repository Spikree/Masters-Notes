public class HtmlPrinter extends PrinterDecorator {
    // TODO: Create a constructor that passes the wrapped printer to the base class
    public HtmlPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public String print(String input) {
        // TODO: Wrap the result of super.print(input) in basic HTML tags
        return "<html><body><p>" + super.print(input) + "</p></body></html>";
    }
}
