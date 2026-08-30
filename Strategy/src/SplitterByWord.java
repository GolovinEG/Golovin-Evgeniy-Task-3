import java.util.List;

public class SplitterByWord implements TextSplitter {
    private static final String ENDS = "[.?!\n\t]";
    private static final String MULTIPLE_SPACES = " {2,}";

    @Override
    public List<String> split(String text) {
        assert text != null : "text is null";
        if (text.isBlank()) {
            return List.of();
        }
        text = text.replaceAll(ENDS, " ");
        text = text.replaceAll(MULTIPLE_SPACES, " ");
        return List.of(text.split(" "));
    }
}