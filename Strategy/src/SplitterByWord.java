import java.util.List;

public class SplitterByWord implements TextSplitter {
    @Override
    public List<String> split(String text) {
        assert text != null : "text is null";
        if (text.isBlank()) {
            return List.of();
        }
        text = text.replaceAll("[.?!\n\t]", " ");
        text = text.replaceAll(" {2,}", " ");
        return List.of(text.split(" "));
    }
}