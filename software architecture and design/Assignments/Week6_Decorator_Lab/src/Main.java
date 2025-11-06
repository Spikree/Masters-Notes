public class Main {
    public static void main(String[] args) {
        // TODO: Create a BasicPrinter
        Printer printer = new BasicPrinter();

        // TODO: Wrap it with one or more decorators (e.g., UpperCasePrinter, BorderPrinter)
        printer = new UpperCasePrinter(printer);
        printer = new BorderPrinter(printer);
        printer = new HtmlPrinter(printer);
        printer = new TimestampPrinter(printer);

        // TODO: Print a sample string using the decorated printer
        System.out.println(printer.print("Hello decorator"));
    }
}
