import java.util.List;

public class SplitterBySentence implements TextSplitter {
    @Override
    public List<String> split(String text) {
        assert text != null : "text is null";
        text = text.replaceAll("\n", " ");
        text = text.replaceAll("[.?!]+", "!");
        return List.of(text.split("!"));
    }
}