public class TextToRing implements DataToRing {
    private final DataToRing nextHandler;

    public TextToRing() {
        this.nextHandler = null;
    }

    public TextToRing(DataToRing nextHandler) {
        assert nextHandler != null : "nextHandler is null, use an empty constructor for the final handler";
        this.nextHandler = nextHandler;
    }

    @Override
    public Ring getRing(String data) {
        assert data != null : "Request data is null";
        data = data.trim();
        String[] splitData = data.split(" ");
        if (splitData.length == 2) {
            return new Ring(splitData[0], splitData[1]);
        } else {
            if (nextHandler == null) {
                throw new RuntimeException("None of the handlers could process the request");
            }
            return nextHandler.getRing(data);
        }
    }
}