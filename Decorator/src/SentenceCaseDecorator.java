public class SentenceCaseDecorator extends PrinterDecorator{
    private static final String ENDS = ".!?";
    private static final String LETTERS = "abcdefghijklmnopqrstvuwxyz";

    public SentenceCaseDecorator(Printer decoratedPrinter) {
        assert decoratedPrinter != null : "Assertion error in a constructor";
        this.decoratedPrinter = decoratedPrinter;
    }

    @Override
    public void print(String text) {
        final char[] charArray = text.toLowerCase().toCharArray();
        boolean isSentenceStart = true;
        for (int i = 0; i < charArray.length; i++) {
            final char character = charArray[i];
            if (isSentenceStart) {
                if (LETTERS.indexOf(character) != -1) {
                    charArray[i] = Character.toUpperCase(character);
                    isSentenceStart = false;
                }
            } else if (ENDS.indexOf(character) != -1) {
                isSentenceStart = true;
            }
        }
        decoratedPrinter.print(new String(charArray));
    }
}
