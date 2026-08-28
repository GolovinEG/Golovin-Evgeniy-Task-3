import java.util.List;

public class SplitterBySentence implements TextSplitter {
    private static final String NEW_LINE = "\n";
    private static final String ENDS = "[.?!]+";

    @Override
    public List<String> split(String text) {
        assert text != null : "text is null";
        text = text.replaceAll(NEW_LINE, " ");
        text = text.replaceAll(ENDS, "!");
        return List.of(text.split("!"));
    }
}