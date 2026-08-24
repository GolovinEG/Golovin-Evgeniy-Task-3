public class XmlToRing implements DataToRing{
    private final DataToRing nextHandler;

    public XmlToRing() {
        this.nextHandler = null;
    }

    public XmlToRing(DataToRing nextHandler) {
        assert nextHandler != null : "nextHandler is null, use an empty constructor for the final handler";
        this.nextHandler = nextHandler;
    }

    @Override
    public Ring getRing(String data) {
        assert data != null : "Request data is null";
        data = data.trim();
        if (data.startsWith("<ring>") && data.endsWith("</ring>")) {
            final String material = readXmlStringValue(data, "material");
            final String gem = readXmlStringValue(data, "gem");
            return new Ring(material, gem);
        } else {
            if (nextHandler == null) {
                throw new RuntimeException("None of the handlers could process the request");
            }
            return nextHandler.getRing(data);
        }
    }

    private String readXmlStringValue(String xml, String key) {
        final int index = xml.indexOf(String.format("<%s>", key)) + key.length() + 2;
        return xml.substring(index, xml.indexOf(String.format("</%s>", key))).trim();
    }
}
