public class NullCheckDecorator extends PrinterDecorator {
    public NullCheckDecorator(Printer decoratedPrinter) {
        assert decoratedPrinter != null : "Assertion error in a constructor";
        this.decoratedPrinter = decoratedPrinter;
    }

    @Override
    public void print(String text) {
        assert text != null : "Assertion error in NullCheckDecorator";
        decoratedPrinter.print(text);
    }
}