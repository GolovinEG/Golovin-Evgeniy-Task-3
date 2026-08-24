public class Main {
    public static void main(String[] args) {
        final String text = """
                  sPAceS   wilL BE  triMmEd.     
                PUNCtutiOn   WiLL  be KepT?  
                  CaSE    wIll be   senTENCE... 
                 NULL   is  chEckEd!  EnD
                """;
        final Printer basicPrinter = new BasicPrinter();
        final Printer sentenceCasePrinter = new SentenceCaseDecorator(basicPrinter);
        final Printer spaceTrimPrinter = new SpaceTrimDecorator(sentenceCasePrinter);
        final Printer completePrinter = new NullCheckDecorator(spaceTrimPrinter);
        completePrinter.print(text);
    }
}
