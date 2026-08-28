public class SpaceTrimDecorator extends PrinterDecorator {
    public SpaceTrimDecorator(Printer decoratedPrinter) {
        assert decoratedPrinter != null : "Assertion error in a constructor";
        this.decoratedPrinter = decoratedPrinter;
    }

    @Override
    public void print(String text) {
        text = text.trim();
        text = text.replaceAll(" {2,}", " ");
        text = text.replaceAll(" \n", "\n");
        text = text.replaceAll("\n ", "\n");
        decoratedPrinter.print(text);
    }
}
