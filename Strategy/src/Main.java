public class Main {
    public static void main(String[] args) {
        final TextSplitter byWord = new SplitterByWord();
        final TextSplitter bySentence = new SplitterBySentence();
        final TextSplitter byNewLine = new SplitterByNewline();
        final String text = """
                This   text is
                used to.  Test the   TextSplitter?
                strategy... So  go !!!  on!
                """;
        System.out.println("--Split with byWord:");
        byWord.split(text).forEach(System.out::println);
        System.out.println("--Split with bySentence:");
        bySentence.split(text).forEach(System.out::println);
        System.out.println("--Split with byNewLine:");
        byNewLine.split(text).forEach(System.out::println);
    }
}
