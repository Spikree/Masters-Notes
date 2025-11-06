import java.time.LocalDateTime;

public class TimestampPrinter extends PrinterDecorator {
    // TODO: Create a constructor that passes the wrapped printer to the base class
    public TimestampPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public String print(String input) {
        // TODO: Prepend the current timestamp to the result of super.print(input)
        String timestamp = "[" + LocalDateTime.now().toString() + "]";
        return timestamp + " " + super.print(input);
    }
}
