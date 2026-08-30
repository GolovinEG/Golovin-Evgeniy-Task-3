public class ProxyNode implements TextNode {
    private final TextNode directNode;

    public ProxyNode(String text) {
        assert text != null : "text is null";
        directNode = new DirectNode(text);
    }

    @Override
    public String get() {
        System.out.println("Getting text through ProxyNode");
        return directNode.get();
    }
}