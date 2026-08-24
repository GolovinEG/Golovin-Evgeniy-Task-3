public class JsonToRing implements DataToRing{
    private final DataToRing nextHandler;

    public JsonToRing() {
        this.nextHandler = null;
    }

    public JsonToRing(DataToRing nextHandler) {
        assert nextHandler != null : "nextHandler is null, use an empty constructor for the final handler";
        this.nextHandler = nextHandler;
    }

    @Override
    public Ring getRing(String data) {
        assert data != null : "Request data is null";
        data = data.trim();
        if (data.startsWith("{") && data.endsWith("}")) {
            final String material = readJsonStringValue(data, "material");
            final String gem = readJsonStringValue(data, "gem");
            return new Ring(material, gem);
        } else {
            if (nextHandler == null) {
                throw new RuntimeException("None of the handlers could process the request");
            }
            return nextHandler.getRing(data);
        }
    }

    private String readJsonStringValue(String json, String key) {
        int index = json.indexOf(String.format("\"%s\"", key)) + key.length() + 2;
        index = json.indexOf("\"", index) + 1;
        return json.substring(index, json.indexOf("\"", index)).trim();
    }
}
