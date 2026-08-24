public class Main {
    public static void main(String[] args) {
        final TextNode directNode = new DirectNode("This is");
        final TextNode proxyNode = new ProxyNode("a test.");
        System.out.println(directNode.get());
        System.out.println(proxyNode.get());
    }
}
