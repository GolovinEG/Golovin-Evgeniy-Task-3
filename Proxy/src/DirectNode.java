public class DirectNode implements TextNode{
    private final String text;

    public DirectNode(String text) {
        assert text != null : "text is null";
        this.text = text;
    }

    @Override
    public String get() {
        return text;
    }
}
