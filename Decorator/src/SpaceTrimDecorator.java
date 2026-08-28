public class SpaceTrimDecorator extends PrinterDecorator {
    private static final String MULTIPLE_SPACES = " {2,}";
    private static final String SPACE_AND_NEWLINE = " ?\n ?";

    public SpaceTrimDecorator(Printer decoratedPrinter) {
        assert decoratedPrinter != null : "Assertion error in a constructor";
        this.decoratedPrinter = decoratedPrinter;
    }

    @Override
    public void print(String text) {
        text = text.trim();
        text = text.replaceAll(MULTIPLE_SPACES, " ");
        text = text.replaceAll(SPACE_AND_NEWLINE, "\n");
        decoratedPrinter.print(text);
    }
}
