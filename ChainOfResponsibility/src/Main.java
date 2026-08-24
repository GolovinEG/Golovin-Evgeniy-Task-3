public class Main {
    public static void main(String[] args) {
        DataToRing dataToRing = new JsonToRing(new XmlToRing(new TextToRing()));
        String text = """
                {
                    "material": "silver",
                    "gem": "sapphire"
                }
                """;
        System.out.println(dataToRing.getRing(text));
        text = """
                <ring>
                    <material>gold</material>
                    <gem></gem>
                </ring>
                """;
        System.out.println(dataToRing.getRing(text));
        text = "bronze cobalt";
        System.out.println(dataToRing.getRing(text));
    }
}
