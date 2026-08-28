import java.util.List;

public class SplitterByNewline implements TextSplitter {
    @Override
    public List<String> split(String text) {
        assert text != null : "text is null";
        return List.of(text.split("\n"));
    }
}